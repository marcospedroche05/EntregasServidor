package CasaEjemplo;

import org.springframework.stereotype.Component;

@Component
public class Marco {
    private String material;
    private float tamanio;

    public Marco() {
        this.material = "Madera";
        this.tamanio = 50;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Marco{" +
                "material='" + material + '\'' +
                ", tamanio=" + tamanio +
                '}';
    }
}
