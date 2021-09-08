package module3.cau1;

public class TestXe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListXe lx= new ListXe();
		lx.themXe(new NoiThanh("Noi01","Pham Viet Chanh","1930B",200000,30,"Tuyen6"));
		lx.themXe(new NoiThanh("Noi03","Ly Tu Trong","453C",340000,23,"Tuyen9"));
		lx.themXe(new NgoaiThanh("Ngoai02","Nguyen Huy","6702B",230000,"Go Vap",45));
		lx.themXe(new NgoaiThanh("Ngoai04","Ly Tieu","345B",500000,"Binh Thanh",10));
		lx.xuatXe();
		System.out.println("xuat xe noi thanh");
		lx.xuaNT();
		System.out.println("tong doanh thu cac chuyen xe"+lx.tongtien());
		lx.TTLX();
	}

}
