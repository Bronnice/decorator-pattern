public class Program {
    public static void main(String[] args) {

        DarkRoast darkRoast = new DarkRoast();
        Decaf decaf = new Decaf();
        Espresso espresso = new Espresso();
        HouseBlend houseBlend = new HouseBlend();

        System.out.println(darkRoast.cost());
        System.out.println(decaf.cost());
        System.out.println(espresso.cost());
        System.out.println(houseBlend.cost());


        darkRoast.setMilk();
        darkRoast.setSoy();
        darkRoast.setWhip();
        darkRoast.setSoy();

        houseBlend.setMocha();
        houseBlend.setMilk();
        houseBlend.setMilk();

        System.out.println(darkRoast.cost());
        System.out.println(decaf.cost());
        System.out.println(espresso.cost());
        System.out.println(houseBlend.cost());
    }
}