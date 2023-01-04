public class ElBil extends Bil {

    private int batteriKapacitetKWh;
    private int maxKm;
    private int whPrKm;

    public ElBil(int regNr, String mærke, String model, int årgang, int antalDøre, int batteriKapacitetKWh, int maxKm, int whPrKm) {
        super(regNr, mærke, model, årgang, antalDøre);

        this.batteriKapacitetKWh = batteriKapacitetKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    public int getBatteriKapacitetKWh() {
        return batteriKapacitetKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public int getWhPrKm() {
        return whPrKm;
    }

    public void setBatteriKapacitetKWh(int batteriKapacitetKWh) {
        this.batteriKapacitetKWh = batteriKapacitetKWh;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }

    @Override
    public double beregnGrønAfgift() {
        int price = 0;
        int kmPrL = (int) ((100.0 / (getWhPrKm() / 91.25)) + 0.05);
        if (kmPrL >= 20 && kmPrL < 50) {
            System.out.print("Afgiften for elbilen er: ");
            price = 330;
            System.out.println(price + " Kr.");
        } else if (kmPrL >= 15 && kmPrL < 20) {
            System.out.print("Afgiften for elbilen er: ");
            price = 1050;
            System.out.println(price + " Kr.");
        } else if (kmPrL >= 10 && kmPrL < 15) {
            System.out.print("Afgiften for elbilen er: ");
            price = 2340;
            System.out.println(price + " Kr.");
        } else if (kmPrL >= 5 && kmPrL < 10) {
            System.out.print("Afgiften for elbilen er: ");
            price = 5500;
            System.out.println(price + " Kr.");
        } else {
            System.out.print("Afgiften for elbilen er: ");
            price = 10470;
            System.out.println(price + " Kr.");
        }
        return price;
    }

    @Override
    public String toString() {
        return "ElBil: " +
                "batteriKapacitetKWh: " + batteriKapacitetKWh +
                ", maxKm: " + maxKm +
                ", whPrKm: " + whPrKm;
    }
}

