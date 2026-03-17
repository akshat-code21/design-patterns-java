package sir_notes.FlyweightPattern.flyweights;

public final class BulletType {
    public final TextureId texture;
    public final double baseDamage;
    public final double baseSpeed;
    public final int spriteW, spriteH;

    public BulletType(TextureId texture, double baseDamage, double baseSpeed, int spriteW, int spriteH) {
        this.texture = texture;
        this.baseDamage = baseDamage;
        this.baseSpeed = baseSpeed;
        this.spriteW = spriteW;
        this.spriteH = spriteH;
    }
}
