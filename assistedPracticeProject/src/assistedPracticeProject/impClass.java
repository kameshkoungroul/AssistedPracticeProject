package assistedPracticeProject;




class OuterClass {
	  int a = 10;

	  class InnerClass {
	    int y = 5;
	  }
	}


public class impClass {
	
	
		public static void main(String[] args) {
		    OuterClass myOuter = new OuterClass();
		    OuterClass.InnerClass myInner = myOuter.new InnerClass();
		    System.out.println(myInner.y + myOuter.a);
		  }
		}
