package pertemuan1;

import java.util.Scanner;

public class Ibm {
    public static void main(String[] args) {
        float a, b, c, d, BMI;
        String ket = "Keterangan  =";
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------");
        System.out.println("APLIKASI BMI (Body Mass Index)");
        System.out.println("--------------------------------\n");

        System.out.print("Masukan berat badan anda (Kg) = ");
        a = input.nextInt();
        System.out.print("Masukan tinggi badan anda (cm) = ");
        b = input.nextInt();
        // i. confert cm to m
        c = b / 100;
        // ii. tinggi (m) dikuadratkan
        d = (c * c);
        // iii.mencari nila BMI
        BMI =  a / d;
        System.out.println("Tinggi anda = " + c + "m");
        System.out.println("Berat anda  = " + a + "Kg");

        System.out.println("BMI anda    = " + BMI);

        if (BMI < 18.5) {
            System.out.println(ket + " KeteraBerat badan kurang");
        } else if (BMI <= 22.9) {
            System.out.println(ket + " Berat badan normal");
        } else if (BMI <= 29.9) {
            System.out.println(ket + " Berat badan berlebih (kecenderungan obesitas)");
        } else {
            System.out.println(ket + " Obesitas");
        }
        input.close();

    }

}
