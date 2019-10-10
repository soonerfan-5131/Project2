import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LetterAvg {
	ArrayList<String> file = new ArrayList<String>();
	PosAvg p = new PosAvg();
	private char avgLetter;
	private String fileLine;
	//Default constructor
	public LetterAvg() {
		
	}
	//LetterAvg constructor
	public LetterAvg(char avgLetter) throws IOException {
		readFile(fileLine);
		this.avgLetter = avgLetter;
	}
	//read method
	public void readFile(String fileName) throws IOException {
		String parse = "";
		BufferedReader br = new BufferedReader(new FileReader("Mesonet.txt"));
		file = p.getFile();
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
		//Dont know how to do this
		return 0;//stub
	}
	//toString method
	public String toString() {
		String stat1 = file.get(numberOfStationWithLetterAvg());
		String stat2 = file.get(numberOfStationWithLetterAvg());
		String stat3 = file.get(numberOfStationWithLetterAvg());
		String stat4 = file.get(numberOfStationWithLetterAvg());
		//Dont know how to do this either
		return String.format("They are:/n" + "%s/n" + "%s/n" + "%s/n" + "%s", stat1, stat2, stat3, stat4);//stub
	}
}
