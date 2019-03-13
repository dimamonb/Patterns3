package ru.sbt.javaschool.step2.decision;

public class GumballMachineTestApp {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);
        System.out.println(gumballMachine);

        gumballMachine.insertQaurter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);

        System.out.println("------------------------------------------------------------");

        gumballMachine.insertQaurter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);

//        gumballMachine.insertQaurter();
//        gumballMachine.turnCrank();
//        gumballMachine.insertQaurter();
//        gumballMachine.turnCrank();


    }

}
