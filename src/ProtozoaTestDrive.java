
public class ProtozoaTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtozoaStore predatorstore = new PredatorProtozoaStore();
		ProtozoaStore preystore = new PreyProtozoaStore();
		ProtozoaStore omnivorestore = new OmnivoreProtozoaStore();
		
		Protozoa protozoa = predatorstore.orderProtozoa("RedTide");
		System.out.println("Ethan ordered a " + protozoa + "\n");
		protozoa = preystore.orderProtozoa("RedTide");
		System.out.println("Ethan ordered a " + protozoa + "\n");
		protozoa = omnivorestore.orderProtozoa("RedTide");
		System.out.println("Ethan ordered a " + protozoa + "\n");

		protozoa = predatorstore.orderProtozoa("Malaria");
		System.out.println("Ethan ordered a " + protozoa + "\n");
		protozoa = preystore.orderProtozoa("Malaria");
		System.out.println("Ethan ordered a " + protozoa + "\n");
		protozoa = omnivorestore.orderProtozoa("Malaria");
		System.out.println("Ethan ordered a " + protozoa + "\n");
		
		
		
	}

}
