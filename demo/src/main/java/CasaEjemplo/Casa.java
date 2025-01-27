package CasaEjemplo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Casa {
    private String direccion;
    @Autowired
    private Habitacion habitacion;

    @Autowired
    public Casa(Habitacion habitacion) {
        this.direccion = "C/Ave del paraiso";
        this.habitacion = habitacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "direccion='" + direccion + '\'' +
                "habitacion=" + habitacion +
                '}';
    }
}
