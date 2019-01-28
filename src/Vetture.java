public class Vetture {

        private String motore;
        private String targa;
        private float cilindrata;
        private int chilometri;
        private boolean controlloreTarga=false;

        public void setMotore(String motore) {
            this.motore=motore;
        }
        public void setCilindrata(float cilindrata) {
            this.cilindrata=cilindrata;
        }
        public void setChilometri(int chilometri) {
            this.chilometri=chilometri;
        }
        public boolean setTarga(String targa) {
            if(targa.length()==7)
            {
                this.controlloreTarga=true;
                this.targa=targa;
                return false;
            } else {
                System.out.println("Verifica numero di targa, brutto stronzo! ");
                this.controlloreTarga=false;
                return true;
            }
        }
        public String getMotore(){
            return this.motore;
        }
        public float getCilindrata(){
            return this.cilindrata;
        }
        public int getChilometri(){
            return this.chilometri;
        }
        public String getTarga(){
            return this.targa;
            }
}