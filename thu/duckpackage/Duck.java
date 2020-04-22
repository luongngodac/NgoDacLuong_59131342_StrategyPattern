/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duckpackage;

import flypackage.IFlyable;
import quackpackage.IQuackable;


/**
 *
 * @author asus
 */
public abstract class Duck
{
    IFlyable flyable;
    IQuackable quackable;

    public Duck()
    {
    }

    public void setFlyable(IFlyable flyable)
    {
        this.flyable = flyable;
    }

    public void setQuackable(IQuackable quackable)
    {
        this.quackable = quackable;
    }
     
    public String performQuack()
    {
        return quackable.quack();
    }
    
    public String performFly()
    {
        return flyable.fly();
    }
    
    public String swim()
    {
        return "Vịt bơi trong ao";
    }
    
    public abstract String display();
}