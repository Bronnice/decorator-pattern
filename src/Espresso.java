public class Espresso extends Beverage {

    public Espresso() {
        setDescription("Эспрессо ");
        setPrice(4.99);
    }

    public Double cost(){
        setPrice(milkPrice * milk);
        setPrice(soyPrice * soy);
        setPrice(mochaPrice * mocha);
        setPrice(whipPrice * whip);
        return Price;
    }
}
