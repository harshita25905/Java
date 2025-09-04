package Exception;

class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

public class CustomException2 {
	private String name;
    private int marks;

    public CustomException2(String name, int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100");
        }
        this.name = name;
        this.marks = marks;
    }

    public void display() {
        System.out.println("Student: " + name + ", Marks: " + marks);
    }

    public static void main(String[] args) {
        try {
        	CustomException2 s1 = new CustomException2("Amit", 105);
            s1.display();
        } catch (InvalidMarksException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        try {
        	CustomException2 s2 = new CustomException2("Riya", 85);
            s2.display();
        } catch (InvalidMarksException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

}
