import javax.swing.*;

public class KöttätandeVäxter extends Växter implements VätskaPerDag{



    public KöttätandeVäxter(String namn, double längdIMeter) {
        super(namn, längdIMeter);
    }


    @Override
    public double vätskaPerDag() {
        double proteindryckPerDag;
        double basNivåProteindryck = 0.1;
        double extraProteindryckPerDag = 0.2 * this.getLängdImeter();
        proteindryckPerDag = basNivåProteindryck + extraProteindryckPerDag;
        return proteindryckPerDag;
    }

    @Override
    public void vätskaPerDagUtskrift(double vätskaPerDag) {
        JOptionPane.showMessageDialog(null,this.getNamn() + " ska ha " + vätskaPerDag + " liter " + Vätsketyp.PD.vätsketypUtskrivet + "\n" + Vätsketyp.PD.vätsketypBeskrivning);
    }

}
