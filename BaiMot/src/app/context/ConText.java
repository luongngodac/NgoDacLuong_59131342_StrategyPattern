package app.context;
import app.tinh.*;
public class ConText{
    private Tinh tinhToan;

    public void setTinhtoan(Tinh tinhToan) {
        tinhToan = new tinhToan;
    }

    public float tinh(float a,float b){
        return tinhToan.tinh(a,b);
    }
}
