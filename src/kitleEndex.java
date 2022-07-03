import java.util.Scanner;
public class kitleEndex {
    public static void main(String[] args) {
        int a ;
        double b, c;
        Scanner deger = new Scanner(System.in);
        System.out.print("Kilonuzu giriniz :");
        a = deger.nextInt();
        System.out.print("Boyunuzu giriniz :");
        b = deger.nextDouble();

        c = a / (b *b);
        System.out.print("Vucut Kitle Indeksiniz : " + c);


           }
}
