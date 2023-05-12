package assistedPracticeProject;

public class Bank {
    protected double roi;
    
    public Bank(double roi) {
        this.roi = roi;
    }
    
    public double calInterest(double amount) {
        return amount * roi / 100;
    }
}

class HDFC extends Bank {
    public HDFC(double roi) {
        super(roi);
    }
    
    public static void main(String[] args) {
        HDFC hdfc = new HDFC(8.5);
        double amount = 10000;
        double interest = hdfc.calInterest(amount);
        double finalAmount = amount + interest;
        System.out.println("Final amount with HDFC: " + finalAmount);
    }
}

class ICICI extends Bank {
    public ICICI(double roi) {
        super(roi);
    }
    
    public static void main(String[] args) {
        ICICI icici = new ICICI(7.5);
        double amount = 10000;
        double interest = icici.calInterest(amount);
        double finalAmount = amount + interest;
        System.out.println("Final amount with ICICI: " + finalAmount);
    }
}
