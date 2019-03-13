package ru.sbt.javaschool.step2.bad;

public class GumballMachine {

    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count){
        this.count = count;
        if (count > 0){
            state = NO_QUARTER;
        }
    }

    public void insertQuarter(){

        if (state == HAS_QUARTER){
            System.out.println("Вы не можете вставить еще 1 монету");
        } else {
            if (state == SOLD_OUT){
                System.out.println("Вы не можете вставить монетку, так как автомат пуст");
            } else {
                if (state == SOLD){
                    System.out.println("Подождите шарик скоро будет у вас");
                } else {
                    if (state == NO_QUARTER){
                        state = HAS_QUARTER;
                        System.out.println("Вы положили в автомат монету");
                    }
                }
            }
        }

    }

    public void ejectQuarter(){
        if (state == HAS_QUARTER){
            System.out.println("Монета возвращена");
            state = NO_QUARTER;
        } else {
            if (state == NO_QUARTER){
                System.out.println("Нет возможности вернуть монетку, т.к. ее нет");
            } else  {
                if (state == SOLD){
                    System.out.println("Уже дернули за рычаг");
                } else {
                    if (state == SOLD_OUT){
                        System.out.println("Вы не можете получить щарик так как пока не вставили монетку");
                    }
                }
            }
        }
    }

    public void  tuenCrank(){
        if (state == SOLD) {
            System.out.println("Можешь попробывать еще раз, если сделать так еще 100 раз то выиграешь приз");
        } else {
            if (state == NO_QUARTER){
                System.out.println("Сначала нужно бросить монетку");
            } else {
                if (state == SOLD_OUT){
                    System.out.println("Шарики кончились");
                } else {
                    System.out.println("Получаете шарик");
                    state = SOLD;
                    dispence();
                }
            }
        }
    }

    private void dispence() {
        if (state == SOLD) {
            System.out.println("Автомат готов выдать шарик");
            count -= 1;
            if (count == 0) {
                System.out.println("Шарик последний");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        } else {
            if (state == NO_QUARTER){
                System.out.println("Сначала положите монетку");
            } else {
                if (state == SOLD_OUT){
                    System.out.println("Шариков нет");
                } else {
                    if (state == HAS_QUARTER){
                        System.out.println("Нет шариков для выдачи");
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }
}
