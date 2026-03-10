package sir_notes.BuilderPattern.ImmutableClasses;

/*
    this is an immutable class (the properties of the object after creation should not change)

    For immutable data types, we can just assign it to our data members, but for mutable data types like List , we need to implement defensive copying.
 */
import java.time.Instant;

public final class PaymentReceipt {
    private final String id;
    private final double amount;
    private final Instant timestamp;
    public PaymentReceipt(String id, double amount,Instant timestamp){
        if(id == null || id.isBlank()) throw new IllegalArgumentException("Id cannot be empty");
        this.id = id;
        this.amount = amount;
        this.timestamp = timestamp;
    }

    public String getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public Instant getTimestamp() {
        return timestamp;
    }
}
