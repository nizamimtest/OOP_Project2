package day030;

public class Square {
    private int sideLength;

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    public int countPerimeter() {
        return 4 * sideLength;
    }

    public int countArea() {
        return sideLength * sideLength;
    }

    public void showInfo() {
        System.out.println("Alan= " + this.countArea());
        System.out.println("Cevre= " + this.countPerimeter());
    }
}
