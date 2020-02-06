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
public class shape {
    private String color = "red";
    private boolean filled = true;
    public shape(){
    
    }
    public shape(String color , boolean filled){
    this.color=color;
    this.filled=filled;
    }
    public String getcolor(){
    return color;
    } 
    public void setcolor(String color){
    this.color=color;
    } 
    public boolean isFilled(){
    return filled;
    }
    public void setFilled(boolean filled){
    this.filled=filled;
    }
    public String changeToString(){
    return "shape is color  "+color+",filled "+filled; 
    }
}
