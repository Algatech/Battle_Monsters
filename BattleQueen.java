/*
COMP517
BattleQueen Code
Samir Al Gamri
m7saag/200630532
University of Liverpool
13/10/2017
*/

import java.util.Scanner;

// BattleQueen Class

public class BattleQueen

// BattleQueen Class Variables

{
	private Monster Monster1;
	private Monster Monster2;
	private Monster Monster3;
	private Monster Monster4;

// Battle Queen Object storing each monster reference

	public BattleQueen(Monster ma, Monster mb, Monster mc, Monster md)

	{
		Monster1 = ma;
		Monster2 = mb;
		Monster3 = mc;
		Monster4 = md;
	}

/*
Method to make each monster fight each other with if statements. (Seemed to be more efficient than making a method for each fight between each unique pairing of monsters).
Firstly comparing strength and determining a winner and a loser and having these resulted recorded for each monster.
If strength is equal, then a new nested if statement will be enacted comparing wrath again determining a winner and a loser or, if both monster's numbers are equal, then a draw and having these resulted recorded.
*/

	public static void Battle(Monster m1, Monster m2)

	{
		if	(m1.getStrength() > m2.getStrength()) //if first monster's strength is greater than the second monster then a value of 1 is added to the first monster's "win" value, and a value of 1 is added to the second monsters "loss" value.
			{
				m1.win();
				m2.loss();
				System.out.println("Oh what a fight! Both " + m1.getName() + " and " + m2.getName() + " fought well.");
			}
		else if	(m1.getStrength() < m2.getStrength()) //if first monster's strength is less than the second monster then a value of 1 is added to the first monster's "loss" value, and a value of 1 is added to the second monsters "win" value.
			{
				m1.loss();
				m2.win();
				System.out.println("Oh what a fight! Both " + m1.getName() + " and " + m2.getName() + " fought well.");
			}
		else if (m1.getStrength() == m2.getStrength()) // If the strength values are the same then the a new nested if statement is initiated.
		{
			if	(m1.getWrath() > m2.getWrath()) //if first monster's wrath is greater than the second monster then a win value of 1 is added to the first monster's "win" value, and a value of 1 is added to the second monsters "loss" value.
				{
					m1.win();
					m2.loss();
					System.out.println("Oh what a fight! Both " + m1.getName() + " and " + m2.getName() + " fought well.");
				}
			else if	(m1.getWrath() < m2.getWrath()) //if first monster's wrath is less than the second monster then a value of 1 is added to the first monster's "loss" value, and a value of 1 is added to the second monsters "win" value.
				{
					m1.loss();
					m2.win();
					System.out.println("Oh what a fight! Both " + m1.getName() + " and " + m2.getName() + " fought well.");
				}
			else if (m1.getWrath() == m2.getWrath()) // If the wrath values are the same then a value of 1 is added to each monster's "draw" value.
				{
					m1.draw();
					m2.draw();
					System.out.println("Oh what a fight! Both " + m1.getName() + " and " + m2.getName() + " fought well.");
				}
		}

	// Main Method

	}

	public static void main(String args[])

    {
		Scanner in = new Scanner(System.in); //Scanner implemented into code.

		// Introduced the programme, the purposes of the it and the rules which will be used to govern each fight.

        System.out.println("Hello I am the Battle Queen and I am organising a tournament containing 4 monsters. Please press ENTER to continue.");
		in.nextLine();
		System.out.println("Each Monster will fight each other once and the scores will be tallied up and reported after the tournament.");
		in.nextLine();
		System.out.println("The rules of battle are simple: the monster with the highest strength wins. If the strength values are equal, the one with the greatest wrath wins. If these are also equal, the result is a tie.");
		in.nextLine();

		/*
		Instructions given to the user that 4 monster need to be created, each needing a name, a strength and a wrath value.
		The user is told that the strength and wrath values must be a whole number between 1 and 10.
		*/

		System.out.print("Now you will need to create 4 Monsters, each with a name, a strength value and wrath value. ");
		System.out.println("Please note that each monster is only allowed to have one name and both values must be a whole number ranging between 1 and 10.");
		in.nextLine();

		/*
		Input taken from the user to create Monster 1, using string input for the name and 2 integer numbers for the strength and wrath.
		The user is told that they can not give a monster more than one name, otherwise the program will terminate.
		As I have used a in.next() rather than in.nextLine() the program will not progress if the user does not give each monster a name and will terminate if it is given more than one name.
		If the strength and wrath values entered are not a whole number between 1 and 10 then the program will issue an "Error" message and close down.
		*/

		System.out.println("What is the name of monster 1?");
		String Name1 = in.next();
		System.out.println("OK now please give me the strength of monster 1:"); // Any values which are less than 1 or greater than 10 will be printed as an error and the program will need to be reloaded
		int Strength1 = in.nextInt();
		if (Strength1 < 1 || Strength1 > 10)
		{
			System.out.println("Error: number must be between 1 and 10. Program is terminating! Please Reload BattleQueen.java. ");  // Any values which are less than 1 or greater than 10 will be printed as an error and the program will need to be reloaded
			return;
		}
		System.out.println("OK now please give me the wrath of monster 1:"); // Any values which are less than 1 or greater than 10 will be printed as an error and the program will need to be reloaded
		int Wrath1 = in.nextInt();
		if (Wrath1 < 1 || Wrath1 > 10)
		{
			System.out.println("Error: number must be between 1 and 10. Program is terminating! Please Reload BattleQueen.java. "); // Any values which are less than 1 or greater than 10 will be printed as an error and the program will need to be reloaded
			return;
		}

		// Monster 1 is created using the 3 input values from the user by accessing the Monster constructor method.

		Monster Monster1 = new Monster(Name1, Strength1, Wrath1);

		in.nextLine();

		/*
		Input taken from the user to create Monster 2, using string input for the name and 2 integer numbers for the strength and wrath.
		If the strength and wrath values entered are not a whole number between 1 and 10 then the program will issue an "Error" message and close down.
		*/

		System.out.println("What is the name of monster 2?");
		String Name2 = in.next();
		System.out.println("OK now please give me the strength of monster 2:");
		int Strength2 = in.nextInt();
		if (Strength2 < 1 || Strength2 > 10)
		{
			System.out.println("Error: number must be between 1 and 10. Program is terminating! Please Reload BattleQueen.java. "); // Any values which are less than 1 or greater than 10 will be printed as an error and the program will need to be reloaded
			return;
		}
			System.out.println("OK now please give me the wrath of monster 2:");
		int Wrath2 = in.nextInt();
		if (Wrath2 < 1 || Wrath2 > 10)
		{
			System.out.println("Error: number must be between 1 and 10. Program is terminating! Please Reload BattleQueen.java. "); // Any values which are less than 1 or greater than 10 will be printed as an error and the program will need to be reloaded
			return;
		}

		// Monster 2 is created using the 3 input values from the user by accessing the Monster constructor method.

		Monster Monster2 = new Monster(Name2, Strength2, Wrath2);

		in.nextLine();

		/*
		Input taken from the user to create Monster 3, using string input for the name and 2 integer numbers for the strength and wrath.
		If the strength and wrath values entered are not a whole number between 1 and 10 then the program will issue an "Error" message and close down.
		*/

		System.out.println("What is the name of monster 3?");
		String Name3 = in.next();
		System.out.println("OK now please give me the strength of monster 3:");
		int Strength3 = in.nextInt();
		if (Strength3 < 1 || Strength3 > 10)
		{
			System.out.println("Error: number must be between 1 and 10. Program is terminating! Please Reload BattleQueen.java. "); // Any values which are less than 1 or greater than 10 will be printed as an error and the program will need to be reloaded
			return;
		}
		System.out.println("OK now please give me the wrath of monster 3:");
		int Wrath3 = in.nextInt();
		if (Wrath3 < 1 || Wrath3 > 10)
		{
			System.out.println("Error: number must be between 1 and 10. Program is terminating! Please Reload BattleQueen.java. "); // Any values which are less than 1 or greater than 10 will be printed as an error and the program will need to be reloaded
			return;
		}

		// Monster 3 is created using the 3 input values from the user by accessing the Monster constructor method.

		Monster Monster3 = new Monster(Name3, Strength3, Wrath3);

		in.nextLine();

		/*
		Input taken from the user to create Monster 4, using string input for the name and 2 integer numbers for the strength and wrath.
		If the strength and wrath values entered are not a whole number between 1 and 10 then the program will issue an "Error" message and close down.
		*/

		System.out.println("What is the name of monster 4?");
		String Name4 = in.next();
		System.out.println("OK now please give me the strength of monster 4:");
		int Strength4 = in.nextInt();
		if (Strength4 < 1 || Strength4 > 10)
		{
			System.out.println("Error: number must be between 1 and 10. Program is terminating! Please Reload BattleQueen.java. "); // Any values which are less than 1 or greater than 10 will be printed as an error and the program will need to be reloaded
			return;
		}
		System.out.println("OK now please give me the wrath of monster 4:");
		int Wrath4 = in.nextInt();
		if (Wrath4 < 1 || Wrath4 > 10)
		{
			System.out.println("Error: number must be between 1 and 10. Program is terminating! Please Reload BattleQueen.java. "); // Any values which are less than 1 or greater than 10 will be printed as an error and the program will need to be reloaded
			return;
		}

		// Monster 4 is created using the 3 input values from the user by accessing the Monster constructor method.

		Monster Monster4 = new Monster(Name4, Strength4, Wrath4);

		in.nextLine();

		/*
		Input taken from the user to create Monster 4, using string input for the name and 2 integer numbers for the strength and wrath.
		If the strength and wrath values entered are not a whole number between 1 and 10 then the program will issue an "Error" message and close down.
		*/

		// BattleQueen now created and references of the monsters being stored in order to complete it's battle() method.

		BattleQueen Marge = new BattleQueen(Monster1, Monster2, Monster3, Monster4);

		// The tournament is completed by the BattleQueen using the battle() method. Each monster will fight each other once using the battle() method.

		// A line is printed so the user knows the fixtures of the first round of the tournament.

		System.out.println("Your monsters have now been created. The first round of the tournament will begin. " + Monster1.getName() + " will fight " + Monster2.getName() + " and " + Monster3.getName() + " will fight " + Monster4.getName() + ". Press ENTER to continue.");
		in.nextLine();

		Battle(Monster1,Monster2);
		Battle(Monster3,Monster4);

		// A line is printed so the user knows that the second round has finished and lists the fixtures of the first round of the tournament.


		System.out.println("The first round of the tournament is complete. Now the second round shall begin. " + Monster1.getName() + " will fight " + Monster3.getName() + " and " + Monster2.getName() + " will fight " + Monster4.getName() + ". Press ENTER to continue.");
		in.nextLine();

		Battle(Monster1,Monster3);
		Battle(Monster2,Monster4);

		// A line is printed so the user knows that the second round has finished and lists the fixtures of the third round of the tournament.

		System.out.println("The second round of the tournament is complete. Now the third and final round shall begin. " + Monster1.getName() + " will fight " + Monster4.getName() + " and " + Monster2.getName() + " will fight " + Monster3.getName() + ". Press ENTER to continue.");
		in.nextLine();

		Battle(Monster1,Monster4);
		Battle(Monster2,Monster3);

		// A line is printed so the user knows the tournament is over and prompts the user to press ENTER to show each monster's total wins, losses and draws.

		System.out.println("The tournament is now over. Press ENTER to show each monster's total wins, losses and draws.");
		in.nextLine();

		/*
		The fight history of each monster is printed along with its name, using the getName(), getWins() getLosses() and detDraws() methods to retrieve the updated monster info.
		Finally I have printed these results for the user to see.
		*/

		Monster1.getBattlePerformance();
		Monster2.getBattlePerformance();
		Monster3.getBattlePerformance();
		Monster4.getBattlePerformance();

		//Message is printed out at the end to thank the user for using the program and let them know that it has ended.

		System.out.println("Thank you for using BattleQueen.java. This is the end of the program, please reload this program if you wish to run another tournament.");

    }
}
