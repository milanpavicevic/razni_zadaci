package prinosi;

public class GlavniPrinos {

	public static void main(String[] args) {
		// Napisati i glavni program koji kreira NIZ parcela
		// koje mogu da budu ili sume ili njive
		// i ispisuje njihov prinos u toku 3 godine
		Njiva n1 = new Njiva(100, 10);
		Njiva n2 = new Njiva(200, 15);
		Suma s1 = new Suma(100, 5, 5, 1);
		Suma s2 = new Suma(150, 6, 7, 2);
		Parcela[] njive = { n1, n2 };
		Parcela[] sume = { s1, s2 };
		double prinos3 = 0;
		for (int i = 0; i < njive.length; i++) {
			prinos3 += njive[i].prinos();
		}
		System.out.println("Trogodisnji prinos za ove njive je " + (prinos3 * 3));
		for (int i = 0; i < sume.length; i++) {
			prinos3 += sume[i].prinos();
		}
		System.out.println("Trogodisnji prinos za ove sume je " + (prinos3 * 3));
	}

}
