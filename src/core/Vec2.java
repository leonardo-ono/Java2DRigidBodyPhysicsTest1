package core;

/**
 *
 * @author leonardo
 */
public class Vec2 {
    
    private double x, y;

    public Vec2() {
    }

    public Vec2(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public void set(Vec2 v) {
        this.x = v.x;
        this.y = v.y;
    }
    
    public void set(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void scale(double d) {
        this.x *= d;
        this.y *= d;
    }
    
    public void add(Vec2 v) {
        this.x += v.x;
        this.y += v.y;
    }

    public void sub(Vec2 v) {
        this.x -= v.x;
        this.y -= v.y;
    }
    
    public double getLength() {
        return Math.sqrt(x * x + y * y);
    }
    
    public void normalize() {
        scale(1 / getLength());
    }

    public double dot(Vec2 v) {
        return x * v.x + y * v.y;
    }

    public Vec2 perp() {
        return new Vec2(-y, x);
    }
    
    public double perpDot(Vec2 v) {
        return perp().dot(v);
    }
    
    public double cross(Vec2 v) {
        return x * v.y - y * v.x;
    }

    @Override
    public String toString() {
        return "Vec2{" + "x=" + x + ", y=" + y + '}';
    }

}
