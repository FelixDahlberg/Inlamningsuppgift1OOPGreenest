import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KöttätandeVäxterTest {

    Växter köttätandeväxt = new KöttätandeVäxter("testköttätandeVäxt",0.5);


    @Test
    void vätskaPerDagTest() {
    double expectedOutcome = 0.2;
    double acctualOutcome = köttätandeväxt.vätskaPerDag();

    assert expectedOutcome == acctualOutcome;
    }
}