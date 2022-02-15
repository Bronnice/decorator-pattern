public class DarkRoast extends Beverage {

    public DarkRoast(){
        description = "Тёмный обжаренный";
        Price += 3.99;

    }
    @Override
    public Double cost() { return Price; }
}
