import java.util.Scanner;
import java.io.File;

public class WordCount {
	public static void main(String[] args) throws Exception {
		File file = new File("ataleoftwocities.txt");
		Scanner scanner = new Scanner(file); 
		int word = 0;
		while(scanner.hasNextLine()) {
			
			String line = scanner.nextLine();
			word+=line.split(" ").length;
		}
		System.out.println("the book have " +word + " Words");
	}

	

}
