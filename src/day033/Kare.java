package day033;

public class Kare extends Sekil{
    private double kenar;

    public Kare(double kenar) {
        this.kenar = kenar;
    }

    public Kare() {
    }

    public double getKenar() {
        return kenar;
    }

    public void setKenar(double kenar) {
        this.kenar = kenar;
    }



    @Override
    double alanHesapla() {
        return kenar*kenar;
    }

    @Override
    double cevreHesapla() {
        return 4*kenar;
    }

    @Override
    void ciz() {
        for (int i=0;i<kenar;i++){
            for (int j=0;j<kenar;j++){
                System.out.print("*\t");
            }
            System.out.println("\t");
        }

    }


    public void bilgiGoster() {
        System.out.printf("Kenar:%5.2f\tAlan:%5.2f\tCevre:%5.2f\n",kenar,alanHesapla(),cevreHesapla());

    }

    @Override
    public String toString() {
        return super.toString();
    }
}

