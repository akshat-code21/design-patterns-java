# Flyweight separates an object into:
• Intrinsic state (shared): immutable, identical across many instances (e.g., BulletType
sprite, TileType texture & collision rules, TreeType mesh & material).

• Extrinsic state (per-instance): unique, stored outside the flyweight (position, rotation,
velocity, lifetime, owner, current animation frame).


# Things similar to what we do in Flyweight:

• **Object Pool:** orthogonal; pool reduces allocation churn, flyweight reduces per-instance
size.

• **Prototype:** cloning for new instances; with flyweight you clone/extract only extrinsic
data, not heavy intrinsic parts.

• **Singleton/Service Locator:** sometimes used for the flyweight factory, but prefer explicit
factories for testability.

# Use Flyweight when:
• You have large numbers of objects from a small catalog of types.
• Intrinsic state is big and immutable, and per-instance state is small.
• Memory and cache locality matter (they always do in games).

# Avoid (or limit) Flyweight when:
• Each instance has unique heavy data (e.g., a unique mesh per hero).
• Intrinsic(lightweight) state must mutate per instance (then it’s not intrinsic).
• The catalog of types is as large as the number of instances (no sharing benefit).