
public class PreyProtozoaBehaviorFactory implements ProtozoaBehaviorFactory {

	@Override
	public Gene createGene() {
		// TODO Auto-generated method stub
		return new PreyGene();
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
