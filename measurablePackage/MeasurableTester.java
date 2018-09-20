package measurablePackage;

public class MeasurableTester {
	public static void main(String[] args) {
		Measurable[] quizzes = new Measurable[3];
		quizzes[0] = new Quiz(99);
		quizzes[1] = new Quiz(2);
		quizzes[2] = new Quiz(75);
		
		double avgQuizScore = Data.average(quizzes);
		System.out.println("Average quiz score was : " + avgQuizScore);
		
		double maxQuizScore = Data.max(quizzes);
		System.out.println("Max quiz score was : " + maxQuizScore);
	}
}
