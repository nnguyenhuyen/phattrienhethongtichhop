package module3.cau2;

import java.time.LocalDate;

import module3.cau2.ListS;

public class TestS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListS ls= new ListS();
		ls.themS(new SachGK("gk1",LocalDate.of(2016,3,20),60000,5,"Nguyen Hua","moi"));
		ls.themS(new SachGK("gk2",LocalDate.of(2018,3,13),20000,10,"Nguyen hoa","moi"));
		ls.themS(new SachGK("gk3",LocalDate.of(2017,6,12),23000,2,"Nguyen Lan","cu"));
		ls.themS(new SachTK("TK4",LocalDate.of(2015,2,23),9500,12,"Hue Ha",20));
		ls.themS(new SachTK("TK5",LocalDate.of(2015,2,23),9500,12,"Hue Ha",20));
		ls.themS(new SachTK("TK6",LocalDate.of(2018,12,23),2300,10,"Hue Ham",30));
		ls.xuatS();
		ls.TTL();
		ls.TBG();
		System.out.println("\n xuat nha xuat ban");
		ls.xuatNXB("Nguyen Lan");
		System.out.println("xuat thang 3");
		ls.xuatthang();
	}
}