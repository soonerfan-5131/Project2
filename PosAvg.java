import java.util.ArrayList;

public class PosAvg {
	private String str;
	ArrayList<String> file = new ArrayList<String>();
	//Default constructor
	public PosAvg() {
		
	}
	//PosAvg constructor
	public PosAvg(String str) {
		this.str = str;
	}
	//Find the index of the station
	public int indexOfStation() {
		String temp = "";
		int statIndex = 0;
		for(int i = 0; i < file.size(); i++) {
			temp = file.get(i);
			if(str.equals(temp)) {
				statIndex = file.indexOf(temp);
			}
		}
		return statIndex;
	}
}
