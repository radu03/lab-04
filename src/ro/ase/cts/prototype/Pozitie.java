package ro.ase.cts.prototype;

public class Pozitie implements Cloneable{
    private int x;
    private int y;

    public Pozitie(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pozitie clona = (Pozitie) super.clone();
        clona.x = this.x;
        clona.y = this.y;
        return clona;
    }

    @Override
    public String toString() {
        return "x=" + x +
                ", y=" + y ;
    }
}
