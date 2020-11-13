package pbo;

public class Main {

    public static void main(String[] args) throws Exception {
       
        Persegi persegi = new Persegi();    
        persegi.setSisi(1.2);

        System.out.println("Keliling Persegi  =" +  persegi.hitungKeliling());
        System.out.println("Luas Persegi  =" +  persegi.hitungLuas());
    }
    
}
