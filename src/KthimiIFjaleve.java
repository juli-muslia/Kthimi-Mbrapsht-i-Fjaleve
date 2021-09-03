import java.util.Scanner;

public class KthimiIFjaleve {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vendosni Fjalen qe doni ta ktheni mbrapsht: ");
		String fjala = sc.next();

		String mbrapsht = modifikimiMbrapsht(fjala);
		System.out.println("Fjala qe ju dhate pas konvertimit eshte: ");
		System.out.println(mbrapsht);
	}

	public static String modifikimiMbrapsht(String f) {
		char[] shkronjat = new char[f.length()];

		int indexShkronjash = 0;

		for (int i = f.length() - 1; i >= 0; i--) {
			shkronjat[indexShkronjash] = f.charAt(i);
			indexShkronjash++;
		}
		
		String modifiko ="";
		for (int i = 0; i<f.length(); i++) {
			modifiko = modifiko + shkronjat[i];
		}
		return modifiko;
	}
}
