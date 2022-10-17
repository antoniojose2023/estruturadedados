package estruturadedados.estruturadadosjava.queue;

import java.util.Objects;

public class Tablet {
    String marcar;

    public Tablet(String marcar){
        this.marcar = marcar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        estruturadedados.estruturadadosjava.equalshashcode.Tablet tablet = (estruturadedados.estruturadadosjava.equalshashcode.Tablet) o;
        return Objects.equals(marcar, tablet.marcar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marcar);
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "marcar='" + marcar + '\'' +
                '}';
    }
}
