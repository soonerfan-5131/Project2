

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
		statName = statID.getStID();
	}
	public int[] calAverage() {
		//Help with this
		lettersAvg = new int[3];
		char a = statName.charAt(0);
		char b = statName.charAt(1);
		char c = statName.charAt(2);
		char d = statName.charAt(3);
		double charAvg;
		double ceiling;
		double floor;
		double avg;
		double num = a;
		double num2 = b;
		double num3 = c;
		double num4 = d;
		charAvg = (num + num2 + num3 + num4)/4.0;
		ceiling = Math.ceil(charAvg);
		floor = Math.floor(charAvg);
		avg = Math.rint(charAvg);
		lettersAvg[0] = (int)ceiling;
		lettersAvg[1] = (int)floor;
		lettersAvg[2] = (int)avg;
		return lettersAvg;
	}
	public char letterAverage() {
		return (char)calAverage()[2];
	}
}