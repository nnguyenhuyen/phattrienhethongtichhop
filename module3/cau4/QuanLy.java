package module3.cau4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class QuanLy {
	protected String maGD;
	protected LocalDate ngayGD;
	protected double donGia;
	protected double dienTich;
	public QuanLy(){
		super();
	}
	public QuanLy(String maGD, LocalDate ngayGD, double donGia, double dienTich) {
		super();
		this.maGD = maGD;
		this.ngayGD = ngayGD;
		this.donGia = donGia;
		this.dienTich = dienTich;
	}
	public String getMaGD() {
		return maGD;
	}
	public void setMaGD(String maGD) {
		this.maGD = maGD;
	}
	public LocalDate getNgayGD() {
		return ngayGD;
	}
	public void setNgayGD(LocalDate ngayGD) {
		this.ngayGD = ngayGD;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	public String toString(){
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%-10s%-20s%-10.0f%-10.0f", maGD, ngayGD,donGia,dienTich);
	}

}
