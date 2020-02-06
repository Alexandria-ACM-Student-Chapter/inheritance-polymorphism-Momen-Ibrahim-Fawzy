/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alex.lab.pkg2.ex.pkg3;

/**
 *
 * @author pc
 */
public class MovablePoint implements Movable{
    protected int x,y,xSpeed,ySpeed;
    public MovablePoint(int x,int y,int xSpeed,int ySpeed){
    this.x=x;
    this.y=y;
    this.xSpeed=xSpeed;
    this.ySpeed=ySpeed;
    }
    public String changeToString(){
    return "MovablePoint[x="+x+",y="+y+",xSpeed="+xSpeed+",ySpeed="+xSpeed+"]";
    }
    public void moveUp(){
    y+=1;
    }
    public void moveDown(){
    y-=1;
    }
    public void moveLeft(){
    x-=1;
    }
    public void moveRight(){
    x+=1;
    }
    
}
