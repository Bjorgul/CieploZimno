import java.util.Scanner;
import java.util.Random;

public class CieploZimno {

	public static void main(String ARGS[]) {

		Scanner scanner = new Scanner(System.in);

		int liczba;
		Random random = new Random();
		liczba = random.nextInt(50) + 1;
	//	 System.out.println(liczba + " POPRAWNE"); // Podaje poprawn� liczb� - do test�w
		int x = 0;
		int pytanie;

		System.out.println("Podaj liczb� od 1 do 50");
		while (x == 0) {

			pytanie = scanner.nextInt();

			if (pytanie > liczba) {
				System.out.println("Podaj mniejsz� liczb�");
			}
			if (pytanie < liczba) {
				System.out.println("Podaj wi�ksz� liczb�");
			}
			if (pytanie == liczba) {
				System.out.println("Dobra liczba");
				x++;

			}
		}
		scanner.close();
	}
}
