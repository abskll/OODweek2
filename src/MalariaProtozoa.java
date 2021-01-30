
public class MalariaProtozoa extends Protozoa{
	ProtozoaBehaviorFactory behaviorFactory;
	public MalariaProtozoa(ProtozoaBehaviorFactory behaviorFactory) {
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
