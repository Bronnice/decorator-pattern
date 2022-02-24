public class Espresso extends Beverage {

    public Espresso(){
        setDescription("Эспрессо ");
        setPrice(4.99);
    }

    @Override
    public void cost() {
        hasMilk();
        hasMocha();
        hasSoy();
        hasWhip();
    }
}
