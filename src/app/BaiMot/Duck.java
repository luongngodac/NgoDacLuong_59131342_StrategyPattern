/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package  app;

/**
 *
 * @author int
 */
public abstract class Duck 
{
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;
    public Duck()
    {    
    }
    //    Thiet lap
    public void setFlyBehavior(IFlyBehavior flyBehavior)
    {
        this.flyBehavior = flyBehavior;
    }
    //    Thiet lap
    public void setQuackBehavior(IQuackBehavior quackBehavior)
    {
        this.quackBehavior = quackBehavior;
    }
    //    Cai dat phuong thuc
    public String swim()
    {
        return "Vit boi trong ao";
    }
    //    Cai dat phuong thuc
    public String performQuack()
    {
        return quackBehavior.quack();
    }
    //    Cai dat phuong thuc
    public String performFly()
    {
        return flyBehavior.fly();
    }
    public abstract String Display();
}