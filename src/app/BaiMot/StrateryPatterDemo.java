/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.ntu.straterypatterdemo;

/**
 *
 * @author int
 */
public class StrateryPatternDemo{

	public static void main (String[] args)
	{
		Duck duck1 = new VitGioi();
//tap su dung doi tuong truu tuong thong qua nhung doi tuong cu the 
                duck1.setFlyBehavior(new FlyByWings());
                duck1.setQuackBehavior(new SQuack());
		System.out.pritln(duck1.Display());
              
	}
        //tehem 2 hanh vi, 1 hanh vi bay, 1 hanh vi keu.
        public static void main(String[] args)
        {
            Duck duck2 = new VitCaoCo();
            duck2.setFlyBehavior(new FlyNoWay());
            duck2.setQuackBehavior(new MuteQuack());
            System.out.pritln(duck2.Display());
        }
}
