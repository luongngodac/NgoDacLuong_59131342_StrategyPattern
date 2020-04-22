package app.chia;
import app.tinh.*;
public class PhepChia implements Tinh{
    @Override
    public float  tinh (float a, float b)
    {
        if(b == 0)
        {
            return  Float.NaN;
        }
        else
        {
            return a/b;
        }
    }
}