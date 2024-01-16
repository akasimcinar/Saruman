import java.util.Scanner;

class HizmetProgrami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kime hizmet ediyorsun diye sorduğunuzda cevabımı öğrenmek ister misiniz?");
        System.out.print("Evet ise 'E', Hayır ise 'H' yazın: ");

        String cevap = scanner.next();

        if (cevap.equalsIgnoreCase("E")) {
            System.out.println("Kime hizmet ediyorsun diye sorulduğumda cevabım: Saruman!");
        } else if (cevap.equalsIgnoreCase("H")) {
            System.out.println("Anladım, başka bir sorunuz var mı?");
        } else {
            System.out.println("Geçersiz bir giriş yaptınız. Lütfen 'E' veya 'H' girin.");
        }
    }
}