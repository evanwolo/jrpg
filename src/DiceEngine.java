public class DiceEngine {
	
	public DiceEngine() {}
	
	private Die createDie(int sides){
		return new Die(sides);
	}
	
	public Die[] createDice(int numDice, int sides){
		Die[] dice = new Die[numDice];
		for(int i = 0; i < numDice; i++) {
			dice[i] = createDie(sides);
		}
		return dice;
	}
	
	public int rollDie(int sides){
		return createDie(sides).roll();
	}
	
	/**
	 * Rolls array of n dice and returns int[] of n results of dice rolls
	 * @param dice
	 * @return Results of dice rolls
	 */
	public int[] rollDice(Die[] dice){
		int[] results = new int[dice.length];
		for(int i = 0; i < dice.length; i++) {
			results[i] = createDie(dice[i].getSides()).roll();
		}
		return results;
	}
}