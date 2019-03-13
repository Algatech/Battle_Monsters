/*
COMP517
Monster Code
Samir Al Gamri
m7saag/200630532
University of Liverpool
13/10/2017
*/

class Monster

//Variables for the monster's name, strength, wrath as well as number of wins, losses and draws.
{ 	
	private String name;
	private int strength;		
	private int wrath;
	private int win;
	private int loss;
	private int draw;
	
/*
Monster's Strength and Wrath references and data types associated with each variable.
Win, loss and draw variables are listed as a default setting of "0" to start with.
*/
	
	public Monster(String n, int s, int wr)
	   
	{
		strength = s;
		wrath = wr;
		name = n;
		win = 0;
		loss = 0;
		draw = 0;
	}

// When a monster has achieved a victory, this adds a value of 1 to the monster's stored win value when called.
	
	public void win()
	
	{
		win++;
	}
	
// When a monster suffers a loss, this adds a value of 1 to the monster's stored loss value when called.
	
	public void loss()
	
	{
		loss++;
	}
	
// When a monster draws a fight, this adds a value of 1 to the monster's stored draw value when called.
	
	public void draw()
	
	{
		draw++;
	}
	
// An integer number of the monster's stored win value is returned to the main method when called.
	
	public int getWins()
	
	{
		return win;
	}

// An integer number of the monster's stored win value is returned to the main method when called.
	
	public int getLosses()
	
	{
		return loss;
	}
	
// An integer number of the monster's stored win value is returned to the main method when called.
	
	public int getDraws()
	
	{
		return draw;
	}
	
// An integer number of the monster's stored wrath value is returned to the main method when called.
	
	public int getWrath()
	
	{
		return wrath;
	}
	
// An integer number of the monster's stored strength value is returned to the main method when called.
	
	public int getStrength()
	
	{
		return strength;
	}
	
// An String value of the monster's stored name is returned to the main method when called.
	
	public String getName()
	
	{
		return name;
	}
	
// A string value is printed of the monster's fight history when this method is called.
	
	public void getBattlePerformance()

	{
		System.out.println(name + " - Monster's Performance - Wins: " + win + " Losses: " + loss + " Draws: " + draw + ". ");
	}
		
}

// End of class programme

/*


*/