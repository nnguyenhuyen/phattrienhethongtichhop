package module3.cau1;

public class NgoaiThanh extends Xe{
	private String noiDen;
	private int soNgay;
	public NgoaiThanh() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NgoaiThanh(String maChuyen, String hoTen, String soXe,
			double doanhThu, String noiDen, int soNgay) {
		super(maChuyen, hoTen, soXe, doanhThu);
		// TODO Auto-generated constructor stub
		this.noiDen=noiDen;
		this.soNgay=soNgay;
	}
	public String getNoiDen() {
		return noiDen;
	}
	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}
	public int getSoNgay() {
		return soNgay;
	}
	public void setSoNgay(int soNgay) {
		this.soNgay = soNgay;
	}
	public String toString(){
		return super.toString()+String.format("%20s%15d", noiDen,soNgay);
	}

}
