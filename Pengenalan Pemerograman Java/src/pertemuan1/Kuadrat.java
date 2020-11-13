package pertemuan1;

import java.util.Scanner;

public class Kuadrat {
    public static void main(String[] args) {

        int a, b, c, D;
        double x1, x2;
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("----APILIKASI MENGHITUNG PERSAMAAN KUADRAT---");
        System.out.println("--------------------------------------------\n");
        System.out.print("Masukan nilai a : ");
        a = input.nextInt();
        input.nextLine();
        System.out.print("Masukan nilai b : ");
        b = input.nextInt();
        System.out.print("Masukan nilai C : ");
        c = input.nextInt();
        D = b * b - (4 * a * c);
        System.out.println("--------------------------------------------\n");
        System.out.println("Determinan = " + D);
        if (D < 0) {
            System.out.println("Bilangan imajiner");
        } else if (D == 0) {
            x1 = -b / (2 * a);
            System.out.println("Akar persamaan x1 = x2 : " + x1);
        } else {
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Akar persamaan x1 = " + x1);
            System.out.println("               x2 = " + x2);
        }
        input.close();
    }
}
