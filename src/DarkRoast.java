public class DarkRoast extends Beverage {

    String description;
    Double price;

    public DarkRoast()
    {
        description = "Кофе темной обжарки";
        price = 1.99;
    }

    @Override
    public Double cost() { return price; }
}
