import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LetterAvg {
	private char avgLetter;
	//Default constructor
	public LetterAvg() {
		
	}
	//LetterAvg constructor
	public LetterAvg(char avgLetter) {
		this.avgLetter = avgLetter;
	}
	//read method
	public void readFile() throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("Mesonet.txt"));
		
		for(int i = 1; i <= 3; i++) {
			br.readLine();
		}
		String fileLine = br.readLine();
		while(fileLine != null) {
			
		}
	}
	//number of stations with letter average method
	public int numberOfStationWithLetterAvg() {
		return 0;//stub
	}
	//toString method
	public String toString() {
		return null;//stub
	}
}
