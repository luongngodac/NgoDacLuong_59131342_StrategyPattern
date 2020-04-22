/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy59cntt2demo;

import duckpackage.Duck;
import duckpackage.MallardDuck;
import duckpackage.VitCo;
import flypackage.FlyNoWings;
import flypackage.FlyWithWings;
import flypackage.IFlyable;
import quackpackage.IQuackable;
import quackpackage.MuteQuack;
import quackpackage.SQuack;

/**
 *
 * @author asus
 */
public class Strategy59CNTT1Demo
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Duck duck1 = new MallardDuck();
        duck1.setFlyable(new FlyWithWings());
        duck1.setQuackable(new SQuack());
        System.out.println(duck1.display());  
        
        Duck duck2 = new VitCo();
        IFlyable flyNoWings = new FlyNoWings();
        IQuackable muteQuack = new MuteQuack();
        duck2.setFlyable(flyNoWings);
        duck2.setQuackable(muteQuack);
        System.out.println("\n" + duck2.display());
    }    
}