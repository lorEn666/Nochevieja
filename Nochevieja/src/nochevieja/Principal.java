package nochevieja;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		String hora = "";

		do {
			hora = leer.next();
			if (hora.equals("00:00"))
				break;
			System.out.println(1440 - (Integer.valueOf(hora.substring(0, 2)) * 60 + Integer.valueOf(hora.substring(3, 5))));
		} while (true);
	}
}
