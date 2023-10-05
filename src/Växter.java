/*
I super klassen Växter förekommer inkapsling eftersom variablerna i klassen är privata
och man är tvungen att använda sig för getters och setters för att komma åt dem.
Detsamma gäller subklasserna eftersom att de ärver från Växter.

Växter implementerar också interfacet VätskaPerDag som sedan subklasserna ärver.
 */

abstract class Växter implements VätskaPerDag{

        private String namn;
        private double längdImeter;

        public Växter(String namn, double längd) {
            this.namn = namn;
            this.längdImeter = längd;
        }


    public String getNamn() {
            return namn;
        }

        public void setNamn(String namn) {
            this.namn = namn;
        }

        public double getLängdImeter() {
            return längdImeter;
        }

        public void setLängdImeter(double längdImeter) {
            this.längdImeter = längdImeter;
        }

}
