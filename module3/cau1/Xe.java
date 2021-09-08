package module3.cau1;

public class Xe {
	protected String maChuyen;
	protected String hoTen;
	protected String soXe;
	protected double doanhThu;
	public Xe(){
		super();
	}
	public Xe(String maChuyen, String hoTen, String soXe, double doanhThu) {
		super();
		this.maChuyen = maChuyen;
		this.hoTen = hoTen;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
	}
	public String getMaChuyen() {
		return maChuyen;
	}
	public void setMaChuyen(String maChuyen) {
		this.maChuyen = maChuyen;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getSoXe() {
		return soXe;
	}
	public void setSoXe(String soXe) {
		this.soXe = soXe;
	}
	public double getDoanhThu() {
		return doanhThu;
	}
	public void setDoanhThu(double doanhThu) {
		this.doanhThu = doanhThu;
	}
	public  String toString(){
		return String.format("%-25s%-20s%-20s%15.2f", maChuyen,hoTen,soXe,doanhThu);
	}

}
