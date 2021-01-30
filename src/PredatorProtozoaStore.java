
public class PredatorProtozoaStore extends ProtozoaStore {

	@Override
	protected Protozoa createProtozoa(String item) {
		// TODO Auto-generated method stub
		Protozoa protozoa = null;
		ProtozoaBehaviorFactory behaviorFactory = new PredatorProtozoaBehaviorFactory();
		
		if(item.equals("Malaria")) {
			protozoa = new MalariaProtozoa(behaviorFactory);
			protozoa.setName("Predator Malaria Protozoa");
		} else {
			protozoa = new RedTideProtozoa(behaviorFactory);
			protozoa.setName("Predator RedTide Protozoa");
		}
		
		//protozoa = new PredatorProtozoa(behaviorFactory);
		//protozoa.setName("Predator Protozoa");
		return protozoa;
	}

}
