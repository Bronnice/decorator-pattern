public class HouseBlend extends Beverage{

    public HouseBlend(){
        description = "Хаус бленд ";
    }

    public Double cost(){
        return
        milkPrice * milk +
        soyPrice * soy +
        mochaPrice * mocha +
        whipPrice * whip +
        5.99;
    }
}
