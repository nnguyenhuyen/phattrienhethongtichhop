package module3.cau2;

import java.time.LocalDate;

public class SachGK extends Sach{
	private String tinhTrang;

	public SachGK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SachGK(String mSach, LocalDate ngayNhap, double donGia, int soLuong,
			String nxb,String tinhTrang) {
		super(mSach, ngayNhap, donGia, soLuong, nxb);
		// TODO Auto-generated constructor stub
		this.tinhTrang= tinhTrang;
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	public double thanhTien(){
		if(tinhTrang.equalsIgnoreCase("moi"))
			return soLuong*donGia;
		else
			return soLuong*donGia*0.5;
				
	}
	public String toString(){
		return String.format(super.toSring()+"%-10s%-10.2f",tinhTrang,thanhTien());
	}

}
