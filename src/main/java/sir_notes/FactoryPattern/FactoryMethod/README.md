After Simple Factory, we have a requirement to create different policies/algorithms for creating different type of stones (Stones spawned randomly, Stones spawned equally etc.)

To solve this, we use Factory Methods. Our aim was to keep `generateWave()` same and swap only the **stone-selection policy**

## Put the fixed algorithm in a base creator (e.g., StoneSpawner). Inside that algorithm, call an overridable factory method createStone() that subclasses implement differently (random vs equalized).

## Comparison: Simple Factory vs. Factory Method
• Simple Factory: a single static function centralizes “new”. Good when you only need
“make me a stone of type X.” (No per-instance policy.)

• Factory Method: a base class owns the algorithm; subclasses decide which concrete product
to instantiate by overriding a factory method. Ideal when policy varies per creator
instance.

## When to choose which: 
• Use Simple Factory when you just want a single, clean place to create a product and hide
constructors.

• Use Factory Method when a superclass algorithm must create an object at one step
and the concrete product (or selection policy) varies per subclass.