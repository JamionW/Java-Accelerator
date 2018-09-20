package measurablePackage;

public class Quiz implements Measurable {
	private double score;
	private String grade;

	public Quiz() {
		score = 0;
		grade = "";
	}
	
	public Quiz(double rawScore) {
		score = rawScore;
	}

	public double getMeasure() {
		return score;
	}
	
	public void getGrade() {
		System.out.println(grade);
	}
}
