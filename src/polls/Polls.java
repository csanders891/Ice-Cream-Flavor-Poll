package polls;
import java.util.Scanner;
public class Polls {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		int votes = 0;
		int votesForChocolate = 0;
		int votesForVanilla = 0;
		int votesForStrawberry = 0;
		
		while( votes < 500)
		{
			System.out.println("Voter " + (votes + 1) + ":");
			System.out.println("Select your favorite ice cream flavor");
			System.out.println("1. Chocolate");
			System.out.println("2. Vanilla");
			System.out.println("3. Strawberry");
			int choice = keyboard.nextInt();
			
			//input validation
			while(choice < 1 || choice > 3)
			{
				System.out.println("Invalid entry.  Try again");
				choice = keyboard.nextInt();
			}
			
			if(choice == 1)
				votesForChocolate ++;
			
			if(choice == 2)
				votesForVanilla++;
			
			if(choice == 3)
				votesForStrawberry++;
			
			votes++;
		}
		
		//top choice
		int largest = 0;
		String mostPopular = " ";
		
		if(votesForChocolate > largest)
		{
			largest = votesForChocolate;
			mostPopular = "Chocolate";
		}
			
		
		if(votesForVanilla > largest)
		{
			largest = votesForVanilla;
			mostPopular = "Vanilla";
		}
		
		
		if(votesForStrawberry > largest)
		{
			largest = votesForStrawberry;
			mostPopular = "Strawberry";
		}
		
		//bottom choice
		int smallest = largest;
		String leastPopular = mostPopular;
		
		if(votesForChocolate < smallest)
		{
			smallest = votesForChocolate;
			leastPopular = "Chocolate";
		}
		
		if(votesForVanilla < smallest)
		{
			smallest = votesForVanilla;
			leastPopular = "Vanilla";
		}
		
		if(votesForStrawberry < smallest)
		{
			smallest = votesForStrawberry;
			leastPopular = "Strawberry";
		}
		
		//if its a 3 way tie
		if(leastPopular == mostPopular)
			leastPopular = "Vanilla";

		//middle choice
		int middle = votes - smallest - largest;
		String secondMostPopular = leastPopular;
		
		if(middle == votesForChocolate)
			secondMostPopular = "Chocolate";
		
		if(middle == votesForVanilla)
			secondMostPopular = "Vanilla";
		
		if(middle == votesForStrawberry)
			secondMostPopular = "Strawberry";
		
			
		//results (%)
		double l = largest;
		double m = middle;
		double s = smallest;
		
		double topPercentage = (l/votes) * 100.00;
		double middlePercentage = (m/votes) * 100.00;
		double bottomPercentage = (s/votes) * 100.00;
		
		System.out.println(" ");
		System.out.println("Results:");
		System.out.println(mostPopular + ": " + Math.round(topPercentage) + "%");
		System.out.println(secondMostPopular + ": " + Math.round(middlePercentage) + "%");
		System.out.println(leastPopular + ": " + Math.round(bottomPercentage) + "%");
		
			
	}
}

