package br.ol.rb;

import java.awt.Graphics2D;

/**
 *
 * @author leonardo
 */
public class Square extends Shape {
    
    private double size;

    public Square(double size) {
        this.size = size;
    }

    @Override
    public void draw(Graphics2D g) {
        g.drawRect((int) (-size / 2), (int) (-size / 2), (int) size, (int) size);
    }
    
}
