
public abstract class ProtozoaStore {

	protected abstract Protozoa createProtozoa(String item);
	
	public Protozoa orderProtozoa(String type) {
		Protozoa protozoa = createProtozoa(type);
		System.out.println("--- Making a " + protozoa.getName() + " ---");
		protozoa.prepare();
		protozoa.spawn();
		return protozoa;
	}
}