package app.baihaimain;
import app.giohang.*;
import app.ithanhtoan.*;
import app.thanhtoancod.*;
import app.thanhtoanonline.*;
import app.giohang.GioHang;
import app.hanghoa.*;

public class BaiHaiMain {
    String tenHH;
    int gia;
    String moTa;
    IThanhToan thanhtoan;
    public void setThanhToanOnline(IThanhToan thanhtoan)
    {
        this.thanhtoan = thanhtoan;
    }
    public void setThanhToanCOD(IThanhToan thanhtoan)
    {
        this.thanhtoan = thanhtoan;
    }
    void display()
    {  
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        System.out.println(h4);
        System.out.println(thanhtoan);
    }
    HangHoa h1 = new HangHoa ("Bạch tuộc chiên giòn.", 200000, "Ăn sống");
    HangHoa h2 = new HangHoa ("Thanh Long ", 300000, "Bóc vỏ");
    HangHoa h3 = new HangHoa("Bưởi Năm Căn", 400000, "Ăn tựa được");
    HangHoa h4 = new HangHoa("Bánh Ong", 500000, "Ngọt"); 
    public double thanhToan()
    {
        int tienHang = 0;
        tienHang = 200000 + 300000 + 400000 + 500000;
        return tienHang;
    }
    public static void main (String args[])
    {
        //TODO code application logic here.
        
    }
    ThanhToanCOD cod = new ThanhToanCOD();
    ThanhToanOnline  online = new ThanhToanOnline();

    cod.display();
    online.display();

}