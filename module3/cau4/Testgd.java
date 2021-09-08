package module3.cau4;

import java.time.LocalDate;

public class Testgd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListGD lx= new ListGD();
		lx.themS(new GDDat("D1",LocalDate.of(2013,9,20),60000,23,"A"));
		lx.themS(new GDDat("D3",LocalDate.of(2015,6,20),52000,25,"B"));
		lx.themS(new GDNha("N2",LocalDate.of(2015,3,30),65000,23,"binh thuong", "tphcm"));
		lx.xuatGD();
		lx.TTL();
		lx.TBG();
		System.out.println("giao dich thang 9/2013");
		lx.xuatthang();
	}

}
