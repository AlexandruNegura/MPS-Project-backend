package mps.fifa;

public class ParseTest {
	public static void main(String[] args) {
		Parser p = new Parser();
		p.parse("resources/CSV_all.csv");
		p.printParsedData();
		p.sendParsedDataToDatabase();
	}
}
