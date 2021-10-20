package utm.Task3;

    class SmartPhone {
        private String model;
        private String culoare;
        private double greutate;
        protected int pret;

    SmartPhone(String model, String culoare, double greutate, int pret){
        this.model = model;
        this.culoare = culoare;
        this.greutate= greutate;
        this.pret = pret;
    }

        public void setPret(int pret){
            this.pret = pret;
        }

        int getPret(){
            System.out.print(", pret= ");
            return this.pret;
        }

        @Override
        public String toString() {
            return  "  model= " + model +
                    ", culoare= " + culoare +
                    ", greutate= " + greutate;
        }
    }