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
        Tinh phepCong = new PhepCong();
        Tinh phepTru = new PhepTru();
        Tinh phepChia = new PhepChia();
        Tinh phepNhan = new PhepNhan();
        ConText c = new ConText();
        c.setTinhToan(phepCong);
        float x = c.tinh(75,12);
        c.setTinhToan(phepTru);
        float y = c.tinh(54,78);

        System.out.println("75 + 12 = " + x + "\n 54 - 78 = " + y);
    }    
}