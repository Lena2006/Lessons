/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton1;

import Singletone0.Singletone;
import static Singletone0.Singletone.uniqueInstance;
import javafx.beans.binding.Bindings;

/**
 *
 * @author User
 */
public class Boiler0 {

    private boolean empty;
    private boolean boiled;

    public static Boiler0 uniqueInstance;
    
    private Boiler0() {
        
    }
     public static Boiler0 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Boiler0();
            System.out.println("The new instance of Boiler");
        }
        System.out.println("Returning instance...");
        return uniqueInstance;
     }

//    public Boiler0() {
//        empty = true;
//        boiled = false;
//        System.out.println("new Boiler created");

 //   }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            System.out.println("Boiler is filled");

        }

    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
            System.out.println("Boiler is empty");

        }
    }

    public void boil() {
        if (!isEmpty() && isBoiled()) {
            boiled = true;
            System.out.println("boiling.....");

        }
    }

    private boolean isEmpty() {
        return empty;
    }

    private boolean isBoiled() {
        return boiled;
    }
}