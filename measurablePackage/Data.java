package measurablePackage;

public class Data {
	/* 		
	 * 		--average--
	 *  Computes the average of an array of measurable objects
	 *  	@param objects - an array of measurable objects
	 *  	@return        - the average of the measured objects
	 */
	public static double average(Measurable[] objects) {
		double sum = 0;
		for (Measurable obj : objects) {
			sum = sum + obj.getMeasure();
		}
		if (objects.length > 0) {
			return sum / objects.length;
		} else {
			return 0;
		}
	}
		
	/*      
	 * 		--max--
	 *  Computes the max of an array of measurable objects
	 *  	@param objects - an array of measurable objects
	 *  	@return        - the max value of the measured objects
	 */	
	public static double max(Measurable[] objects) {
		double maxValue = 0;
		for (Measurable obj : objects) {
			if (obj.getMeasure() > maxValue) {
				maxValue = obj.getMeasure();
			}
		}
		return maxValue;
	}
}
