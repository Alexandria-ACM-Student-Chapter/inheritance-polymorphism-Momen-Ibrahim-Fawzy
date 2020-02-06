/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alex.lap.pkg2.ex.pkg2;

/**
 *
 * @author pc
 */
public class MyComplex {
    private double real =0.0,imag=0.0;
    public MyComplex(){
    }
    public MyComplex(double real,double imag){
    this.real=real;
    this.imag=imag;
    }
    public double getReal(){
    return real;
    }
    public void setReal(double real){
    this.real=real;
    }
    public double getImag(){
    return imag;
    }
    public void setImag(double imag){
    this.imag=imag;
    }
    public void setValue(double real,double imag){
        this.real=real;
        this.imag=imag;
    }
    public String changeToString(){
    return"(real+imagi),e.g.,("+real+"+"+imag+"i)";
    }
    public boolean isReal(){
    boolean isreal=false;
        if(imag==0)
        isreal=true;
    else if (imag!=0)
        isreal=false;
    return isreal;
    }
    public boolean isImaginary(){
    boolean isimag=false;
        if(real==0)
        isimag=true;
    else if (real!=0)
        isimag=false;
    return isimag;
    }
    public boolean equals(double real,double imag){
    boolean equal=false;
    if(real==imag)
        equal=true;
    return equal;
    }
    public boolean equals(MyComplex another){
    boolean equal=false;
    if(another.real==another.imag)
        equal=true;
    return equal;
    }
    public double magnitude(){
    return Math.sqrt((real*real)+(imag*imag));
    }
    public double argument(){
    return Math.atan(real*imag);
    }
    public MyComplex add(MyComplex right){
    this.real+=right.real;
    this.imag+=right.imag;
    return this;
    }
    public MyComplex addNew(MyComplex right){
    MyComplex left = new MyComplex();
    left.real=right.real+this.real;
    left.imag=right.imag+this.imag;
    return left;
    }
    public MyComplex suptract(MyComplex right){
    this.real-=right.real;
    this.imag-=right.imag;
    return this;
    }
    public MyComplex suptractNew(MyComplex right){
    MyComplex left = new MyComplex();
    left.real=right.real-this.real;
    left.imag=right.imag-this.imag;
    return left;
    }
    public MyComplex multiply(MyComplex right){
    this.real*=right.real;
    this.imag*=right.imag;
    return this;
    }
    public MyComplex divide(MyComplex right){
    this.real/=right.real;
    this.imag/=right.imag;
    return this;
    }
    public MyComplex conjugate(){
    this.imag=-this.imag;
    return this;
    }
}
