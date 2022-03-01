public class DarkRoast extends Beverage {

    public DarkRoast(){
        description = "Тёмный обжаренный ";
    }

    public Double cost(){
        return
        milkPrice * milk +
        soyPrice * soy +
        mochaPrice * mocha +
        whipPrice * whip +
        3.99;
    }
}
