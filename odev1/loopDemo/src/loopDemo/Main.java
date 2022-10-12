package loopDemo;

public class Main {

	public static void main(String[] args) {
//		for
		for(int i=1 ; i<10 ; i++) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti");
		

//		while
		int i = 1;
		while (i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While Döngüsü Bitti");
		
		
//		doWhile
		int j = 2;
		do {
			System.out.println(j);
			j+=2;
		} while (j<10);
		System.out.println("doWhile Döngüsü Bitti");
		
	}

}
