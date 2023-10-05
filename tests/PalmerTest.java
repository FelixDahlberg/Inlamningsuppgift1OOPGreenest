import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmerTest {

    Växter palm = new Palmer("testpalm",3.0);

    @Test
    void vätskaPerDagTest() {
        double expectedOutcome = 1.5;
        double acctualOutcome = palm.vätskaPerDag();
        assert expectedOutcome == acctualOutcome;
    }
}