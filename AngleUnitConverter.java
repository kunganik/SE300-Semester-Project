
public class AngleUnitConverter {
	
	public static double convertFromDegreesToRadians(String input) {

		double initialValue = 0.0;
		double finalValue = 0.0;
		double conversionFactor = Math.PI/180;

		initialValue = Double.parseDouble(input);

		finalValue = initialValue * conversionFactor; 

		return finalValue;
	}

	public static double convertFromRadiansToDegrees(String input) {

		double initialValue = 0.0;
		double finalValue = 0.0;
		double conversionFactor = 180/Math.PI;

		initialValue = Double.parseDouble(input);

		finalValue = initialValue * conversionFactor; 

		return finalValue;
	}

}
