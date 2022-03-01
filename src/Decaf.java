public class Decaf extends Beverage{

    public Decaf(){
        description = "Без коффеина ";
    }

    public Double cost(){
        return
        milkPrice * milk +
        soyPrice * soy +
        mochaPrice * mocha +
        whipPrice * whip +
        2.99;
    }
}
