package whil;

public class Zadatak_1_13082019 {

	public static void main(String[] args) {
		// Napisati 8 primera za post inkrement (i++), pre inkrement (++i), post
		// dekrement (i--) i pre dekrement (--i) i u programu u komentarima opisati
		// kako koji primer funkcionise. Napisati po 2 primera o svakom.

		int i = 5, j = 3, k = 4;

		i = j++ - k++;
		/*
		 * Po izvrsenju ovog reda vrednosti ce biti sledece: i=-1, j=4, k=5. i je
		 * dobijeno tako sto su prvo uzete vrednosti j i k, zatim je sa njima obavljeno
		 * oduzimanje i na kraju su im dodeljene nove vrednosti uvecane za 1
		 */
		j = i++ * k++;
		/*
		 * Po izvrsenju ovog reda vrednosti ce biti sledece: i=0, j=-5, k=6. j je
		 * dobijeno tako sto su prvo uzete vrednosti i i k, zatim je sa njima obavljeno
		 * mnozenje i na kraju su im dodeljene nove vrednosti uvecane za 1
		 */
		k = ++i + ++j;
		/*
		 * Nove vrednosti : i=1, j=-4, k=-3. k je dobijeno tako sto su prvo vrednosti i
		 * i j uvecane za 1 a zatim je sa njima obavljeno sabiranje.
		 */
		i *= ++j * ++k;
		/*
		 * Nove vrednosti : i=6, j=-3, k=-2. i je dobijeno tako sto su prvo vrednosti j
		 * i k uvecane za 1 a zatim su pomnozeni medjusobno, pa sa i.
		 */
		i = j-- + k--;
		/*
		 * Nove vrednosti : i=-5, j=-4, k=-3. i je dobijeno tako sto su sabrane
		 * vrednosti k i j, a zatim su umanjene za 1.
		 */
		j = k-- * i--;
		/*
		 * Nove vrednosti : i=-6, j=15, k=-4. j je dobijeno tako sto su pomnozene
		 * vrednosti k i i, a zatim su umanjene za 1.
		 */
		i = --j - --k;
		/*
		 * Nove vrednosti : i=19, j=14, k=-5. j je dobijeno tako sto su j i k prvo
		 * umanjeni za 1 a zatim su oduzeti.
		 */
		k /= --i - --j;
		/*
		 * Nove vrednosti : i=18, j=13, k=-1. j je dobijeno tako sto su i i j prvo
		 * umanjeni za 1, zatim su oduzeti i na kraju je k podeljeno njihovom razlikom.
		 */
	}

}
