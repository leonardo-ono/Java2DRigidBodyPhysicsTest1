package br.ol.rb;

import core.Entity;
import core.Scene;
import core.Vec2;

/**
 *
 * @author leonardo
 */
public class RBScene extends Scene {
    
    private final Vec2 gravity = new Vec2(0, 0);
    
    public RBScene() {
    }

    public Vec2 getGravity() {
        return gravity;
    }
    
    @Override
    public void init() {
        Box box1 = new Box(this, 50);
        Box2 box2 = new Box2(this, 100);
        Spring spring1 = new Spring(this, box1, box2);
        getEntities().add(box1);
        getEntities().add(box2);
        getEntities().add(spring1);
    }

    @Override
    public void update() {
        for (Entity entity : getEntities()) {
            entity.update();
        }
    }
    
}
