import java.util.Scanner;

public class asada {
    public static void main(String[] args) {int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        n1 = input.nextInt();

        System.out.println("2. sayiyi girin :");
        n2 = input.nextInt();

        System.out.println("1.Toplama\n2.Cikarma\n3.Carpma\n4.Bolme");
        System.out.println("İşleminizi seçiniz :");
        select = input.nextInt();
        switch (select) {
            case 1:
                System.out.println("Sonuc: "+(n1+n2  ) );
                break ;
            case 2:
                System.out.println("Sonuc: " + (n1 - n2) ) ;
                break ;
            case 3:
                System.out.println("Sonuc :"+ (n1 * n2));
                break;
            case 4 :
                System.out.println("Sonuc :"+ (n1 / n2 )) ;
            default:
                System.out.println("Dogru bir islem seciniz.");
                break;
        }

    }

}

