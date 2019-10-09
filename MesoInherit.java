

public class MesoInherit extends MesoAbstract{
	MesoStation statID = new MesoStation("OKCE");
	private int[] lettersAvg;
	private char firstLetter;
	private char secondLetter;
	private char thirdLetter;
	private char lastLetter;
	private String statName;
	//Default constructor
	public MesoInherit() {
		
	}
	//MesoInherit constructor
	public MesoInherit(MesoStation statID) {
		this.statID = statID;
	}
	public int[] calAverage() {
		//Help with this
		lettersAvg = new int[4];
		statName = statID.getStID();
		char[] letters = new char[4];
		letters = statName.toCharArray();
		firstLetter = letters[0];
		secondLetter = letters[1];
		thirdLetter = letters[2];
		lastLetter = letters[3];
		int a = firstLetter;
		a = lettersAvg[0];
		int b = secondLetter;
		b = lettersAvg[1];
		int c = thirdLetter;
		c = lettersAvg[2];
		int d = lastLetter;
		d = lettersAvg[3];
		return lettersAvg;
	}
	public char letterAverage() {
		char a = 'a';//stub
		return a;//stub
		
	}
}