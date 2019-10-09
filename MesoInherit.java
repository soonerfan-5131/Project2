

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
		int[] temp = new int[4];
		lettersAvg = new int[4];
		statName = statID.getStID();
		char[] letters = new char[4];
		letters = statName.toCharArray();
		firstLetter = letters[0];
		secondLetter = letters[1];
		thirdLetter = letters[2];
		lastLetter = letters[3];
		int a = firstLetter;
		a = temp[0];
		int b = secondLetter;
		b = temp[1];
		int c = thirdLetter;
		c = temp[2];
		int d = lastLetter;
		d = temp[3];
		for(int i = 0; i < temp.length; i++) {
			sum += temp[i];
		}
		int avg = sum/4;
		avg = lettersAvg[0];
		return lettersAvg;
	}
	public char letterAverage() {
		char a = 'a';//stub
		return a;//stub
		
	}
}