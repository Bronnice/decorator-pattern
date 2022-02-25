public class Decaf extends Beverage{

    public Decaf(){
        setDescription("Без коффеина ");
        setPrice(2.59);
    }

    public Double cost(){
        setPrice(milkPrice * milk);
        setPrice(soyPrice * soy);
        setPrice(mochaPrice * mocha);
        setPrice(whipPrice * whip);
        return Price;
    }
}
