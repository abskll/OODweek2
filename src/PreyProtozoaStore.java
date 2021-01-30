
public class PreyProtozoaStore extends ProtozoaStore {

	@Override
	protected Protozoa createProtozoa(String item) {
		// TODO Auto-generated method stub
		Protozoa protozoa = null;
		ProtozoaBehaviorFactory behaviorFactory = new PreyProtozoaBehaviorFactory();
		
		if(item.equals("Malaria")) {
			protozoa = new MalariaProtozoa(behaviorFactory);
			protozoa.setName("Prey Malaria Protozoa");
		} else {
			protozoa = new RedTideProtozoa(behaviorFactory);
			protozoa.setName("Prey RedTide Protozoa");
		}
		
		//protozoa = new PredatorProtozoa(behaviorFactory);
		//protozoa.setName("Predator Protozoa");
		return protozoa;
	}

}
