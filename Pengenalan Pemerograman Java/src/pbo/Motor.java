package pbo;
public  class Motor {
    private int jmlhRoda;
    private  String merek;

    public Motor(int jmlhRoda,  String merek) {
        this.jmlhRoda = jmlhRoda;
        this.merek = merek;
    }
    public void detailMotor(){
        System.out.println("Class Motor");
          System.out.println("Jumlah roda = "+jmlhRoda);
          System.out.println("Merek = "+merek);
      
      }
}