# Context :
We have an ITextParser interface with methods such as:
• getWordCount()
• getSentenceCount()
• searchWord(word)
• searchRootWord(word)

The concrete implementation BookParser takes a book (string) in its constructor and immediately performs heavy work:

• Parsing the entire text
• POS tagging
• Storing structures in vectors and XML trees

**This constructor is very expensive.**
**Client1**. Client1 depends on an ITextParser, injected via its constructor. It has 5 methods, but only 3 of them need the parser. The other 2 don’t use it at all.
**Client2**. Client2 needs to use Client1. However, even if Client2 never calls the methods
that rely on the parser, the BookParser is still eagerly constructed during Client1’s creation.
This wastes time and resources (unnecessary eager loading). Client2 is blocked waiting for the heavy constructor.

--
## Solution 1: To do lazy loading instead of eager loading
We can avoid constructing the `BookParser` object in the constructor of `Client1`. We can do this:

```
if ( parser == null ) parser = new BookParser ( book ) ;
```

But this solution is not correct. It violates multiple principles.

- **Violates SRP (Single Repository)**: Client1 now does two things: its own logic + managing lifecycle of the parser.
- **Violates OCP (Open/Close)**: Every new parser using method must repeat the "if null then create" logic.
- **Violates DIP (Dependency Inversion)**: The client is tied to the BookParser constructor; no easy swap of other ITextParser implementations.
- **Duplication and clutter**: Null-check logic is scattered across all parser-using methods.
- **Encapsulation leak**: Client code is burdened with decisions about when to construct dependencies — this should not be its responsibility.

In general, clients should not perform resource-checking and initialization logic for dependencies. They should just rely on an abstraction and expect it to behave correctly.

## Proxy as the solution
--
Instead of pushing lazy loading into the client, we introduce a Proxy object that implements the same ITextParser interface.
• The proxy stores the book text but does not create the heavy BookParser immediately.
• On the first actual method call (e.g., getWordCount()), the proxy constructs the real BookParser and delegates.
• All subsequent calls go directly to the cached real parser.

--
# Benefits
• Clients stay clean. Client1 just uses ITextParser, unaware of lazy loading.
• Lazy loading guaranteed. Parser only constructed if needed.
• Preserves SOLID.
– SRP: Client1 no longer manages parser lifecycle.
– OCP: New parser-using methods need no special code.
– DIP: Clients depend only on abstraction.
• Substitutability. Proxy and RealSubject share the same interface; clients don’t care which they get.


# Is Proxy Same as Decorator ?

No. Both wrap another object and forward calls, but:
• Decorator adds new behavior/responsibilities.
• Proxy controls access or optimizes interaction with the real subject.

# Couldn’t I just use Adapter?

Adapter changes the interface to make two classes work together. Proxy keeps the
same interface but inserts control logic.

# Use when:
• Object is expensive to create or load (virtual).
• Object lives remotely (remote proxy).
• Object needs access control (protection proxy).
• You need housekeeping logic on access (smart reference).


# Avoid when:
• Indirection overhead is unacceptable.
• You actually want to extend behavior, not just control access (use Decorator instead).