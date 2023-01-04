public class DieselBil extends Bil {

    private boolean harPartikelFilter;
    private double kmPrL;


    public DieselBil(int regNr, String mærke, String model, int årgang, int antalDøre, boolean harPartikelFilter, double kmPrL) {
        super(regNr, mærke, model, årgang, antalDøre);

        this.harPartikelFilter = harPartikelFilter;
        this.kmPrL = kmPrL;

    }

    public boolean getHarPartikelFilter() {
        return harPartikelFilter;
    }

    public double getKmPrL() {
        return kmPrL;
    }

    public void setHarPartikelFilter(boolean harPartikelFilter) {
        this.harPartikelFilter = harPartikelFilter;
    }

    public void setKmPrL(double kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public double beregnGrønAfgift() {
        int price = 0;
        int partikelFilter = 1000;
        if (getKmPrL() >= 20 && getKmPrL() < 50) {
            System.out.print("Udligningsafgiften for benzin bilen er: ");
            price = 130;
            System.out.println(price + " Kr.");
        } else if (getKmPrL() >= 15 && getKmPrL() < 20) {
            System.out.print("Udligningsafgiften for benzin bilen er: ");
            price = 1390;
            System.out.println(price + " Kr.");
        } else if (getKmPrL() >= 15 && getKmPrL() < 10) {
            System.out.print("Udligningsafgiften for benzin bilen er: ");
            price = 1850;
            System.out.println(price + " Kr.");
        } else if (getKmPrL() >= 10 && getKmPrL() < 5) {
            System.out.print("Udligningsafgiften for benzin bilen er: ");
            price = 2770;
            System.out.println(price + " Kr.");
        } else {
            System.out.print("Udligningsafgiften for benzin bilen er:");
            price = 15260;
            System.out.println(price + " Kr.");
        }
        if (!getHarPartikelFilter()) { //Hvis der ikke er partikelfilter på
            System.out.println(price += partikelFilter);
        }
        return price;
    }

    @Override
    public String toString() {
        return "DieselBil: " +
                "harPartikelFilter:" + harPartikelFilter +
                ", kmPrL:" + kmPrL;
    }
}

