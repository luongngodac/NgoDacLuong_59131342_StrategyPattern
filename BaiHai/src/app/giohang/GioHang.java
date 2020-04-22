package app.giohang;
import app.hanghoa.*;
public class GioHang {

    
    public static void  hinhThucTT (String args[])
    {
        HangHoa h1 = new HangHoa ("Bạch tuộc chiên giòn.", 200000, "Ăn sống");
        HangHoa h2 = new HangHoa ("Thanh Long ", 300000, "Bóc vỏ");
        HangHoa h3 = new HangHoa("Bưởi Năm Căn", 400000, "Ăn tựa được");
        HangHoa h4 = new HangHoa("Bánh Ong", 500000, "Ngọt");

    }


    public double thanhToan()
    {
        double tienHang = 0;
        return 200000 + 300000 + 400000 + 500000;
    }
}
