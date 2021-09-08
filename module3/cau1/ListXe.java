package module3.cau1;

public class ListXe {
	private Xe[] ds=new Xe[100];
	private int dem;
	public ListXe(){
		dem=0;
		for(int i=0;i<dem;i++)
			ds[i]=new Xe();
	}
	public boolean themXe(Xe xe){
		if(xe!=null){
			if(dem>100){
				System.out.println("khong them duoc vi mang day");
				return false;
			}
			else{
				for(int i=0;i<dem;i++)
					if(ds[i].getMaChuyen().equalsIgnoreCase(xe.getHoTen())){
						System.out.println("khong them duoc vi trung ma");
						return false;
					}
				ds[dem]=xe;
				dem++;
			}
		}
		return false;
	}
	public void xuaNT(){
		for(int i=0;i<dem;i++)
			if(ds[i] instanceof NoiThanh)
				System.out.println(ds[i].toString());
	}
	public void xuatXe(){
		for(int i=0;i<dem;i++)
			System.out.println(ds[i].toString());
	}
	public double tongtien(){
		double tt=0;
		for(int i=0;i<dem;i++)
			tt=tt+ds[i].getDoanhThu();
		return tt;
	}
	public void TTLX(){
		double tnoi=0,tngoai=0;
		for(int i=0;i<dem;i++)
			if(ds[i] instanceof NoiThanh)
				tnoi=tnoi+ds[i].getDoanhThu();
			else
				tngoai=tngoai+ds[i].getDoanhThu();
		System.out.println("doanh thu se noi"+tnoi);
		System.out.println("doamh thu xe ngoai"+tngoai);
	}
}
