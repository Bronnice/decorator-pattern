public class DarkRoast extends Beverage {

    public DarkRoast(){
        setDescription("Тёмный обжаренный ");
        setPrice(3.99);
    }
    @Override
    public String cost() {
        hasMilk();
        hasMocha();
        hasSoy();
        hasWhip();
        return description + Price; }
}
