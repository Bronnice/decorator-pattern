package Decorators;

import Coffes.Beverage;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "+ Decorators.Soy ";
    }
    @Override
    public Double Cost(){
        return 0.30 + beverage.Cost();
    }
}
