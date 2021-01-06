/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makeupproject;

/**
 *
 * @author user
 */
public class Branding extends TypeOfMakeup{
    
    String Brand1, Brand2, Brand3, Brand4;
    
    public Branding(String Brand1, String Brand2, String Brand3, String Brand4){
        this.Brand1 = Brand1;
        this.Brand2 = Brand2;
        this.Brand3 = Brand3;
        this.Brand4 = Brand4;
    }
    
    public void setBrand1(String Brand1){
        this.Brand1 = Brand1;
    }
    
    public void setBrand2(String Brand2){
        this.Brand2 = Brand2;
    }
    
    public void setBrand3(String Brand3){
        this.Brand3 = Brand3;
    }
    
    public void setBrand4(String Brand4){
        this.Brand4 = Brand4;
    }
    
    public String getBrand1(){
        return Brand1;
    }
    
    public String getBrand2(){
        return Brand2;
    }
    
    public String getBrand3(){
        return Brand3;
    }
    
    public String getBrand4(){
        return Brand4;
    }
    
}
