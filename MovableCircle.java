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
public class MovableCircle implements Movable{
    private int radious;
    private MovablePoint center;
    //MovablePoint center = new MovablePoint(5,3,2,1);
    public MovableCircle(int x,int y,int xSpeed,int ySpeed,int radious){
    center.x=x;
    center.y=y;
    center.xSpeed=xSpeed;
    center.ySpeed=ySpeed;
    this.radious=radious;
    }
    public String changeToString(){
    return "MovableCircle[x="+center.x+",y="+center.y+",xSpeed="+center.xSpeed+",ySpeed="+center.xSpeed+"]";
    }
    
    public void moveUp(){
    center.y+=1;
    }
    public void moveDown(){
    center.y-=1;
    }
    public void moveLeft(){
    center.x-=1;
    }
    public void moveRight(){
    center.x+=1;
    }
    
}
