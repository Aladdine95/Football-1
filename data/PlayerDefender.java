package data;

public class PlayerDefender extends AbstractDataPlayerType {
	private Knowledge knowledge;
	private Strength strength;
	public Knowledge getKnowledge() {
		return knowledge;
	}
	public void setKnowledge(Knowledge knowledge) {
		this.knowledge = knowledge;
	}
	public Strength getStrength() {
		return strength;
	}
	public void setStrength(Strength strength) {
		this.strength = strength;
	}
}
