package module3.cau1;

public class NoiThanh extends Xe{
	private double soKM;
	private String soTuyen;
	public NoiThanh() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NoiThanh(String maChuyen, String hoTen, String soXe, double doanhThu,double soKM, String soTuyen) {
		super(maChuyen, hoTen, soXe, doanhThu);
		// TODO Auto-generated constructor stub
		this.soKM= soKM;
		this.soTuyen= soTuyen;
	}
	public double getSoKM() {
		return soKM;
	}
	public void setSoKM(double soKM) {
		this.soKM = soKM;
	}
	public String getSoTuyen() {
		return soTuyen;
	}
	public void setSoTuyen(String soTuyen) {
		this.soTuyen = soTuyen;
	}
	public String toString(){
		return super.toString()+String.format("%20f%15s", soKM, soTuyen);
	}

}
