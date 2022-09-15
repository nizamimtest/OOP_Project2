package day032;

public class Hayvan {
    private int yas;
    private double agirlik;
    private  String tur;

    public Hayvan(int yas, double agirlik, String tur) {
        this.yas = yas;
        this.agirlik = agirlik;
        this.tur = tur;
        System.out.println("Uclu constructor ile nesne olusturuldu");
    }
    public Hayvan(){
        System.out.println("Hayvan nesnesi olusturuldu");
    }

    public Hayvan(String tur) {
        this.tur = tur;
        System.out.println("Tek parametreli constructor nesne olusturuldu");
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public double getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(double agirlik) {
        this.agirlik = agirlik;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }
}
