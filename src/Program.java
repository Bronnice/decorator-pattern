public class Program {
    public static void main(String[] args) {

        DarkRoast darkRoast = new DarkRoast();
        Decaf decaf = new Decaf();
        Espresso espresso = new Espresso();
        HouseBlend houseBlend = new HouseBlend();

        System.out.println(darkRoast.getDescription());
        System.out.println(decaf.getDescription());
        System.out.println(espresso.getDescription());
        System.out.println(houseBlend.getDescription());


        darkRoast.setMilk();
        darkRoast.setSoy();
        darkRoast.setWhip();
        darkRoast.setSoy();

        houseBlend.setMocha();
        houseBlend.setMilk();
        houseBlend.setMilk();

        System.out.println(darkRoast.getDescription());
        System.out.println(decaf.getDescription());
        System.out.println(espresso.getDescription());
        System.out.println(houseBlend.getDescription());
    }
}