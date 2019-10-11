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
	private char a;
	private String fileLine;
	private ArrayList<String> letter = new ArrayList<String>();
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
		PosAvg p = new PosAvg();
		//Dont know how to do this
		int counter = 0;
		ArrayList<String> temp = p.getFile();
		for(int i = 0;  i < temp.size(); i++) {
			String myStat = temp.get(i);
			a = myStat.charAt(0);
			avgLetter = meso.letterAverage();
			if(avgLetter == a) {
				letter.add(myStat);
				counter++;
				return counter;
			}
			else {
				return counter;
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
