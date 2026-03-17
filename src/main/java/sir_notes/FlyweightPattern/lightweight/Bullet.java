package sir_notes.FlyweightPattern.lightweight;

import sir_notes.FlyweightPattern.flyweights.BulletType;

public final class Bullet {
    public BulletType type ; // shared flyweight ( intrinsic )
    public float x , y ; // extrinsic
    public float vx , vy ; // extrinsic
    public float lifetime ; // extrinsic
    public int ownerId ; // extrinsic (who fired )
    public void update ( float dt ) {
        x += vx * dt ; y += vy * dt ; lifetime -= dt ;
    }
}
