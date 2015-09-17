package marshmellows.controller;



import java.util.Scanner;

import marshmellows.model.MarshmellowMonster;
import marshmellows.view.MarshmellowOutput;

public class MonsterController
{
	private MarshmellowMonster joshMonster;
	private MarshmellowOutput myOutput;
	private Scanner monsterScanner;
	private MarshmellowMosnter userMonster;
	
	public MonsterController()
	{
		int eyes = 1;
		double legs = 3.5;
		double hair=3;
		int noses =2;
		boolean hasBellyButton = false;
		String name = "yuck old candy";
		
		monsterScanner = new Scanner(System.in);
		myOutput=new MarshmellowOutput();
		joshMonster= new MarshmellowMonster(name,eyes,noses,legs,hair,hasBellyButton);
	}
	
	public void start()
	{
		myOutput.displayMonsterInfo(joshMonster.toString());
		askQuestions();
		myOutput.displayMonsterInfo(joshMonster.toString());
	
	}



	private void askQuestions()
	{
		System.out.println("Type in a better name for the monster");
		String betterMonsterName = monsterScanner.next();
		joshMonster.setMonsterName(betterMonsterName);
		System.out.println("Type in a diffrent number of eyes fo r the mosnter");
		int betterMonsterEyes = monsterScanner.nextInt();
		joshMonster.setMonstername
		betterEyes(betterMonsterEyes);
		System.out.println("Type in a better name for the monster");
		double betterMonsterLegs= monsterScanner.nextDouble();
	}
	



/**
 * This method will get the information to create an instance of a MarshmellowMonster
 */
 private void makeUserMonster()
 {
	 //Step one: Get variables
	 String userName; // Declare a string type called userName.
	 int userEyes;    // Declare an int type called userEyes
	 int userNoseCount; 
	 double userHair;
	 double userLegs;
	 boolean userBellyButton;
	 
	 //Step two: Define variables by using scanner to get user input.
	 System.out.println("Type in your name for your monster.");
	 userName = monsterScanner.nextLine();
	 System.out.println("Type in the number of eyes for your monster");
	 userEyes = monsterScanner.nextInt();
	 System.out.println("Type in the number of noses for this monster");
	 userNoseCount = monsterScanner.nextInt();
	 System.out.println("How much hair does your monster have? Type in a floating point or decimal number.");
	 userHair = monsterScanner.nextDouble();
	 System.out.println("How many legs??????");
	 userLegs = monsterScanner.nextDouble();
	 System.out.println("Does it have a bellybutton? Type true or false");
	 userBellyButton = monsterScanner.nextBoolean();
	 // Step three: Make a monster - use the Constructor! remember that the order of parameteres matters!
	 userMonster = new MarshmellowMonster(userName, userEyes, userNoseCount, userHair, userLegs, userBellyButton);
	 
 } 
 }
	