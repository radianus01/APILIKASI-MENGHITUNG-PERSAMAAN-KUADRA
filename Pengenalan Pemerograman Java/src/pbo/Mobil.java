package pbo;
public  class Mobil {
    private String merek;
    private  int jrk;
    private  String warna;

    public Mobil(String merek, int jrk,String warna) {
        this.jrk = jrk;
        this.warna = warna;
    }
  public void detailMobil(){
      System.out.println("Class Mobil");
        System.out.println("Jarak = "+jrk);
        System.out.println("Merek = "+merek);
        System.out.println("warna = "+warna);
    
    }
    
}
