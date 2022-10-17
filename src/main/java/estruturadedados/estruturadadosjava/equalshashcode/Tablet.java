package estruturadedados.estruturadadosjava.equalshashcode;

import java.util.Objects;

public class Tablet {

    public String marcar;

    public Tablet(String marcar){
        this.marcar = marcar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tablet tablet = (Tablet) o;
        return Objects.equals(marcar, tablet.marcar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marcar);
    }
}
