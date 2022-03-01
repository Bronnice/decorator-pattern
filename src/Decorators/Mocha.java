package Decorators;
import Coffes.Beverage;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "+ Decorators.Mocha ";
    }
    @Override
    public Double Cost(){
        return 0.20 + beverage.Cost();
    }
}
