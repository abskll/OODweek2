
public class PreyProtozoa extends Protozoa {
	ProtozoaBehaviorFactory behaviorFactory;
	public PreyProtozoa(ProtozoaBehaviorFactory behaviorFactory) {
		this.behaviorFactory = behaviorFactory;
	}
	void spawn() {
		System.out.println("Spawning " + name);

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
