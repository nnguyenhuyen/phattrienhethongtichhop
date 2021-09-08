package module3.cau4;

import java.time.LocalDate;

public class GDNha extends QuanLy{
	private String loainha;
	private String diaChi;
	
	public GDNha() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GDNha(String maGD, LocalDate ngayGD, double donGia, double dienTich,String loainha,String diaChi) {
		super(maGD, ngayGD, donGia, dienTich);
		// TODO Auto-generated constructor stub
		this.loainha=loainha;
		this.diaChi=diaChi;
	}
	public String getLoainha() {
		return loainha;
	}
	public void setLoainha(String loainha) {
		this.loainha = loainha;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public double thanhtien(){
		if(loainha.equalsIgnoreCase("cao cap"))
			return dienTich*donGia;
		else
			return dienTich*donGia*0.9;
	}
	public String toString(){
		return String.format(super.toString()+"%-20s%-10s%-5.2f", loainha,diaChi,thanhtien());
	}
}
