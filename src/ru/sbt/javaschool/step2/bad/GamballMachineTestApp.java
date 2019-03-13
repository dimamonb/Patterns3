package ru.sbt.javaschool.step2.bad;

public class GamballMachineTestApp {

    public static void main(String[] args) {
        GumballMachine machine = new GumballMachine(5);

        System.out.println(machine);
        machine.insertQuarter();
        machine.tuenCrank();

        System.out.println(machine);
        machine.insertQuarter();
        machine.ejectQuarter();
        machine.tuenCrank();


        System.out.println(machine);
        machine.insertQuarter();
        machine.tuenCrank();
        machine.insertQuarter();
        machine.tuenCrank();
        machine.ejectQuarter();

        System.out.println(machine);

    }

}
