package ac.cr.ulead.Objetos;

public class Producto {
     private String nombre;
     private String categoria;
     private String codigo_alfanumerico;

    public Producto next;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCodigo_alfanumerico() {
        return codigo_alfanumerico;
    }

    public void setCodigo_alfanumerico(String codigo_alfanumerico) {
        this.codigo_alfanumerico = codigo_alfanumerico;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + getNombre() + '\'' +
                ", categoria='" + getCategoria() + '\'' +
                ", codigo_alfanumerico='" + getCodigo_alfanumerico() + '\'' +
                '}';
    }
}
