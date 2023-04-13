import java.util.Scanner;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		
		var sc = new Scanner(System.in);
		var rand = new Random();
		System.out.println("Welcome player");
		
		String playermove;
		
		int playerscore = 0;
		int computerscore = 0;
		
		while(true) {
			
			String rps[] = {"r", "p", "s"};
			
			int computer = rand.nextInt(rps.length);
			
			String computermove = rps[computer];
			
		while(true) {
			
			System.out.print("R|P|S: ");
			playermove = sc.nextLine();
			
			if(playermove.equalsIgnoreCase("r") || playermove.equalsIgnoreCase("p") || playermove.equalsIgnoreCase("s")) {
				break;
			}
			System.out.println("Invalid Move");
			
		}
			System.out.println("Computer Move:" + computermove);
			if(computermove.equalsIgnoreCase(playermove)) {
				System.out.println("TIED");
			}else if(computermove.equalsIgnoreCase("r") && playermove.equalsIgnoreCase("s")) {
				System.out.println("Computer Win");
				computerscore++;
			}else if(computermove.equalsIgnoreCase("r") && playermove.equalsIgnoreCase("p")) {
				System.out.println("Player Win");
				playerscore++;
			}else if(computermove.equalsIgnoreCase("p") && playermove.equalsIgnoreCase("r")) {
				System.out.println("Computer Win");
				computerscore++;
			}else if(computermove.equalsIgnoreCase("p") && playermove.equalsIgnoreCase("s")) {
				System.out.println("Player Win");
				playerscore++;
			}else if(computermove.equalsIgnoreCase("s") && playermove.equalsIgnoreCase("p")) {
				System.out.println("Computer Win");
				computerscore++;
			}else if(computermove.equalsIgnoreCase("s") && playermove.equalsIgnoreCase("r")) {
				System.out.println("Player Win");
				playerscore++;
			}
			System.out.println("Player Score: " + playerscore);
			System.out.println("Computer Score: " + computerscore);
		}
	}

}
