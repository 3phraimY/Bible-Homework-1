
public class Main {

	public static void main(String[] args) {
		System.out.println(numOfYears(7700000000000L,13L,2));
		System.out.println(howManyToTrain(7700000000000L,13L,50));
	}
	//solves for number of years it will take for all of population to be disciples
	//takes in the population, how many disciples to start, and how many people each disciple can train at once
	//returns the number of years required as an int
	public static int numOfYears(long population, long startingDisciples, int trainAtTime)
	{
		int years = 0;
		long disciples = startingDisciples;
		//loops until disciples are greater than total population
		while(population > disciples)
		{
			//each disciple trains an additional # = how many can train at once
			disciples = disciples + disciples* trainAtTime;
			//this training takes 3 years
			years = years + 3;
		}
		return years;
	}
	//solves for how many people each disciple must train at a time to meet a specific deadline
	//takes in the total population, # Disciples at beginning, and how many years on the deadline
	public static int howManyToTrain(long population, long startingDisciples, int targetYears)
	{
		int trainAtTime = 1;
		//calls the function numOfYears until it meets the deadline
		//each time it fails, the # that can be trained at a time is incremented
		while(numOfYears(population,startingDisciples,trainAtTime) > targetYears)
		{
			trainAtTime++;
		}		
		return trainAtTime;
	}
}
