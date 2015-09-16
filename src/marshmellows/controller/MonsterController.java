package marshmellows.controller;
import marshmellows.view.MarshmellowOutput;
import marshmellows.model.MarshmellowMonster;
import java.util.Scanner;
public class MonsterController
{
	private MarshmellowMonster joshMonster;
	private MarshmellowOutput myOutput;
	
	Public class MonsterController
	{
	private MarshmellowMonster codyMonster;
	private MArshmellowOutpuy myOutput;
	private Scanner mosnterScanner;
	
	
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
		myOutput.displaMonsterInfo(codyMonster.toString());
		askQuestions();
		myOutput.displayMonsterInfo(joshMonster.toString());
	
	}
}


	private void askQuestions()
	{
		System.out.println("Type in a better name for the monster";
		String betterMonsterName = monsterScanner.next();
		codyMonster.setMonsterName(betterMonsterName);
		System.out.println("Type in a diffrent number of eyes fo r the mosnter");
		int betterMonsterEyes = monsterScanner.nextInt();
		codyMonster.setMonsterEyes(betterMonsterEyes);
	}
	
}
	