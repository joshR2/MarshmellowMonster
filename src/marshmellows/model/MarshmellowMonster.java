package marshmellows.model;

public class MarshmellowMonster
{

	private String monsterName;
	private int monsterEyes;
	private int monsterNoses;
	private double monsterHair;
	private double monsterLegs;
	private boolean monsterBellyButton;
	
	private MarshmellowMonster()
	
	{
	
	}
	public MarshmellowMonster(String monstername, int monsterEyes, int monsterNoses, double monsterHair, double monsterLegs, boolean monsterBellyButton)
	{
		this.monsterName=monsterName;
		this.monsterEyes=monsterEyes;
		this.monsterNoses=monsterNoses;
		this.monsterLegs=monsterLegs;
		this.monsterHair=monsterHair;
		this.monsterBellyButton=monsterBellyButton;
	}
	//Getters & Settters
	public String getMonsterName()
	{
		return monsterName;
	}
	
	public int getMonsterEyes()
	{
		return monsterEyes;
	}
	
	public int getMonsterNoses()
	{
		return monsterNoses;
	}
	
	
	
	
	
	
	public void setMonsterName(String monsterName)
	{
		this.monsterName=monsterName;
	}
	
	public void setMonsterEyes (int monsterEyes)
	{
		this.monsterEyes=monsterEyes;
	}
	public void setMonster
	
	public String toString()
	{
		String monster = "This monster has" +monsterEyes + "eyes, and its' name is" + monsterName + "it has" + monsterNoses + " pink noses" + " it also has" + monsterLegs + "blue legs" + " and "+ monsterHair + "strands of hair on their hair" + " and no belly button" ;
		
		return monster;
	}
	{
	}
		
		}