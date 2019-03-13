package ru.sbt.javaschool.step2.decision;

public class GumballMachine {

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winState;
    State state = soldOutState;

    public int getCount() {
        return count;
    }

    int count = 0;

    public GumballMachine(int count) {

        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarter(this);
        soldState = new SoldState(this);
        winState = new WinState(this);
        this.count = count;

        if (count > 0) {
            state = noQuarterState;
        }
    }
    public void insertQaurter() {
        state.insertQuarter();
    }
    public void ejectQaurter(){
        state.ejectQuarter();
    }
    public void turnCrank(){
        state.turnCrank();
        state.dispence();
    }

    void setState(State state){
        this.state = state;
    }
    void releaseBall(){
        System.out.println("Выдача шарика");
        if (count != 0){
            count -= 1;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinState() { return winState; }


    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }
}
