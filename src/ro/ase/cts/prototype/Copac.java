package ro.ase.cts.prototype;

public class Copac implements Cloneable{
    private float inaltime;
    private String culoareFrunze;
    private String tipCoroana;
    private Pozitie XoY;

    public Copac(float inaltime, String culoareFrunze, String tipCoroana, Pozitie xoY) {
        this.inaltime = inaltime;
        this.culoareFrunze = culoareFrunze;
        this.tipCoroana = tipCoroana;
        XoY = xoY;
    }

    public Pozitie getXoY() {
        return XoY;
    }

    public void setXoY(Pozitie xoY) {
        XoY = xoY;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Copac clona = (Copac) super.clone();
        clona.inaltime = this.inaltime;
        clona.culoareFrunze = this.culoareFrunze;
        clona.tipCoroana = this.tipCoroana;
        clona.XoY = (Pozitie) this.XoY.clone();
        clona.XoY.setX(((clona.XoY.getX())+5));
        return clona;
    }
}
