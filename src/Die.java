public class Die {
	
	private int sides;
	
	public Die(){}
	
	public Die(int sides) {
		this.sides = sides;
	}
	
	public int getSides() {
		return sides;
	}
	
	public void setSides(int sides) {
		this.sides = sides;
	}
	
	public int roll() {
		return (int)(Math.random() * this.sides) + 1;
	}
	
}
