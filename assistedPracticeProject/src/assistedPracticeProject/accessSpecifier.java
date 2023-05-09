package assistedPracticeProject;

public class accessSpecifier {

	public int publicField;
	protected int protectedField;
	private int privateField;
	int defaultField;
	
	 public accessSpecifier() {
	        this.publicField = 1;
	        this.protectedField = 2;
	        this.privateField = 3;
	        this.defaultField = 4;
	    }
	    public void displayFields() {
	        System.out.println("publicField: " + publicField);
	        System.out.println("protectedField: " + protectedField);
	        System.out.println("privateField: " + privateField);
	        System.out.println("defaultField: " + defaultField);
	    }
	
	
	public static void main(String[] args) {
		accessSpecifier obj = new accessSpecifier();
		obj.displayFields();
		
		obj.publicField=10;
		obj.protectedField=20;    //private is only used inside a same class;
		obj.defaultField=40;
		
		obj.displayFields();
	}

}
