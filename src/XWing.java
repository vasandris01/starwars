import java.util.Random;

public class XWing extends LazadoGep implements Heperhajtomu{

    public XWing() {
        super(150, true);
    }

    @Override
    public void hiperUgras() {
        Random random = new Random();
        setSebesseg(getSebesseg() + random.nextDouble(100));
    }

    @Override
    public boolean elkapjaAVonosugar() {
        return isMeghibasodhatE() && getSebesseg() < 10000;
    }

    @Override
    public String toString() {
        return "XWing:" + super.toString();
    }
}
