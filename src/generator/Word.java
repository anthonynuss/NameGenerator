package generator;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Word {

	public String word;
	public int randNum;
	public File f;
	
	public Word(File f) {
		this.f = f;
		Random r = new Random();
	}
	
	public int getRand(int rows) {
		Random r = new Random();
		randNum = r.nextInt(rows);
		randNum++;
		return randNum;
	}
	public String getAdjective() throws FileNotFoundException {
		Scanner s = new Scanner(f);
		int rand = getRand(228);
		
		String adjective = "";
		for(int i = 0; i <= rand; i++) {
			adjective = s.next();
		}
		s.close();
		return adjective;
	}
	
	public String getName() throws FileNotFoundException {
		Scanner s = new Scanner(f);
		int rand = getRand(4945);
		
		String name = "";
		for(int i = 0; i <= rand; i++) {
			name = s.next();
		}
		s.close();
		return name;
	}
}
