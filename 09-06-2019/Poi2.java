package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Poi2 {
//	Napisati program koji racuna sumu brojeva
//	koji se nalaze prvom worksheet-u Excel tabele koji se zove Brojevi.
//	U tabeli se svi brojevi nalaze u prvoj koloni.
//	Program treba da cita red po red iz tabele i upisane brojeve dodaje na sumu.
//	Krajnju sumu nakon toga treba da ispise u konzoli.
//	Potrebno je omoguciti da program radi i ukoliko se u datu tabelu doda jos brojeva.
//	Hint:
//	Pogledajte ApachePOI biblioteke kako biste nasli metodu
//	koja vraca index poslednjeg reda koji je ubacen.
//	Istraziti kako neki String prevesti u int.

	public static void main() {
		try {
			File src = new File("Data(DOM).xls");
			FileInputStream fis = new FileInputStream(src);
			HSSFWorkbook wbe = new HSSFWorkbook(fis);
			HSSFSheet sheet0 = wbe.getSheetAt(0);
			int rowcount = sheet0.getLastRowNum();
			System.out.println("Ukupan broj redova je " + (rowcount + 1));
			int sum = 0;
			for (int i = 0; i <= rowcount; i++) {
				HSSFRow r = sheet0.getRow(i);
				if (r != null) {
					double data0 = r.getCell(0).getNumericCellValue();
					sum += data0;
				} else {
					System.out.print("***Prazan red***");
				}
//				r = sheet0.getRow(i-1);
			}
			System.out.println("Suma svih brojeva je " + sum + ".");
			wbe.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
