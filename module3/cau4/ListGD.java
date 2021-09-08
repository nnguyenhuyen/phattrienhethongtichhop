package module3.cau4;

import module3.cau2.Sach;
import module3.cau2.SachGK;
import module3.cau2.SachTK;

public class ListGD {
	private QuanLy[] ds= new QuanLy[100];
	private int dem;
	public ListGD(){
		dem=0;
		for(int i=0;i<dem;i++)
			ds[i]= new QuanLy();
	}
	public boolean themS(QuanLy ql){
		if(ql!=null){
			if(dem>100){
				System.out.println("khong them vi mang day");
				return false;
			}
			else{
				for(int i=0;i<dem;i++)
					if(ds[i].getMaGD().equalsIgnoreCase(ql.getMaGD())){
						System.out.println("khong them duoc vi trung ma");
						return false;
					}
				ds[dem]=ql;
				dem++;
				return true;
			}
		}
		return false;
	}
	public void xuatGD(){
		for(int i=0;i<dem;i++)
			System.out.println(ds[i]);
	}
	public void TTL(){
		double td=0,tn=0;
		for(int i=0;i<dem;i++)
			if(ds[i] instanceof GDDat)
				td=td+((GDDat) ds[i]).thanhtien();
		
			else
				tn=tn+((GDNha) ds[i]).thanhtien();
		System.out.println("tien sach giao khoa"+td);
		System.out.println("tien sach tham khao"+tn);
	}
	public void TBG(){
		double tb=0,tbd=0;
		int d=0;
		for(int i=0;i<dem;i++)
			if(ds[i] instanceof GDDat){
				tbd=tbd+((GDDat) ds[i]).thanhtien();
				d++;
			}
		tb=tbd/d;
				System.out.printf("tb cong don gia %s ",tb);
	}
	public void xuatthang(){
		int thang,nam;
		for(int i=0;i<dem;i++)
			if(ds[i].getNgayGD().getMonth().getValue()==9 && ds[i].getNgayGD().getYear()==2013 )
				System.out.println(ds[i]);
	}
}
