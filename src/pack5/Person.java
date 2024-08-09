package pack5;

public class Person {	
	    // Attributes
	    private String name;
	    private int age;
	    
	    // Constructor
	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
	    
	    // Getter method for name
	    public String getName() {
	        return name;
	    }
	    
	    // Getter method for age
	    public int getAge() {
	        return age;
	    }
	    
	    // Main method (for testing)
	    public static void main(String[] args) {
	        // Create an instance of Person
	        Person person1 = new Person("Alice", 30);
	        
	        // Use getter methods to access attributes
	        System.out.println("Name: " + person1.getName());
	        System.out.println("Age: " + person1.getAge());
	    }
	}



