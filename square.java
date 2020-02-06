/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alex.lab.pkg2;

/**
 *
 * @author pc
 */
public class square extends rectangle {
    public square(){
    }
    public square(double side){
         super(side,side);
    }
    public square(double side,String color,  boolean filled){
    super(side,side,color,filled);
    }
    
    public double getSide(){
    return getlength();
    }

    public void setSide(double side){
    setlength(side);
    setwidth(side);
    }
    /*public void setwidth(double side){
    setwidth(side);
    }
    public void setlength(double side){
    setlength(side);
    }*/

    /**
     *
     * @return
     */
    @Override
    public String changeToString(){
    return "square[side ="+getSide()+",color = "+getcolor()+",filled = "+isFilled()+"]";
    }
    
    
    
}
