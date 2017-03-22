package core;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leonardo
 */
public class Scene {
    
    private final List<Entity> entities = new ArrayList<Entity>();

    public Scene() {
    }

    public List<Entity> getEntities() {
        return entities;
    }

    void internalInit() {
        init();
        initAllEntities();
    }
    
    public  void init() {
    }

    public void initAllEntities() {
        for (Entity entity : entities) {
            entity.init();
        }
    }
    
    public void update() {
        for (Entity entity : entities) {
            entity.update();
        }
    }

    public void draw(Graphics2D g) {
        for (Entity entity : entities) {
            entity.draw(g);
        }
    }

}
