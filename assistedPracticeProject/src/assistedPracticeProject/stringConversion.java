package assistedPracticeProject;

public class stringConversion {

	public static void main(String[] args) {
		   
        String str = "Hello, there!";

        // string to StringBuffer
        StringBuffer sb = new StringBuffer(str);
        System.out.println("StringBuffer: " + sb);

        // string to StringBuilder
        StringBuilder sbu = new StringBuilder(str);
        System.out.println("StringBuilder: " + sbu);

	}

}
