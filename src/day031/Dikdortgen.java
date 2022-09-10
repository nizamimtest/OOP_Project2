package day031;

public class Dikdortgen {
    private int uzunKenar;
    private int kisaKenar;

    public Dikdortgen(int uzunKenar, int kisaKenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }

    public Dikdortgen() {
    }


    public int getUzunKenar() {

        return uzunKenar;
    }

    public void setUzunKenar(int uzunKenar) {

        this.uzunKenar = uzunKenar;
    }

    public int getKisaKenar() {

        return kisaKenar;
    }

    public void setKisaKenar(int kisaKenar) {

        this.kisaKenar = kisaKenar;
    }

    public int alanHesapla() {
        return kisaKenar * uzunKenar;
    }

    public int cevreHesapla() {
        return 2 * (kisaKenar + uzunKenar);
    }
}
