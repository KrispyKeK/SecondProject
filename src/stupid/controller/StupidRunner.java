package stupid.controller;
import java.util.*;
public class StupidRunner {
	public static void main(String[]args) {
		int i = 0;
		StupidController firstApp = new StupidController();
		firstApp.start();
		Scanner in = new Scanner(System.in);
		while (i == 0) {
			System.out.print("Type: ");
			String inp = in.nextLine();
			System.out.println("");
			if (inp.contains("q") == true) {
				System.out.println("Nonsensicle weeabo screaming");
				i++;
			}
			else {
				System.out.println("defeat");
			}
		}
	}
}
