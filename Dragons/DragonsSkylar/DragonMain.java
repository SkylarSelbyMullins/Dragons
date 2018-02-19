public class DragonMain {

	public static void main(String[] args) {
		
		Dragon steve = new Dragon ("Steve");
		
		System.out.println("The first Dragon is " + steve.getName());
		steve.setAttackBite(10);
		steve.setAttackClaw(15);
		steve.setAttackTailWhip(20);
		steve.setHealthPoints(100);
		steve. setArmor(15);		
		
		
		Dragon martin = new Dragon ("Martin");
		
		System.out.println("The second Dragon is " + martin.getName());
		martin.setAttackBite(10);
		martin.setAttackClaw(15);
		martin.setAttackTailWhip(20);
		martin.setHealthPoints(100);
		martin. setArmor(15);
		
		
		Dragon sam = new Dragon ("Sam");
		
		System.out.println("The third Dragon is " + sam.getName());
		sam.setAttackBite(10);
		sam.setAttackClaw(15);
		sam.setAttackTailWhip(20);
		sam.setHealthPoints(100);
		sam. setArmor(15);
	
		
		Dragon tom = new Dragon ("Tom");
		
		System.out.println("The fourth Dragon is " + tom.getName());
		tom.setAttackBite(10);
		tom.setAttackClaw(15);
		tom.setAttackTailWhip(20);
		tom.setHealthPoints(100);
		tom. setArmor(15);
		
		
		

		
		while(true) {
			System.out.println("\nSteve was bitten");
			steve.Defend(tom.Bite());
			System.out.println("\nMartin was bitten");
			martin.Defend(steve.Bite());
			System.out.println("\nSam was bitten");
			sam.Defend(martin.Bite());
			System.out.println("\nTom was bitten");
			tom.Defend(sam.Bite());
		
			
			
			if(martin.getHealthPoints() > 0 && steve.getHealthPoints() > 
			0 && sam.getHealthPoints() > 0 && tom.getHealthPoints() > 0) {
				System.out.println("Continue");}
			
			else
				
				
			{if (martin.getHealthPoints() > 0)
				{System.out.println("Congratulations Martin, you win!");}
				
				else if (steve.getHealthPoints() > 0)
				{System.out.println("Congratulations Steve, you win!");}
			
				else if (sam.getHealthPoints() > 0)
				{System.out.println("Congratulations Sam, you win!");}
			
				else if (tom.getHealthPoints() > 0)
				{System.out.println("Congratulations Tom, you win!");}
				break;
				
}}}}
