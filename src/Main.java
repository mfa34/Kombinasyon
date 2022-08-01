import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, r , total1=1 , total2=1 ,total3=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Kumenin eleman sayisini giriniz = ");
        n = input.nextInt();
        System.out.println("Lutfenin kumenin almak istediginiz kombinasyon rakamini giriniz = ");
        r = input.nextInt();

        for (int i=1 ; i <= n ; i ++ ){
            total1*=i;
        }
        for (int j=1 ; j<=r ; j ++){
            total2*=j;
        }
        int fark = n-r;

        for (int d =1 ; d <=fark ; d++){
            total3*=d;
        }
        int sonuc = total1 / (total2 * total3);
        System.out.println(sonuc);



    }
}
