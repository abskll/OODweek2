public abstract class Protozoa {

	String name;
	int id;
	Gene gene;
	Pair<Integer, Integer> pair = new Pair<Integer, Integer>();
	Desire desire;
	Health health;
	
	abstract void prepare();
	
	int getID() {
		return id;
	}
	
	void setID(int id) {
		this.id = id;
	}
	
	void spawn() {
		System.out.println("Spawning protozoa at default location");
	}
	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- " + name + " ----\n");
		if (gene != null) {
			result.append(gene);
			result.append("\n");
		}
		if (desire != null) {
			result.append(desire);
			result.append("\n");
		}
		if (health != null) {
			result.append(health);
			result.append("\n");
		}
		return result.toString();
	}
	
}
