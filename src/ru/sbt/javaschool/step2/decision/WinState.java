package ru.sbt.javaschool.step2.decision;

public class WinState implements State {

    GumballMachine gumballMachine;

    public WinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Мы уже отдали вам шарик");
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
        if(gumballMachine.count < 2){
            System.out.println("Не хватает шариков");
            System.out.println();
            gumballMachine.getSoldOutState();
        } else {
            gumballMachine.releaseBall();
            gumballMachine.releaseBall();
            System.out.println("Ура! Вы получили еще один шарик!!!111");
            System.out.println();
            gumballMachine.getNoQuarterState();
        }
    }

    @Override
    public String toString() {
        return "WinState";
    }
}
