public interface Drawable {
    void draw();
}

public abstract class Shape implements Drawable {
    // no draw() here, because Shape leaves it for the subclasses
    public abstract double area();
    public abstract double perimeter();
    ...
}public interface Drawable {
    void draw();
}

public abstract class Shape implements Drawable {
    // no draw() here, because Shape leaves it for the subclasses
    public abstract double area();
    public abstract double perimeter();
    ...
}