package module3.cau2;

import java.time.LocalDate;

public class SachTK extends Sach{
	private double thue;

	public SachTK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SachTK(String mSach, LocalDate ngayNhap, double donGia, int soLuong,
			String nxb,double thue) {
		super(mSach, ngayNhap, donGia, soLuong, nxb);
		// TODO Auto-generated constructor stub
		this.thue=thue;
	}

	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		this.thue = thue;
	}
	
	public double thanhTien(){
		return soLuong*donGia*thue;
	}
	public String toString(){
		return String.format(super.toSring()+"%-10.2f%-10.2f", thue,thanhTien());
	}
		
	

}
