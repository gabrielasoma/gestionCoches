
package dominio;

import java.util.Objects;

/*matricula String, marca String, modelo String , color String, tarifa double, disponible boolean. getter y setter*/
public class vehiculo {
    //defino las propiedades de mi clase
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa;
    private boolean disponible;

    public vehiculo(String matricula) {
        this.matricula = matricula;
    }

    public vehiculo(String matricula, String marca, String modelo, String color, double tarifa, boolean disponible) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = disponible;
    }

    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTarifa() {
        return tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.matricula);
        hash = 31 * hash + Objects.hashCode(this.marca);
        hash = 31 * hash + Objects.hashCode(this.modelo);
        hash = 31 * hash + Objects.hashCode(this.color);
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.tarifa) ^ (Double.doubleToLongBits(this.tarifa) >>> 32));
        hash = 31 * hash + (this.disponible ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final vehiculo other = (vehiculo) obj;
        if (Double.doubleToLongBits(this.tarifa) != Double.doubleToLongBits(other.tarifa)) {
            return false;
        }
        if (this.disponible != other.disponible) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("vehiculo{matricula=").append(matricula);
        sb.append(", marca=").append(marca);
        sb.append(", modelo=").append(modelo);
        sb.append(", color=").append(color);
        sb.append(", tarifa=").append(tarifa);
        sb.append(", disponible=").append(disponible);
        sb.append('}');
        return sb.toString();
    } 
          
}
