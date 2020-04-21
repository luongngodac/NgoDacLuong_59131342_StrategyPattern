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
public class VitGioi extends Duck//alt + ctrl space
{
	//alt + insert: chen vao trong
	@Override 
	public String Display()
	{
		return "Xin chao! Em la vit gioi, chua co chong " + "\n"+
			performQuack()+ "\n" +
			performFly();
			
	}
}