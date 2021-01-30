
public class PreyGene implements Gene {
	genotype gtype = genotype.PREY;
	public String toString() {
		return "Has a Prey gene";
	}

	@Override
	public genotype getGene() {
		// TODO Auto-generated method stub
		return gtype;
	}
}