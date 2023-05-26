package Entidad;

public class CodigoPostal {

    private Integer codigoPostal;
    private String ciudad;

    public CodigoPostal() {
    }

    public CodigoPostal(Integer codigoPostal, String ciudad) {
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
    }

    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "CodigoPostal{" + "codigoPostal=" + codigoPostal + ", ciudad=" + ciudad + '}';
    }

}
