package utility;

import java.util.Scanner;

public class GlavniExcellProgram {

	public static void main(String[] args) {

		ExcelUtils.setExcell("Data(DOM).xls");
		ExcelUtils.setWorkSheet(0);
		Poi2.main();
		Scanner sc = new Scanner(System.in);
		int izbor;
		do {
			System.out.println("Izaberite:\n1 - Novi unos\n0 - Izlaz");
//			stringIzbor = sc.nextLine();
//			int stringUBroj = Integer.parseInt(stringIzbor);
//			ovo je trebao da bude drugi deo domaceg, ali nisam uspeo da ga bez greske uklopim u zadatak
			izbor = sc.nextInt();
			switch (izbor) {
			case 1:
				System.out.println("Unesite sledeci broj: ");
				int novi = sc.nextInt();
				ExcelUtils.setDataAt(ExcelUtils.getRowNumber(), 0, novi);
				Poi2.main();
				break;
			case 0:
				System.out.println("Kraj programa!");
				break;
			default:
				System.out.println("Pogresan unos!");
				break;
			}
		} while (izbor != 0);
		ExcelUtils.closeExcell();
	}
}