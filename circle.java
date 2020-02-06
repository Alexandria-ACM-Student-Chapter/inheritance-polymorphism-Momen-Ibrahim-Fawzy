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
public class circle extends shape {
    private double radious;
    public circle(){
    }
    public circle(double radious){
        this.radious=radious;
    }
    public circle(double radious,String color,boolean Filled){
        super(color,Filled);
        this.radious=radious;
    }
    public double getRadious(){
    return radious;
    }
    public void setRadious(double radious){
   this.radious=radious;
    }
    public double getArea(){
    return Math.PI*radious*radious;
    }
    public double getPeremeter(){
    return 2*Math.PI*radious;
    }
    @Override
    public String changeToString(){
    return "circel]radioius = "+radious+"]";
    }
    
}
