package utm.Task3;

    class SmartPhone {
        String model;
        String culoare;
        double greutate;
        int pret;

    SmartPhone(String model, String culoare, double greutate){
        this.model = model;
        this.culoare = culoare;
        this.greutate= greutate;
    }

        void setPret(int pret){
            this.pret = pret;
        }

        int getPret(){
            return pret;
        }

        @Override
        public String toString() {
            return  "  model='" + model + '\'' +
                    ", culoare= " + culoare + '\'' +
                    ", greutate= " + greutate +
                    ", pret= " + pret;
        }
    }
