
public class OmnivoreGene implements Gene {
	genotype gtype = genotype.OMNIVORE;
	public String toString() {
		return "Has an Omnivore gene";
	}

	@Override
	public genotype getGene() {
		// TODO Auto-generated method stub
		return gtype;
	}
}