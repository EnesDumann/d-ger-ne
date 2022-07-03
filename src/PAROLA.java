import java.util.Scanner;

public class PAROLA {
    public static void main(String[] args) {
        String userName, password;


        Scanner inp = new Scanner(System.in);
        System.out.println("Kullanici adini giriniz :");
        userName = inp.nextLine( );

        System.out.println("Sifrenizi Giriniz");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giris yaptiniz !");
        } else {
            System.out.println("Bilgilerinizi Dogru giriniz !!"); ;
        }
    }
}
