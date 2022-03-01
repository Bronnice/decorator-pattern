package Decorators;

import Coffes.Beverage;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "+ Decorators.Whip ";
    }
    @Override
    public Double Cost(){
        return 0.20 + beverage.Cost();
    }
}
