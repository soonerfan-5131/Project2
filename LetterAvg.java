import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LetterAvg {
	ArrayList<String> file = new ArrayList<String>();
	PosAvg p = new PosAvg();
	MesoInherit meso = new MesoInherit();
	private String myStat;
	private char avgLetter;
	private char myChar;
	private String fileLine;
	private char c;
	private ArrayList<String> letter = new ArrayList<String>();
	//Default constructor
	public LetterAvg() {
		
	}
	//LetterAvg constructor
	public LetterAvg(char c) throws IOException {
		readFile("Mesonet.txt");
		this.avgLetter = c;
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
		PosAvg p = new PosAvg();
		//MesoInherit meso = new MesoInherit();
		
		int counter = 0;
		ArrayList<String> temp = p.getFile();
		for(int i = 0;  i < temp.size(); i++) {
			String myStat = temp.get(i);
			
			if(c == myStat.charAt(0)) {
				counter++;
				letter.add(myStat);
			}
		}
		return counter;
	}
	//toString method
	public String toString() {
		String str = "\nThey are:";
		str = str + "\n" + letter;
		return str;
	}
}
