package things;

public class Rot extends Calc{
	
	@Override
	public double calc(double tal1, double tal2) {
		
		double Rotsum = 0;
		
		if(tal1 > 0) {
			Rotsum = Math.sqrt(tal1);
			return Rotsum;
		}
		
		else if(tal2 > 0) {
			Rotsum = Math.sqrt(tal2);
			return Rotsum;
		}
		return Rotsum;
		
	}
	
	public static double Rotur(double tal1) {
		
		double Rotsum = 0;
		
		
			Rotsum = Math.sqrt(tal1);
			return Rotsum;
		
	}

	
	

}
