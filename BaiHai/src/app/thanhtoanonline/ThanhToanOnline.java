package app.thanhtoanonline;
import app.ithanhtoan.*;
public class ThanhToanOnline implements IThanhToan
{
    
    public double thanhToan(int tienHang)
    {
        if(tienHang <1000000)
        {
            return tienHang*0.95;
        }
        else
        {
            return tienHang*0.93;
        }
    }
    
}