package CasaEjemplo;

import org.springframework.stereotype.Component;

@Component
public class Ventana {
    private String forma;

    public Ventana() {
        this.forma = "Redonda";
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    @Override
    public String toString() {
        return "Ventana{" +
                "forma='" + forma + '\'' +
                '}';
    }
}
