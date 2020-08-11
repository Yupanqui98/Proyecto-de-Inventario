
public class Inventario {
    private double precio;
    private int cantidad, codigo;
    private String titulo, autor;

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}   
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        StringBuilder n = new StringBuilder();                                                                   
        n.append("\nCodigo: ");
        n.append(codigo);
        n.append("\nTitulo: ");
        n.append(titulo);
        n.append("\nAutor: ");
        n.append(autor);
        n.append("\nPrecio: ");
        n.append(precio);
        n.append("\nCantidad: ");
        n.append(cantidad);   
        return n.toString();
    }
}