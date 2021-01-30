
public class RedTideProtozoa extends Protozoa{
	ProtozoaBehaviorFactory behaviorFactory;
	public RedTideProtozoa(ProtozoaBehaviorFactory behaviorFactory) {
		this.behaviorFactory = behaviorFactory;
	}
	
	@Override
	void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Preparing " + name);
		desire = behaviorFactory.createDesire();
		gene = behaviorFactory.createGene();
		health = behaviorFactory.createHealth();
	}
}
