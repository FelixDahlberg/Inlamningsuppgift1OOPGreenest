import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Växter palmer1 = new Palmer("Laura", 5);
        Växter palmer2 = new Palmer("Olof", 1);
        Växter kaktusar1 = new Kaktusar("Igge", 0.2);
        Växter köttätandeVäxter1 = new KöttätandeVäxter("Meatloaf", 0.7);


        ArrayList<Växter> växterArrayList = new ArrayList<>();
        växterArrayList.add(palmer1);
        växterArrayList.add(palmer2);
        växterArrayList.add(kaktusar1);
        växterArrayList.add(köttätandeVäxter1);


        Växter valdVäxt = användarValdVäxt(växterArrayList);
        if (valdVäxt != null){
            valdVäxt.vätskaPerDagUtskrift(valdVäxt.vätskaPerDag());// här används polymorphism efter som vätskaPerDag och
        }                                                          //  vätskaPerDagUtskrift ger olika svar beroende på vilket objekt som kallar på dem


    }


    public static Växter användarValdVäxt(ArrayList<Växter> växterArrayList) {
        Växter valdVäxt = null;
        while (true) {
            String inputVäxt = JOptionPane.showInputDialog("Vilken växt?");

            if (inputVäxt == null) {
                break;
            }
            int counter = 0;

            try {
                for (Växter växter : växterArrayList) {

                    if (växter.getNamn().equalsIgnoreCase(inputVäxt)) {
                        break;
                    }
                    counter++;
                }
                if (counter == växterArrayList.size()) {
                    JOptionPane.showMessageDialog(null, "växt finns inte");
                }
                valdVäxt = växterArrayList.get(counter);
                break;
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e);
            }
        }
        return valdVäxt;
    }

}


