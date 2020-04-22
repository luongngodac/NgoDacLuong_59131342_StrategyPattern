package app.thanhtoancod;
import app.ithanhtoan.*;
public class ThanhToanCOD implements IThanhToan{
    @Override
    public double thanhToan(int tienHang)
    {
        if(tienHang > 2000000)
        {
            return tienHang*0.2;
        }
        else
        {
            return tienHang;
        }
    }

}