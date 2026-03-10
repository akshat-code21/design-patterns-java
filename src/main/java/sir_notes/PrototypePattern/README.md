# Why do we need Prototype ?

We need the Prototype pattern primarily when creating a new instance of a class is too expensive, complicated, or resource-intensive
. Instead of constructing a "fully wired" object from scratch—which might involve heavy work like loading styles, adding handles, or attaching constraints—we can simply copy an existing "exemplar" instance

# Insight:

Keep one configured exemplar per shape type. To create a new instance, clone the exemplar.
Keep those exemplars in a registry (a small in-memory catalog) so tools and frameworks can
request clones by key.

# Why this helps:

- Clients create instances by cloning a configured exemplar; they need no knowledge of constructor details.
- Fewer subclasses: many variations become different registered prototypes rather than new classes.
- The registry lets you add/remove shapes at runtime and inspect what is available.
- Dynamically loaded features can self-register a prototype on load.

# When Prototype vs Factories:

- Use Prototype when construction is expensive, when objects are better created “by example,” or when the set of creatable products changes at runtime.
- Use Factory Method when you have a fixed algorithm that needs to create objects at one step, and the concrete product varies by subclass of the creator.
- Use Abstract Factory when you must create families of related objects that should be kept consistent.
- You can implement an abstract factory using a registry of prototypes: each creation method returns a clone from the registry.