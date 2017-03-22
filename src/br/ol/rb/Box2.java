package br.ol.rb;

import core.Mouse;

/**
 *
 * @author leonardo
 */
public class Box2 extends RigidBody {
    
    public Box2(RBScene scene, double size) {
        super(scene, new Square(size));
        getGrabbingPointLocal().set(40, 40);
    }

    @Override
    public void init() {
        setMass(10.0);
        setInertia(100.0);
        getPosition().set(100, 100);
    }

    @Override
    public void update() {
        getPosition().set(Mouse.x, Mouse.y);
        super.update();
    }

}
