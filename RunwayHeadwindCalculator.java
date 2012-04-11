
public class RunwayHeadwindCalculator {
	public static double calculateUsingMph (String rDirection, String wDirection, String wSpeed) {
		//user input wind direction and wind speed in degrees and mph respectively
		
		//*******NB*************** i think runway direction should not come from user but the file 
		double rDir = 0.0; //runway direction in degrees
		double wDir = 0.0; // in degrees
		double wSpd = 0.0; // in mph
		double RunwayHwind = 0.0;
		
		rDir = Double.parseDouble(rDirection); //converts to double
		wDir = Double.parseDouble(wDirection);
		wSpd = Double.parseDouble(wSpeed);
		
		//Calculating Angle between Runway and Wind directions, keeping right crosswind positive
		RunwayHwind = Math.cos(Math.PI/180*(wDir -rDir))*wSpd;
						
		return RunwayHwind;
	}
	double calculateUsingKnots(String rDirection,String wDirection, String wSpeed){
		double Hwind = RunwayCrosswindCalculator.calculateUsingMph(rDirection, wDirection, wSpeed);
		
		return Hwind;
	}
	double calculateUsingKmPerHr(String rDirection,String wDirection, String wSpeed){
		double Hwind = RunwayCrosswindCalculator.calculateUsingMph(rDirection, wDirection, wSpeed);
		
		return Hwind;
	}
}
