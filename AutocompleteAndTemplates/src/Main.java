import java.util.Scanner;

public class Main {


    public static int cariFPB(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    /**method operasi KPK
     * @param a
     * @param b
     * */
    public static int cariKPK(int a, int b) {
        return (a * b) / cariFPB(a, b);
    }

    /**Method Main*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();

        int fpb = cariFPB(angka1, angka2);
        int kpk = cariKPK(angka1, angka2);

        System.out.println("FPB dari " + angka1 + " dan " + angka2 + " adalah: " + fpb);
        System.out.println("KPK dari " + angka1 + " dan " + angka2 + " adalah: " + kpk);
    }
}