package Java;

public class IfElsedemo {

	public static void main(String[] args) {
		int testscore =76;
		char grade;
		if(testscore >= 90) {
			grade = 'A';
		} else {
			grade = 'F';
		}
		System.out.println("Grade: " +grade);
	}

}
