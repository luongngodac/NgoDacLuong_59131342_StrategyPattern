/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app;

/**
 *
 * @author int
 */
public class MallarDuck extends Duck
{
	public MallarDuck()
	{
		
	}
	@Override 
	public String Display()
	{
		return "Xin chao! Em la vit co xanh " + "\n"+
			performQuack()+ "\n" +
			performFly();
			
	}
	
	
}