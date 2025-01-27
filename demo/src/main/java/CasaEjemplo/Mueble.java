package CasaEjemplo;

import org.springframework.stereotype.Component;

@Component
public class Mueble {
    private String nombre;
    private String color;

    public Mueble() {
        this.nombre = "Mesita";
        this.color = "Marron";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Mueble{" +
                "nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
