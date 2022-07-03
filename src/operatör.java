public class operatör {
    public static void main(String[] args) {
        int A = 10;
        int B = 20;
        int C = 10;
        int D = 40 ;
        int E ;
        E=(C >= A ) ? 4 : 3 ;
        System.out.println(E);
        boolean kosul1 = (A < B);
        boolean kosul2 = (D > B);
        boolean kosul3 = (C < D);
        boolean sonuc = kosul1 && kosul2;
       // boolean sonuc = kosul1 || kosul3 || kosul2 ;
        System.out.print(sonuc);

    }
}
