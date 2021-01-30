
public class PredatorGene implements Gene {
	genotype gtype = genotype.PREDATOR;
	public String toString() {
		return "Has a Predator gene";
	}

	@Override
	public genotype getGene() {
		// TODO Auto-generated method stub
		return gtype;
	}
}