package ru.sbt.javaschool.step2.decision;

public class SoldOutState implements State {

    GumballMachine machine;

    public SoldOutState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Все шарики проданы, нельзя вставить монетку");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Вы не можете вернуть монетку, т.к. не вставили ее");
    }

    @Override
    public void turnCrank() {
        System.out.println("Шариков нет");
    }

    @Override
    public void dispence() {
        System.out.println("Невозможно уменьшить число шариков");
    }

    @Override
    public String toString() {
        return "SoldOutState";
    }
}
