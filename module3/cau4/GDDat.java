package module3.cau4;

import java.time.LocalDate;

public class GDDat extends QuanLy {
	private String loaiDat;

	public GDDat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GDDat(String maGD, LocalDate ngayGD, double donGia, double dienTich,String loaiDat) {
		super(maGD,ngayGD,donGia,dienTich);
		// TODO Auto-generated constructor stub
		this.loaiDat=loaiDat;
	}

	public String getLoaiDat() {
		return loaiDat;
	}

	public void setLoaiDat(String loaiDat) {
		this.loaiDat = loaiDat;
	}
	public double thanhtien(){
		if(loaiDat.equalsIgnoreCase("a") )
			return dienTich * donGia;
		else
			return dienTich*donGia*1.5;
		
	}
	public String toString(){
		return String.format( super.toString()+"%-30s%-40.2f",loaiDat,thanhtien());
	}

	
	

}
