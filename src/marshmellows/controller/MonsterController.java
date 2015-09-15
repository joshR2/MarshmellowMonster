package marshmellows.controller;
import marshmellows.view.MarshmellowOutput;
import marshmellows.model.MarshmellowMonster;
public class MonsterController
{
	private MarshmellowMonster joshMonster;
	private MarshmellowOutput myOutput;
	
	public MonsterController()
	{
		int eyes = 1;
		double legs = 3.5;
		double hair=3;
		int noses =2;
		boolean hasBellyButton = false;
				String name = "yuck old candy";
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
	}
	
	
	
	}