package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'G';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel");
			break;
		case 'B':
		case 'C':
			System.out.println("İyi");
			break;
		case 'D':
			System.out.println("Vasat");
			break;
		case 'E':
			System.out.println("Kötü");
			break;
		case 'F':
			System.out.println("Çok Kötü");
			break;
		default:
			System.out.println("Geçersiz Not");

		}
	}

}
