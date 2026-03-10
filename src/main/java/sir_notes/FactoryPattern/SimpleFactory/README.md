Using simple factory, we have:

- Hidden concrete classes from callers (we would have to do `new` everywhere to create stones)
- We have only one edit point for adding a new `Stone` size.


# Pros:
- Centralizes "new", hides concretes, one edit point for new sizes.

# Cons:
- Factory will grow into a big switch-case
- No support for differing policies (random/equalized)

## Simple Factory is perfect when you want a clean place to create a single kind of product and hide constructors. Now suppose the creation policy must vary per game instance.

---

