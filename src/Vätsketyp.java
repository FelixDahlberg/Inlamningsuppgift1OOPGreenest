public enum Vätsketyp {
    PD("Proteindryck","1/3 proteinpulver 2/3 ljummet kran vatten"),
    KV("kranvatten","ljummet kranvatten"),
    MV("mineralvatten","ljummet mineralvatten");

    public final String vätsketypUtskrivet;

    public final String vätsketypBeskrivning;


    Vätsketyp(String vätsketypUtskrivet, String vätsketypBeskrivning) {
        this.vätsketypUtskrivet = vätsketypUtskrivet;
        this.vätsketypBeskrivning = vätsketypBeskrivning;
    }
}
