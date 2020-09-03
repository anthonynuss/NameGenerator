package generator;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	public static void main(String args[]) throws FileNotFoundException {
		Word adjective = new Word(new File("..//NameGenerator//resources//adjectives.txt"));
		Word name = new Word(new File("..//NameGenerator//resources//first-names.txt"));
		
		System.out.println(adjective.getAdjective() +" " +name.getName());
	}
}
