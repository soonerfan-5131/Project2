
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class PosAvg {
	private String str;
	private String temp;
	ArrayList<String> file = new ArrayList<String>();
	//Default constructor
	public PosAvg() {
		
	}
	//PosAvg constructor
	public PosAvg(String str) throws IOException{
		readFile("Mesonet.txt");
		this.str = str;
	}
	//Read method to read in Mesonet.txt
	public void readFile(String fileName) throws IOException {
		String fileLine;
		String parse = "";
		BufferedReader br = new BufferedReader(new FileReader("Mesonet.txt"));
		
		//Skip first three lines
		for(int i = 0; i < 3; i++) {
			br.readLine();
		}
		//fileLine = br.readLine();
		//fileLine = br.readLine();
		//fileLine = br.readLine();
		fileLine = br.readLine();
		while(fileLine != null) {
			parse = (String) fileLine.subSequence(1,5);
			file.add(parse);
			fileLine = br.readLine();
		}
		br.close();
	}
	public void showArray() {
		for(int i = 0; i < file.size(); i++) {
			System.out.println(file.get(i));
		}
	}
	//Find the index of the station
	public int indexOfStation() {
		int statIndex = 0;
		for(int i = 0; i < file.size(); i++) {
			temp = file.get(i);
			//System.out.println(temp);
			if(str.equals(temp)) {
				statIndex = file.indexOf(temp);
				return statIndex;
			}
		}
		return statIndex;
	}
	//toString method.  Finish later
	public String toString() {
		//Help with error on line below
		String city = file.get(indexOfStation() + 1);
		
		String city2 = file.get(indexOfStation() - 1);
		
		String city3 = file.get(indexOfStation() + 2);
		
		String city4 = file.get(indexOfStation() - 2);
		
		return String.format("This index is average of %s and %s, %s and %s, and so on.", city2, city, city4, city3);
	}
	public ArrayList<String> getFile() {
		return file;
	}
}
