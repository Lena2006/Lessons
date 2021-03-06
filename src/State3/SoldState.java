/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State3;


import java.security.Guard;

/**
 *
 * @author �����
 */
public class SoldState implements State{
    GumballMachine gumballMachine;
    
    public SoldState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're alredy giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you alredy turned the crank");
    }

    @Override
    public void turnCrank() {
            System.out.println("Turning twice doesn't get you another gumball");
    }

    @Override
    public void dispense() {
     gumballMachine.releaseBall();
     if (gumballMachine.getCount() > 0) {
         gumballMachine.setState(gumballMachine.getNoQuarterState());
     } else {
         System.out.println("Ooops, out of gumballs!!");
         gumballMachine.setState(gumballMachine.getSoldOutState());
     }
    }

    @Override
    public void refill() { }
    
    @Override
    public String toString() {
        return "dispensing a gumball";
    }
    
}
