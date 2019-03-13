package ru.sbt.javaschool.step2.decision;

public class SoldState implements State {

    GumballMachine machine;

    public SoldState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Мы уже отдаем вам шарик");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Вы уже дернули рычаг");
    }

    @Override
    public void turnCrank() {
        System.out.println("Нельзя просто так дернуть рычаг дважды");
    }

    @Override
    public void dispence() {
        machine.releaseBall();
        if (machine.getCount() > 0){
            machine.setState(machine.getNoQuarterState());
        } else {
            System.out.println("Шарики закончились");
            machine.setState(machine.getSoldOutState());
        }
    }

    @Override
    public String toString() {
        return "SoldState";
    }
}
