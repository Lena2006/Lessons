/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFactory4;

import testFactory3.*;

/**
 *
 * @author User
 */
public class Programmer implements  Employee{

    @Override
    public void doWork() {
        System.out.println("I'm programmer. Programming code!");
    }
    
    
}
