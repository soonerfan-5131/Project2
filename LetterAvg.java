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
	public void readFile(String fileName) throws IOException {
		String fileLine;
		String parse = "";
		BufferedReader br = new BufferedReader(new FileReader("Mesonet.txt"));
		
		//Skip first three lines
		for(int i = 0; i < 3; i++) {
			br.readLine();
		}
		fileLine = br.readLine();
		while(fileLine != null) {
			parse = (String) fileLine.subSequence(1,5);
			file.add(parse);
			fileLine = br.readLine();
		}
		br.close();
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
