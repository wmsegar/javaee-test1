


public class Bicycle {
	
	private int cadence;
	private int gear;
	private int speed;
	private int id;
	private static int numberOfBicycles = 0;
	
	public Bicycle(int startCadence, int startSpeed, int startGear){
		gear = startGear;
		speed = startSpeed;
		cadence = startCadence;
		
		id = ++numberOfBicycles;
	}
	
	public Bicycle(){
		gear = 2;
		speed = 5;
		cadence = 4;
	}
	
	public int getCadence(){
		return cadence;
	}
	
	public int getSpeed(){
		return speed;
	}
	
	public int getGear(){
		return gear;
	}
	
	public int getID(){
		return id;
	}
	
	public double computePayment(double loanAmt, double rate, double futureValue, int numPeriods){
		
		double interest = rate/100.0;
		double partial1 = Math.pow((1 + interest), - numPeriods);
		double denominator  = (1 - partial1) / interest;
		double answer = (-loanAmt / denominator) - ((futureValue * partial1) / denominator);
		
		
		return answer;
		
	}
	
	
}
