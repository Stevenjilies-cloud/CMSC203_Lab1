import java.util.Scanner;

public class MovieDriverTask2 {
	public static void main (String [] args) {
		
		Scanner keyboard = new Scanner(System.in);
		Movie movie = new Movie();
		boolean answer = true;
		
		while (answer == true)
		{
			System.out.println("Enter the title of a movie");
			movie.setTitle(keyboard.nextLine());
			
			System.out.println("Enter the rating of the movie");
			movie.setRating(keyboard.nextLine());
			
			System.out.println("Enter the number of tickets sold for this movie");
			movie.setSoldTickets(keyboard.nextInt());
			keyboard.nextLine();
			
			System.out.println(movie.toString());
			
			System.out.println("Do you want to enter another (y or n) ?");
			
			String choice = keyboard.nextLine().toLowerCase();
		
			if (choice.equals("y")) 
			{
				answer = true;
			}
			else if (choice.equals("n")) 
			{
				answer = false;
				System.out.println("Goodbye");
			}		
			
			keyboard.close();
		}	
	}
}
