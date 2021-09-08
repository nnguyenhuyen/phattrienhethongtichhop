package module3.cau2;

import java.text.DecimalFormat;

public class ListS {
	private Sach[] dssach=new Sach[100];
	private int count;
	public ListS(){
		count=0;
		for(int i=0;i<count;i++)
			dssach[i]= new Sach();
	}
	public boolean themS(Sach sach){
		if(sach!=null){
			if(count>100){
				System.out.println("khong them vi mang day");
				return false;
			}
			else{
				for(int i=0;i<count;i++)
					if(dssach[i].getmSach().equalsIgnoreCase(sach.getmSach())){
						System.out.println("khong them duoc vi trung ma");
						return false;
					}
				dssach[count]=sach;
				count++;
				return true;
			}
		}
		return false;
	}
	public void TTL(){
		double tgk=0,ttk=0;
		for(int i=0;i<count;i++)
			if(dssach[i] instanceof SachGK)
				tgk=tgk+((SachGK) dssach[i]).thanhTien();
		
			else
				ttk=ttk+((SachTK) dssach[i]).thanhTien();
		System.out.println("tien sach giao khoa"+tgk);
		System.out.println("tien sach tham khao"+ttk);
	}
	public void TBG(){
		double tb=0,tbg=0;
		int d=0;
		for(int i=0;i<count;i++)
			if(dssach[i] instanceof SachTK){
				tbg=tbg+dssach[i].getDonGia();
				d++;
			}
		tb=tbg/d;
				System.out.printf("tb cong don gia %s ",tb);
	}
	public void xuatS(){
		for(int i=0;i<count;i++)
			System.out.println(dssach[i].toSring());
	}
	public void xuatNXB(String nxb){
		for(int i=0;i<count;i++)
			if(dssach[i].getNxb().equalsIgnoreCase(nxb))
				System.out.println(dssach[i].toSring());
	}
	public void xuatthang(){
		int thang;
		for(int i=0;i<count;i++)
			if(dssach[i].getNgayNhap().getMonth().getValue()==3)
				System.out.println(dssach[i]);
	}

}
