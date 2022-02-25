public class DarkRoast extends Beverage {

    public DarkRoast(){
        setDescription("Тёмный обжаренный ");
        setPrice(3.99);
    }

    public Double cost(){
        setPrice(milkPrice * milk);
        setPrice(soyPrice * soy);
        setPrice(mochaPrice * mocha);
        setPrice(whipPrice * whip);
        return Price;
    }
}
