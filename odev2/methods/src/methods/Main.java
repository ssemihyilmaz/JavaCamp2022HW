package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacakSayi = 6;
		boolean arananSayiVarMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacakSayi) {
				arananSayiVarMi = true;
				break;
			}
		}

		String mesaj=" ";
		if (arananSayiVarMi) {
			mesajVer("Sayı mevcut. " + "(" + aranacakSayi + ")");
		} else {
			mesajVer("Sayı mevcut değil. " + "(" + aranacakSayi + ")");
		}
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
