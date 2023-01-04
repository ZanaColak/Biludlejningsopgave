public class BenzinBil extends Bil {
    private int oktanTal;
    private double kmPrL;

    public BenzinBil(int regNr, String mærke, String model, int årgang, int antalDøre, int oktanTal, double kmPrL) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.oktanTal = oktanTal;
        this.kmPrL = kmPrL;
    }

    public int getOktanTal() {
        return oktanTal;
    }

    public double getKmPrL() {
        return kmPrL;
    }

    public void setOktanTal(int oktanTal) {
        this.oktanTal = oktanTal;
    }

    public void setKmPrL(double kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "BenzinBil: " +
                "oktanTal: " + oktanTal +
                ", kmPrL: " + kmPrL;
    }

    @Override
    public double beregnGrønAfgift() {
        int price = 0;
        if (getKmPrL() >= 20 && getKmPrL() < 50) {
            System.out.print("Grøn afgiften for benzin bilen er: ");
            price = 330;
            System.out.println(price + " Kr.");
        } else if (getKmPrL() >= 15 && getKmPrL() < 20) {
            System.out.print("Grøn afgiften for benzin bilen er: ");
            price = 1050;
            System.out.println(price + " Kr.");
        } else if (getKmPrL() >= 10 && getKmPrL() < 15) {
            System.out.print("Grøn afgiften for benzin bilen er: ");
            price = 2340;
            System.out.println(price + " Kr.");
        } else if (getKmPrL() >= 5 && getKmPrL() < 10) {
            System.out.print("Grøn afgiften for benzin bilen er: ");
            price = 5500;
            System.out.println(price + " Kr.");
        } else {
            System.out.print("Grøn afgiften for benzin bilen er: ");
            price = 10470;
            System.out.println(price + " Kr.");

        }
        return price;
    }
}




