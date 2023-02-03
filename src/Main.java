import java.util.Scanner;
/*Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)
*/
public class Main {
    public static void main(String[] args) {
        int n , total1 = 1 , total2 = 1 , total3 = 1 , r , faktoriyel;

        Scanner scanner = new Scanner(System.in);
        System.out.println("n değeri giriniz : ");
        n = scanner.nextInt();

        System.out.println("r değeri giriniz : ");
        r = scanner.nextInt();

        for (int i = 1 ; i <= n ; i++){
            total1 *= i;
        }
        for (int j = 1 ; j <= r ; j++){
            total2 *= j ;
        }
        for (int k = 1 ; k <= (n-r) ; k++){
            total3 *= k;
        }
        faktoriyel = total1 / ( total2 * (total3));
        System.out.println(faktoriyel);


    }
}