import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("N1 Sayısını Giriniz: ");
        int n1 = scanner.nextInt();
        System.out.print("N2 Sayısını Giriniz: ");
        int n2 = scanner.nextInt();
        int ebob = 1;
        int i = 1;
        int k = 1;
        if (n1 < n2) {
            while (i <= n1) {
                i++;
                if (n1 % i == 0 && n2 % i == 0) {
                    System.out.println("Ortak Bölenleri: " + i);
                    ebob = i;
                }
            }

        } else {
            while (k <= n2) {
                k++;
                if (n1 % k == 0 && n2 % k == 0) {
                    System.out.println("Ortak Bölenleri: " + k);
                    ebob = k;
                }
            }
        }
        System.out.println("Ebob= " + ebob);
        System.out.println("Ekok= " + (n1*n2 / ebob));


    }
}
