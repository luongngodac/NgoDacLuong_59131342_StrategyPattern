/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flypackage;

/**
 *
 * @author asus
 */
public class FlyNoWings implements IFlyable
{

    @Override
    public String fly()
    {
        return "Không có cánh em chỉ nhảy tưng tưng";
    }
    
}