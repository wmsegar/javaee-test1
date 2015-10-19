
public class CreateBike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicycle bike1 = new Bicycle(5,6,2);
		Bicycle bike2 = new Bicycle(6,5,3);
		
		Bicycle myBike = new Bicycle();
		
		Bicycle bike3 = new Bicycle(3, 4, 9);
		
		System.out.println(bike1.getID());
		System.out.println(bike1.getCadence());
		System.out.println(myBike.getID());
		System.out.println("bike3 gear is: " + bike3.getGear());
		
		System.out.println(bike3.computePayment(350000, .03, 500000, 100));
		
		System.out.println(myBike.computePayment(50000, .5, 60000, 2));
	}

}
