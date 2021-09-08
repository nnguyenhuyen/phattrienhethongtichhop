package module3.cau2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Sach {
	protected String mSach;
	protected LocalDate ngayNhap;
	protected double donGia;
	protected int soLuong;
	protected String nxb;;
	public Sach(){
		super();
	}
	public Sach(String mSach, LocalDate ngayNhap, double donGia, int soLuong,
			String nxb) {
		super();
		this.mSach = mSach;
		this.ngayNhap = ngayNhap;
		this.donGia = donGia;
		this.soLuong = soLuong;
		this.nxb = nxb;
	}
	public String getmSach() {
		return mSach;
	}
	public void setmSach(String mSach) {
		this.mSach = mSach;
	}
	public LocalDate getNgayNhap() {
		return ngayNhap;
	}
	public void setNgayNhap(LocalDate ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public String getNxb() {
		return nxb;
	}
	public void setNxb(String nxb) {
		this.nxb = nxb;
	}
	public String toSring(){
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%-10s%-20s%-10.0f%-20s%-10s",mSach, dtf.format(ngayNhap),donGia,soLuong,nxb);
	}
}
