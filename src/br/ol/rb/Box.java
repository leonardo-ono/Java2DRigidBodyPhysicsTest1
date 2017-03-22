package br.ol.rb;

/**
 *
 * @author leonardo
 */
public class Box extends RigidBody {
    
    public Box(RBScene scene, double size) {
        super(scene, new Square(size));
        getGrabbingPointLocal().set(20, 0);
    }

    @Override
    public void init() {
        setMass(1.0);
        setInertia(10.0);
        getPosition().set(100, 100);
    }

    @Override
    public void update() {
        //addTorque(100);
        super.update();
    }

}
