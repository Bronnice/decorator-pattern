package Decorators;

import Coffes.Beverage;

public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "+ Decorators.Milk ";
    }
    @Override
    public Double Cost(){
        return 0.10 + beverage.Cost();
    }
}
