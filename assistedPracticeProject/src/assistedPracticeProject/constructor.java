package assistedPracticeProject;

public class constructor {

    private int id;
    private String name;
    private double salary;

    
    // default constructor
    public constructor() {
        this.id = 0;
        this.name = "";
        this.salary = 0.0;
    }
    
    // parameterized constructor
    public constructor(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    // copy constructor
    public constructor(constructor other) {
        this.id = other.id;
        this.name = other.name;
        this.salary = other.salary;
    }
	
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
	
	
	
	public static void main(String[] args) {
	
		// create an instance using default constructor
		constructor obj = new constructor();
        obj.setId(101);
        obj.setName("disha");
        obj.setSalary(50000.0);
        System.out.println("Employee id: " + obj.getId());
        System.out.println("Employee name: " + obj.getName());
        System.out.println("Employee salary: " + obj.getSalary());
        
        // create an instance using parameterized constructor
        constructor obj2 = new constructor(102, "kamesh", 60000.0);
        System.out.println("Employee id: " + obj2.getId());
        System.out.println("Employee name: " + obj2.getName());
        System.out.println("Employee salary: " + obj2.getSalary());
        
        // create an instance using copy constructor
        constructor obj3 = new constructor(obj2);
        obj3.setSalary(70000.0);
        System.out.println("Employee id: " + obj3.getId());
        System.out.println("Employee name: " + obj3.getName());
        System.out.println("Employee salary: " + obj3.getSalary());
		
	}

}
