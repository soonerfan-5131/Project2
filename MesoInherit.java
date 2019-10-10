

public class MesoInherit extends MesoAbstract{
	MesoStation statID = new MesoStation("OKCE");
	private int[] lettersAvg;
	private char firstLetter;
	private char secondLetter;
	private char thirdLetter;
	private char lastLetter;
	private String statName;
	private int sum;
	//Default constructor
	public MesoInherit() {
		
	}
	//MesoInherit constructor
	public MesoInherit(MesoStation statID) {
		this.statID = statID;
	}
	public int[] calAverage() {
		//Help with this
		lettersAvg = new int[3];
		char a = statName.charAt(0);
		double charAvg;
		double ceiling;
		double floor;
		double avg;
		return lettersAvg;
	}
	public char letterAverage() {
		char a = 'a';//stub
		return a;//stub
		
	}
}