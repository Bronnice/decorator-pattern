public class Espresso extends Beverage {

    public Espresso() {
        description = "Эспрессо ";
    }

    public Double cost(){
        return
        milkPrice * milk +
        soyPrice * soy +
        mochaPrice * mocha +
        whipPrice * whip +
        4.99;
    }
}
