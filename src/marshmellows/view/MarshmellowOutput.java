package marshmellows.view;

import javax.swing.JOptionPane;
public class MarshmellowOutput
{
	public void displayMonsterInfo(String info)
	{
	System.out.println("My monster info is: " + info);
	}
	
	public void displayMonsterGUI(String info)
	{
		JOptionPane.showMessageDialog(null, "My moter information is:" + info);
	}


}
