public class DarkRoast extends Beverage {

    public DarkRoast(){
        setDescription("Тёмный обжаренный ");
        setPrice(3.99);
    }
    @Override
    public void cost() {
        hasMilk();
        hasMocha();
        hasSoy();
        hasWhip();
    }
}
