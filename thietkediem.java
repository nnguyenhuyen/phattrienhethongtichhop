public class thietkediem {
    int x;
    int y;
    void nhapdiem(int x, int y){
        this.x=x;
        this.y=y;
    }
    void indiem(){
        System.out.println("toa do: (" +x+","+y+")");
       
    }
   public  void khoanhcach(){
        double k;
        k=Math.sqrt(Math.pow(this.x, 2)+Math.pow(this.y, 2));
        System.out.printf("\nKhoang cach tu diem den goc: "+k);
        
    }

    public static void main(String[] args) {
        thietkediem d1= new thietkediem();
        thietkediem d2= new thietkediem();
        d1.nhapdiem(3, 5);
        d2.nhapdiem(4, 6);
        d1.indiem();
        d2.indiem();
        d1.khoanhcach();
        d2.khoanhcach();
       
    }
}
