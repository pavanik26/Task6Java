package pack5;

public class Circle {
	    // Data member
	    private double radius;

	    // Constructor with no arguments (default constructor)
	    public Circle() {
	        this.radius = 0.0;  // Default radius
	    }

	    // Constructor with one argument to initialize radius
	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    // Method to calculate circumference
	    public double calculateCircumference() {
	        return 2 * Math.PI * radius;
	    }

	    // Getter method for radius
	    public double getRadius() {
	        return radius;
	    }

	    // Setter method for radius (if needed)
	    public void setRadius(double radius) {
	        this.radius = radius;
	    }

	    // Main method (for testing)
	    public static void main(String[] args) {
	        // Create an instance of Circle using default constructor
	        Circle circle1 = new Circle();
	        System.out.println("Circle 1 - Radius: " + circle1.getRadius());
	        System.out.println("Circle 1 - Circumference: " + circle1.calculateCircumference());

	        // Create an instance of Circle using constructor with one argument
	        Circle circle2 = new Circle(5.0);
	        System.out.println("Circle 2 - Radius: " + circle2.getRadius());
	        System.out.println("Circle 2 - Circumference: " + circle2.calculateCircumference());
	    }
	}

