public class TestColorable {
    // Abstract class representing geometric object
    public static abstract class GeometricObject {
    	// Method to calculate the area of the geometric object
    	public abstract double getArea(); 
    }

    // Interface representing a colorable object
    public interface Colorable {
    	// Method to specify how to color the object
    	void howToColor(); 
    }

    // Square class extending GeometricObject and implementing Colorable
    public static class Square extends GeometricObject implements Colorable {
        private double side;

        public Square() {
            this(0);
        }

        public Square(double side) {
            this.side = side;
        }

        public double getSide() {
            return side;
        }

        public void setSide(double side) {
            this.side = side;
        }

        @Override
        public double getArea() {
            return side * side;
        }

        @Override
        public void howToColor() {
            System.out.println("Color all four sides");
        }
    }

    // Circle class extending GeometricObject
    public static class Circle extends GeometricObject {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

    // Rectangle class extending GeometricObject
    public static class Rectangle extends GeometricObject {
        private double width;
        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getWidth() {
            return width;
        }

        public double getHeight() {
            return height;
        }

        @Override
        public double getArea() {
            return width * height;
        }
    }

    public static void main(String[] args) {
        GeometricObject[] objects = { new Square(2), new Circle(5), new Square(5),
                new Rectangle(3, 4), new Square(4.5) };

        for (int i = 0; i < objects.length; i++) {
            System.out.println("Area is " + objects[i].getArea());
            if (objects[i] instanceof Colorable)
                ((Colorable) objects[i]).howToColor();
        }
    }
}
