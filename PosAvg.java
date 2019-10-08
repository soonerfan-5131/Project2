
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
	public PosAvg(String str) {
		this.str = str;
	}
	//Read method to read in Mesonet.txt
	public void readFile(String fileName) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("Mesonet.txt"));
		
		//Skip first three lines
		for(int i = 1; i <= 3; i++) {
			br.readLine();
		}
		String fileLine = br.readLine();
		while(fileLine != null) {
			
		}
	}
	//Find the index of the station
	public int indexOfStation() {
		int statIndex = 0;
		for(int i = 0; i < file.size(); i++) {
			temp = file.get(i);
			if(str.equals(temp)) {
				statIndex = file.indexOf(temp);
			}
		}
		return statIndex;
	}
	//toString method.  Finish later
	public String toString() {
		String city = file.get(indexOfStation() + 1);
		
		String city2 = file.get(indexOfStation() - 1);
		
		String city3 = file.get(indexOfStation() + 2);
		
		return city;//stub
	}
}
