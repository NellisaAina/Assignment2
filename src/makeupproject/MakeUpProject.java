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
public class MakeUpProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Branding b = new Branding("Fenty Beauty", "Maybelline", "MAC", "Revlon");
        HowToUse h = new HowToUse();
        WhereToBuy w = new WhereToBuy();
        
        b.setMakeup("Lipstick ", "Eyeshadow ", "Mascara ", "Blusher ");
        
        //LIPSTICK
        System.out.println("Type of Makeup: " + b.getLipstick());
        System.out.println("Brand that this type have: ");
        System.out.println(b.getBrand1());
        System.out.println(b.getBrand2());
        System.out.println(b.getBrand3());
        System.out.println(b.getBrand4());
        System.out.println("");
        h.UseLipstick(); //POLYMORPHISM
        System.out.println("");
        w.WhereToBuy(); //ABSTRACTION
        w.location();
        System.out.println("---------------------------------");
        
        //EYESHADOW
        System.out.println("Type of Makeup: " + b.getEyeshadow());
        System.out.println("Brand that this type have: ");
        System.out.println(b.getBrand1());
        System.out.println(b.getBrand2());
        System.out.println(b.getBrand3());
        System.out.println(b.getBrand4());
        System.out.println("");
        h.UseEyeshadow(); //POLYMORPHISM
        System.out.println("");
        w.WhereToBuy(); //ABSTRACTION
        w.location();
        System.out.println("---------------------------------");
        
        //MASCARA
        System.out.println("Type of Makeup: " + b.getMascara());
        System.out.println("Brand that this type have: ");
        System.out.println(b.getBrand1());
        System.out.println(b.getBrand2());
        System.out.println(b.getBrand3());
        System.out.println(b.getBrand4());
        System.out.println("");
        h.UseMascara(); //POLYMORPHISM
        System.out.println("");
        w.WhereToBuy(); //ABSTRACTION
        w.location();
        System.out.println("---------------------------------");
        
        System.out.println("Type of Makeup: " + b.getBlusher());
        System.out.println("Brand that this type have: ");
        System.out.println(b.getBrand1());
        System.out.println(b.getBrand2());
        System.out.println(b.getBrand3());
        System.out.println(b.getBrand4());
        System.out.println("");
        h.UseBlusher(); //POLYMORPHISM
        System.out.println("");
        w.WhereToBuy(); //ABSTRACTION
        w.location();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
