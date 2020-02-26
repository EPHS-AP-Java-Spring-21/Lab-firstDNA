// hello
public class TestCases {

	public static void main(String[] args) {
		//write methods
		String patient1 = "ACGATCGATCGATCGATGTGCAGACTAGCGATGAGCTAGCTGAGATCGGATGCTAGCTAGCTAGCATCGATCGATCGACTACGCTAGCTAGCCTAGCATCGACTGCATCGACTAGCATCGACTAGCTAAGCATCAGCTCGACTAGCACGTTCGAGATCGAATCGATGCATCGCATCGACTCGATCGACTAGCGCATCAGTAGCGAT";
		String patient2 = "GATCGACTGGTCAGATGCTAGCTAGCTAGCATCGATCGATCGACTACGCTAGCTAGCCTAGCATCGACTGCATCGACTAGCATCGACTAGCTAAGCATCAGCTCGACTAGCATCGATGCATCGCATCCGTAGATCATGACGAGACTCGATCGACTAGCGCATCAGTAGCGATTCGATGCAACTGGTCATCGCATC";
		String patient3 = "CACTGGTCATAGCTGAGATCGGATGCTAGCTAGCTAGCATCGGTACCAGTACGATCAGATCGATCGACTACGCTAGCTAGCCTAGCATCGACTGCATCGACTAGCATCGACTAGCTAAGCATCAGCTCGACTAGCATCGATGCATCACGTTCGAGATCGAGCATCGACTCGATCGACTAGCGCATCAGTAGCGATGATCGACTAGCGCATC";

		printReport(patient1);
		printReport(patient2);
		printReport(patient3);

	}

	private static void printReport(String patient) {
		System.out.println("DNA Test");
		System.out.println("Picard Syndrome: " + hasPicardSyndrome(patient));
		System.out.println("Riker Syndrome: " + hasRikerSyndrome(patient));
		System.out.println("Troi Syndrome: " + hasTroiSyndrome(patient));
		System.out.println("LaForge Syndrome: " + hasLaForgeSyndrome(patient));
		System.out.println("Worf Syndrome: " + hasWorfSyndrome(patient));

	}

	private static boolean hasWorfSyndrome(String patient) {
		// TODO Auto-generated method stub
		return true;
	}

	private static boolean hasLaForgeSyndrome(String patient) {
		// TODO Auto-generated method stub
		return true;
	}

	private static boolean hasTroiSyndrome(String patient) {
		// TODO Auto-generated method stub
		return true;
	}

	private static boolean hasRikerSyndrome(String patient) {
		// TODO Auto-generated method stub
		return true;
	}

	private static boolean hasPicardSyndrome(String patient) {
		// TODO Auto-generated method stub
		return true;
	}

}
