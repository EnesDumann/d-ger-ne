import java.util.Scanner ;

public class sınıfGecme {
    public static void main(String[] args) {


        int mat , turkce ,fizik ,kimya ,biyoloji ;

        Scanner input = new Scanner(System.in) ;

        System.out.println("Turkce notunuzu giriniz :");
        turkce = input.nextInt();

        System.out.println("Fizik notunuzu giriniz :");
        fizik = input.nextInt();


        System.out.println("Kimya notunuzu giriniz :");
        kimya = input.nextInt();


        System.out.println("Matematik notunuzu giriniz :");
        mat = input.nextInt();


        System.out.println("Biyoloji notunuzu giriniz :");
        biyoloji = input.nextInt();



        double average ;
        average = ( (mat + turkce + fizik + biyoloji + kimya) / 5 ) ;
         if (average < 50) {
             System.out.println("Sinifi gecemediniz seneye gorusmek uzere :)");
        }else if ( average >= 50 ) {
             System.out.println("Tebrikler sinifi gectiiz!!");
        }
         System.out.println("Ortalamaniz :" + average);
    }
}
