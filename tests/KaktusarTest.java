import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KaktusarTest {

    Växter kaktus = new Kaktusar("testkaktus",2.0);

    @Test
    void vätskaPerDagTest() {
        double expectedOutcome = 0.02;
        double acctualOutcome = kaktus.vätskaPerDag();
        assert expectedOutcome == acctualOutcome;
    }
}