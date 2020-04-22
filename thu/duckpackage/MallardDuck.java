/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duckpackage;

/**
 *
 * @author asus
 */
public class MallardDuck extends Duck
{
    @Override
    public String display()
    {
        return "Chào các bạn tôi là vịt cổ xanh" + "\n"+
                swim()+"\n"+
                performFly()+"\n"+
                performQuack();
    }
    
}