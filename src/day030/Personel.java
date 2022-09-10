package day030;

public class Personel {
    private String adi;
    private String soyadi;
    private int yasi;
    private double maasi;

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getAdi() {
        return this.adi;
    }
    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public int getYasi() {
        return yasi;
    }

    public void setYasi(int yasi) {
        this.yasi = yasi;
    }

    public double getMaasi() {
        return maasi;
    }

    public void setMaasi(double maasi) {
        this.maasi = maasi;
    }
    public void calis(){
        System.out.println("Personel calisiyor. ");
    }
    public  void evrakImzala(){
        System.out.println("Personel evrek imzaliyor.");
    }
    public void bilgileriGoster(){
        System.out.println(this.getAdi()+ " "+this.getSoyadi());
        System.out.println("Yasi : " +this.getYasi());
        System.out.println("Maasi: "+ this.getMaasi());

    }
}
