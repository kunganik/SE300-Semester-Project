
public class RunwayCrosswindCalculator {
	public static double calculateUsingMph (String rDirection, String wDirection, String wSpeed) {
		//user input wind direction and wind speed in degrees and mph respectively
		
		//*******NB*************** i think runway direction should not come from user but the file 
		/*
		 * Right Crosswind is positive
		 * Left Crosswind is negative
		 */
		double rDir = 0.0; //runway direction in degrees
		double wDir = 0.0; // in degrees
		double wSpd = 0.0; // in mph
		double RunwayCrosswind = 0.0;
		
		rDir = Double.parseDouble(rDirection); //converts to double
		wDir = Double.parseDouble(wDirection);
		wSpd = Double.parseDouble(wSpeed);
		
		//Calculating Angle between Runway and Wind directions, keeping right crosswind positive
		RunwayCrosswind = Math.sin(wDir -rDir)*wSpd;
						
		return RunwayCrosswind;
	}
	double calculateUsingKnots(String rDirection,String wDirection, String wSpeed){
		double Xwind = RunwayCrosswindCalculator.calculateUsingMph(rDirection, wDirection, wSpeed);
		
		return Xwind;
	}
	double calculateUsingKmPerHr(String rDirection,String wDirection, String wSpeed){
		double Xwind = RunwayCrosswindCalculator.calculateUsingMph(rDirection, wDirection, wSpeed);
		
		return Xwind;
	}
}
