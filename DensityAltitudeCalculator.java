
public class DensityAltitudeCalculator {

	public static double calculateUsingFahrenheit (String pAltitude,String temperature) {
		//user input outside temperature in Fahrenheit and pressure altitude in feet
		double pAlt = 0.0; //to be in feet
		double temp = 0.0; // in Fahrenheit
		double DensAltitude = 0.0; //will be output in feet
		double ISA_Temp = 0.0; //used in calculation 

		pAlt = Double.parseDouble(pAltitude); //converts to double
		//converts temperature from user to Celsius scale
		temp = TemperatureUnitConverter.convertFromFahrenheitToCelsius(temperature);
		ISA_Temp = 15 - (1.98/1000*pAlt);//(15C-1.98C/1000ft x pressure alt in thousands of feet)
		DensAltitude = pAlt + (120 * (temp - ISA_Temp)); 
		
		return DensAltitude;
	}
	
	public static double calculateUsingCelsius (String pAltitude,String temperature) {
		//user input outside temperature in Celsius and pressure altitude in feet
		double pAlt = 0.0; //to be in feet
		double temp = 0.0; // in Celsius
		double DensAltitude = 0.0; //will be output in feet
		double ISA_Temp = 0.0; //used in calculation 
		
		pAlt = Double.parseDouble(pAltitude); //converts to double
		temp = Double.parseDouble(temperature);
		ISA_Temp = 15 - (1.98/1000*pAlt);//(15C-1.98C/1000ft x pressure alt in thousands of feet)
		DensAltitude = pAlt + (120 * (temp - ISA_Temp)); 
		
		return DensAltitude;
	}
}
