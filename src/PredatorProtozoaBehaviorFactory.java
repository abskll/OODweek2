
public class PredatorProtozoaBehaviorFactory implements ProtozoaBehaviorFactory {

	@Override
	public Gene createGene() {
		// TODO Auto-generated method stub
		return new PredatorGene();
	}

	@Override
	public Health createHealth() {
		// TODO Auto-generated method stub
		return new Healthlevel();
	}

	@Override
	public Desire createDesire() {
		// TODO Auto-generated method stub
		return new Desirelevel();
	}

	
}
