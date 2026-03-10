package sir_notes.BuilderPattern;

/*
Intent of Builder: Simplify the creation of complex immutable objects by separating construction from representation.

Use cases: Classes with many parameters (some optional), configuration
objects, constructing immutable aggregates.

So, we move to telescopic constructors to solve the problem.
 */
//public class Order {
//    private final String customerId;
//    private final int priority;
//    private final boolean giftWrap;
//    private final boolean expressDelivery;
//
//    public Order(String customerId, int priority,
//                 boolean giftWrap, boolean
//                         expressDelivery) {
//        this.customerId = customerId;
//        this.priority = priority;
//        this.giftWrap = giftWrap;
//        this.expressDelivery = expressDelivery;
//    }
//}

/*
Problem of Telescopic Constructors: Hard to read, hard to maintain, confusing for callers.

So we create a separate Builder class that sets fields step by step, then calls build(). This makes object creation cleaner.
 */

public class Order {
    private final String customerId;
    private final int priority;
    private final boolean giftWrap;
    private final boolean expressDelivery;

    private Order(Builder b) {
        this.customerId = b.customerId;
        this.priority = b.priority;
        this.giftWrap = b.giftWrap;
        this.expressDelivery = b.expressDelivery;
    }

    private static class Builder {
        private String customerId;
        private int priority = 1;
        private boolean giftWrap = false;
        private boolean expressDelivery = false;

        public Builder setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder setPriority(int priority) {
            this.priority = priority;
            return this;
        }

        public Builder setGiftWrap(boolean giftWrap) {
            this.giftWrap = giftWrap;
            return this;
        }

        public Builder setExpressDelivery(boolean expressDelivery) {
            this.expressDelivery = expressDelivery;
            return this;
        }

        public Order build(){
            if ( customerId == null ) throw new IllegalStateException ("customerId required") ;
            return new Order(this);
        }
    }
}

/*
Usage:

Order order = new Order.Builder().setCustomerId("id123).setPriority(2).setExpressDelivery(false).setGiftWrap(true).build();

-> We can make particular fields required like customerId like this:

private final String customerId ; // required
public Builder ( String customerId ) {
    this . customerId = Objects . requireNonNull (
    customerId ) ;
}

=> NOTE: We need to do defensive copying of lists in this as well.
 */


