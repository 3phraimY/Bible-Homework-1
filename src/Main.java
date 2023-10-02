
public class Main {

	public static void main(String[] args) {
		System.out.println(numOfYears(7700000000000L,13L,2));
		System.out.println(howManyToTrain(7700000000000L,13L,50));
	}
	public static int numOfYears(long population, long startingDisciples, int trainAtTime)
	{
		int years = 0;
		long disciples = startingDisciples;
		while(population > disciples)
		{
			disciples = disciples + disciples* trainAtTime;
			years = years + 3;
		}
		return years;
	}
	public static int howManyToTrain(long population, long startingDisciples, int targetYears)
	{
		int trainAtTime = 1;
		while(numOfYears(population,startingDisciples,trainAtTime) > targetYears)
		{
			trainAtTime++;
		}		
		return trainAtTime;
	}
}
