import javax.swing.*;

public class Kaktusar extends Växter {


    public Kaktusar(String namn, double längdIMeter) {
        super(namn, längdIMeter);
    }


    @Override
    public double vätskaPerDag() {
        double mineralVattenPerDag = 0.02;
        return mineralVattenPerDag;
    }

    @Override
    public void vätskaPerDagUtskrift(double vätskaPerDag) {
        JOptionPane.showMessageDialog(null,this.getNamn() + " ska ha " + vätskaPerDag + " liter " + Vätsketyp.MV.vätsketypUtskrivet + "\n" + Vätsketyp.MV.vätsketypBeskrivning);
    }
}
