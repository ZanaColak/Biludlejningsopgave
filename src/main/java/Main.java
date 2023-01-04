public class Main {
    public static void main(String[] args) {
        BenzinBil benzinBil = new BenzinBil(10, "Tesla", "Model S", 2019, 4, 5, 15);
        benzinBil.beregnGrønAfgift();

        DieselBil dieselBil = new DieselBil(10, "m", "m", 2019, 5, true, 15);
        dieselBil.beregnGrønAfgift();

        ElBil elBil = new ElBil(20, "Tesla", "jh", 392, 4, 600, 1000, 30);
        elBil.beregnGrønAfgift();

        Garage garage = new Garage();
        garage.beregnGrønAfgiftForBilpark();
    }
}
