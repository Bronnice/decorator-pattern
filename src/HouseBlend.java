public class HouseBlend extends Beverage{

    public HouseBlend(){
        setDescription("Хаус бленд ");
        setPrice(6.99);
    }

    public Double cost(){
        setPrice(milkPrice * milk);
        setPrice(soyPrice * soy);
        setPrice(mochaPrice * mocha);
        setPrice(whipPrice * whip);
        return Price;
    }
}
