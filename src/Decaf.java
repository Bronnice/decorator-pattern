public class Decaf extends Beverage{

    public Decaf(){
        setDescription("Без коффеина ");
        setPrice(2.59);
    }

    @Override
    public void cost() {
        hasMilk();
        hasMocha();
        hasSoy();
        hasWhip();
    }
}
