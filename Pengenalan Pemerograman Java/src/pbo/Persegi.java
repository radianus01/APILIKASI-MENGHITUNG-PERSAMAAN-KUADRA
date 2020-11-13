package pbo;
class Persegi {
	public double sisi;
 
	public void setSisi(Double sisi) {
		this.sisi = sisi;
	}
 
	public double hitungKeliling() {

		double keliling = this.sisi * 4;
		return(keliling);
	}
	public double hitungLuas() {
		double luas = this.sisi * this.sisi;
		return(luas);
	}
}