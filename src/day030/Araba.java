package day030;

public class Araba {
    private String renk;
    private String marka;
    private String model;
    private int modelYili;
    private double silindirHacmi;

    public int getModelYili(){
        return this.modelYili;
    }
    public void setModelYili(int modelYili) {
        if (modelYili > 0) {
            this.modelYili = modelYili;
        }
    }
}
