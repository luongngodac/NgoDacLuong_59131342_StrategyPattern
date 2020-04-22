/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.baimot;
import app.chia.*;
import app.cong.*;
import app.context.*;
import app.tru.*;
import app.nhan.*;
import app.tinh.*;

/**
 *
 * @author asus
 */
public class BaiMot
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        TinhToan phepCong = new PhepCong();
        TinhToan phepTru = new PhepTru();
        TinhToan phepChia = new PhepChia();
        TinhToan phepNhan = new PhepNhan();
        


        ConRext context = new conText();
        context.setTinhToan(phepCong);
        float x = context.tinh(75,12.54f);

        context.setTinhtoan(phepTru);
        float y = context.tinh(x,78);

        System.out.println("Ket qua:"+y);
    }    
}