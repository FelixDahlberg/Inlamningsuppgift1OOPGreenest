import javax.swing.*;

public class Palmer extends Växter {

    public Palmer(String namn, double längdIMeter) {
        super(namn, längdIMeter);
    }


    @Override
    public double vätskaPerDag() {
        double kranVattenPerDag;
        kranVattenPerDag = 0.5 * this.getLängdImeter();
        System.out.println(kranVattenPerDag);
        return kranVattenPerDag;
    }

    @Override
    public void vätskaPerDagUtskrift(double vätskaPerDag) {
        JOptionPane.showMessageDialog(null,this.getNamn() + " ska ha " + vätskaPerDag + " liter " + Vätsketyp.KV.vätsketypUtskrivet + "\n" + Vätsketyp.KV.vätsketypBeskrivning);
    }

}
