public class Computer
{
	//instance / member variables
   private String choice;
   
	public Computer()
	{
		this.randomSetChoice();
	}
	
	public String getChoice()
	{
		return choice;
	}
	
	public void randomSetChoice()
	{
		//use Math.random()
		//use switch case
      int num = (int)(Math.random())*3;
      switch (num)
      {
      case 0: choice = "rock";
              break;
      case 1: choice = "paper";
              break;
      case 2: choice = "scissors";
              break;
      default: choice = "rock";
      }
	}	
		
	/*
	 didIWin(Player p) will return the following values
	 	0 - both players have the same choice
	 	1 - the computer had the higher ranking choice
	 	-1 - the player had the higher ranking choice
	 */	
	public int didIWin(Player p)
	{
   
      if (p.getChoice().equals(choice))
         return 0;
      else if ((choice.equals("rock") && p.getChoice().equals("scissors")) || (choice.equals("paper") && p.getChoice().equals("rock")) || (choice.equals("scissors") && p.getChoice().equals("paper")))
         return 1;
      else
		return -1;		
	}
	
	public String toString()
	{
		return "";
	}		   
}