
import java.util.ArrayList;

public class Garage {
    ArrayList<Bil> biler = new ArrayList<>();

    public void tilføjBiler(Bil bil) { // Tilføjer biler til garagen
        biler.add(bil);
    }

    public int beregnGrønAfgiftForBilpark() {
        int samletPris = 0;
        for (Bil bil : biler) {
            samletPris += bil.beregnGrønAfgift();
        }
        System.out.println("Grøn afgiften for alle bilerne i garagen er: " + samletPris + " Kr.");
        return samletPris;
    }
}

