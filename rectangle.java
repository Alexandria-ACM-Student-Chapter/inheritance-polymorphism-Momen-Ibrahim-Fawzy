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
public class rectangle extends shape {
    private double width = 1.0;
    private double length = 1.0;
    public rectangle(){
    }
    public rectangle(double width,double length){
    this.width=width;
    this.length=length;
    }
    public rectangle(double width,double length,String color,boolean Filled){
    super(color,Filled);
    this.width=width;
    this.length=length;
    }
    public double getwidth(){
    return width;
    }
    public double getlength(){
    return length;
    }
    public void setwidth(double width){
    this.width=width;
    }
    public void setlength(double length){
    this.length=length;
    }
    public double getArea(){
    return width*length;
    }
    public double getPerimeter(){
    return (width+length)*2;
    }
    @Override
    public String changeToString(){
    return "rectangle[width = "+width+",length"+length+"]";
    }
}
