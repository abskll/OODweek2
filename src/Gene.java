
public interface Gene {
	public String toString();
	enum genotype {
	    PREY,
	    PREDATOR,
	    OMNIVORE
	  }
	public genotype getGene();
}
