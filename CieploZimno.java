import java.util.Scanner;
import java.util.Random;

public class CieploZimno {

	public static void main(String ARGS[]) {

		Scanner scanner = new Scanner(System.in);

		int liczba;
		Random random = new Random();
		liczba = random.nextInt(50) + 1;
	//	 System.out.println(liczba + " POPRAWNE"); // Podaje poprawn¹ liczbê - do testów
		int x = 0;
		int pytanie;

		System.out.println("Podaj liczbê od 1 do 50");
		while (x == 0) {

			pytanie = scanner.nextInt();

			if (pytanie > liczba) {
				System.out.println("Podaj mniejsz¹ liczbê");
			}
			if (pytanie < liczba) {
				System.out.println("Podaj wiêksz¹ liczbê");
			}
			if (pytanie == liczba) {
				System.out.println("Dobra liczba");
				x++;

			}
		}
		scanner.close();
	}
}
