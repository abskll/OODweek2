
public class OmnivoreProtozoaBehaviorFactory implements ProtozoaBehaviorFactory {

	@Override
	public Gene createGene() {
		// TODO Auto-generated method stub
		return new OmnivoreGene();
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
