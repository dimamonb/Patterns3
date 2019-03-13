package ru.sbt.javaschool.step2.decision;

public class NoQuarterState implements State {

    GumballMachine machine;

    public NoQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Вы вставили монету");
        machine.setState(machine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Прежде чем вернуть монетку ее нужно бросить");
    }

    @Override
    public void turnCrank() {
        System.out.println("Не нужно дергать рычаг без монетки");
    }

    @Override
    public void dispence() {
        System.out.println("Нужно сначала бросить монетку");
    }

    @Override
    public String toString() {
        return "NoQuarterState";
    }
}
