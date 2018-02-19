public class Dragon {

	private String name;
	private int Bite;
	private int Armor;
	private double HealthPoints;
	private int Claw;
	private int TailWhip;
	
	
	Dragon(String Name){
		this.name = Name;}

	
	
	//Bite
	public void setAttackBite(int attackBite) {
		this.Bite = attackBite;}	
	
	public int getAttackBite() {
		return Bite;}
	
	public double Bite() {
		double Bite;
		Bite = (this.Bite);
		return Bite;}	
	

	
	//Claw
	public void setAttackClaw(int attackClaw) {
		this.Claw = attackClaw;}	
		
		public int getAttackClaw() {
			return Claw;}
		
		public double Claw() {
			double Claw;
			Claw = (this.Claw);
			return Claw;}	
	
	
	
		//TailWhip
		public void setAttackTailWhip(int attackTailWhip) {
			this.TailWhip = attackTailWhip;}	
			
			public int getAttackTailWhip() {
				return TailWhip;}
			
			public double TailWhip() {
				double TailWhip;
				TailWhip = (this.TailWhip);
				return TailWhip;}
	

	
	public int getArmor() {
		return Armor;}
	
	
	public void setArmor(int armor) {
		this.Armor = armor;}
	
	
	public double getHealthPoints() {
		return HealthPoints;}

	
	public void setHealthPoints(double healthPoints) {
		this.HealthPoints = healthPoints;}
	
	
	public String getName() {
		return this.name;}
	
	public void Defend(double attack) {
		System.out.println("Health was " + this.HealthPoints);
		this.HealthPoints = this.HealthPoints - Math.random() * attack;
		System.out.println("and is now " + this.HealthPoints);
	
	}}
