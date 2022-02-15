public class HouseBlend extends Beverage{

    public HouseBlend(){
        setDescription("Хаус бленд ");
        setPrice(6.99);
    }

    @Override
    public String cost() {
        hasMilk();
        hasMocha();
        hasSoy();
        hasWhip();
        return description + Price; }
}
