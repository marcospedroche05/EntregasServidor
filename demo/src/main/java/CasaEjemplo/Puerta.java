package CasaEjemplo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Puerta {
    private String color;
    @Autowired
    private Picaporte picaporte;
    @Autowired
    private Marco marco;

    public Puerta( Picaporte picaporte, Marco marco) {
        this.color = "color de ejemplo";
        this.picaporte = picaporte;
        this.marco = marco;
    }

    public String getColor() {
        return color;
    }

    public Picaporte getPicaporte() {
        return picaporte;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPicaporte(Picaporte picaporte) {
        this.picaporte = picaporte;
    }

    public Marco getMarco() {
        return marco;
    }

    public void setMarco(Marco marco) {
        this.marco = marco;
    }

    @Override
    public String toString() {
        return "Puerta{" +
                "picaporte=" + picaporte +
                ", marco=" + marco +
                '}';
    }
}
