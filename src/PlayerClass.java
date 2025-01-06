public enum PlayerClass {
	BARBARIAN("Strength", 12, new String[]{"Strength", "Constitution"}),
	BARD("Charisma", 8, new String[]{"Dexterity", "Charisma"}),
	CLERIC("Wisdom", 8, new String[]{"Wisdom", "Charisma"}),
	DRUID("Wisdom", 8, new String[]{"Intelligence", "Wisdom"}),
	FIGHTER("Strength", 10, new String[]{"Strength", "Constitution"}),
	MONK("Dexterity", 8, new String[]{"Strength", "Dexterity"}),
	PALADIN("Charisma", 10, new String[]{"Wisdom", "Charisma"}),
	RANGER("Dexterity", 10, new String[]{"Strength", "Dexterity"}),
	ROGUE("Dexterity", 8, new String[]{"Dexterity", "Intelligence"}),
	SORCERER("Charisma", 6, new String[]{"Constitution", "Charisma"}),
	WARLOCK("Charisma", 8, new String[]{"Wisdom", "Charisma"}),
	WIZARD("Intelligence", 6, new String[]{"Intelligence", "Wisdom"});
	
	private final String primaryAbility;
	private final int hitPointDie;
	private final String[] savingThrows;
	
	PlayerClass(String primaryAbility, int hitPointDie, String[] savingThrows) {
		this.primaryAbility = primaryAbility;
		this.hitPointDie = hitPointDie;
		this.savingThrows = savingThrows;
	}
	
	public String getPrimaryAbility() {
		return primaryAbility;
	}
	
	public int getHitPointDie() {
		return hitPointDie;
	}
	
	public String[] getSavingThrows() {
		return savingThrows.clone();
	}
	
	
	
}
