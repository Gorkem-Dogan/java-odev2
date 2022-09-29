package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		String harf ="O";
		switch (harf) {
		case "A":
		case "I":
		case "O":
		case "U":
			System.out.println("girdiğiniz harfler kalın seslidir");
			break;
		default:
			System.out.println("girdiğiniz harfler ince sesli harflerdir.");
		}
	}

}
