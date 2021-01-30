
public class OmnivoreProtozoaStore extends ProtozoaStore {

	@Override
	protected Protozoa createProtozoa(String item) {
		// TODO Auto-generated method stub
		Protozoa protozoa = null;
		ProtozoaBehaviorFactory behaviorFactory = new OmnivoreProtozoaBehaviorFactory();
		
		if(item.equals("Malaria")) {
			protozoa = new MalariaProtozoa(behaviorFactory);
			protozoa.setName("Omnivore Malaria Protozoa");
		} else {
			protozoa = new RedTideProtozoa(behaviorFactory);
			protozoa.setName("Omnivore RedTide Protozoa");
		}
		
		//protozoa = new PredatorProtozoa(behaviorFactory);
		//protozoa.setName("Predator Protozoa");
		return protozoa;
	}

}
