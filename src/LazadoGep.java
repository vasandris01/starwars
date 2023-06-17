public abstract class LazadoGep implements Urhajo {
    private double sebesseg;
    private boolean meghibasodhatE;

    public LazadoGep(double sebesseg, boolean meghibasodhatE) {
        this.sebesseg = sebesseg;
        this.meghibasodhatE = meghibasodhatE;
    }

    public abstract boolean elkapjaAVonosugar();

    public double milyenGyors() {
        return sebesseg;
    }

    public boolean legyorsuljaE(Urhajo urhajo) {
        if (urhajo instanceof LazadoGep) {
            return this.sebesseg > urhajo.milyenGyors() && ((LazadoGep) urhajo).meghibasodhatE;
        }
        if(urhajo instanceof MilleniumFalcon){
            return this.sebesseg / 2 > urhajo.milyenGyors();
        }
        return false;
    }

    public double getSebesseg() {
        return sebesseg;
    }

    public void setSebesseg(double sebesseg) {
        this.sebesseg = sebesseg;
    }

    public boolean meghibasodhatE() {
        return meghibasodhatE;
    }

    public void setMeghibasodhatE(boolean meghibasodhatE) {
        this.meghibasodhatE = meghibasodhatE;
    }

    @Override
    public String toString() {
        return "LazadoGep{" +
                "sebesseg=" + sebesseg +
                ", meghibasodhatE=" + meghibasodhatE +
                '}';
    }
}
