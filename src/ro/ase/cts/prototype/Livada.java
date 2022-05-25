package ro.ase.cts.prototype;

import java.security.cert.CertificateParsingException;
import java.util.ArrayList;
import java.util.List;

public class Livada {
    private List<Copac> copaci = new ArrayList<>();

    public void planteaza(Copac copac){
        copaci.add(copac);
    }

    public List<Copac> getCopaci() {
        return copaci;
    }

    public void setCopaci(List<Copac> copaci) {
        this.copaci = copaci;
    }
}
