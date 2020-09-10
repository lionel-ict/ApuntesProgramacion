
public class Articulo {

    private String nombre;
    private double precio;
    private int iva;
    private int cuantosQuedan;
    
    public static final int ivaGeneral = 21;
    public static final int ivaReducido = 10;
    public static final int ivaSuperReducido = 4;

    public Articulo(String nombre, double precio, int iva, int cuantosQuedan) {
        if (nombre.equals("")) {
            System.err.println("ERROR: El nombre no puede estar vacío");
        } else if (precio <= 0) {
            System.err.println("ERROR: El precio no puede ser menor o igual a cero");
        } else if (iva != Articulo.ivaGeneral && iva != Articulo.ivaReducido && iva != Articulo.ivaSuperReducido) {
            System.err.println("ERROR: IVA no valido");
        } else if (cuantosQuedan < 0) {
            System.err.println("ERROR: El stock no puede ser menor que cero");
        } else {
            this.nombre = nombre;
            this.precio = precio;
            this.iva = iva;
            this.cuantosQuedan = cuantosQuedan;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getIva() {
        return iva;
    }

    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    public void setNombre(String nombre) {
        if (nombre.equals("")) {
            System.err.println("ERROR: El nombre no puede estar vacío");
        } else {
            this.nombre = nombre;
        }
    }

    public void setPrecio(double precio) {
        if (precio <= 0) {
            System.err.println("ERROR: El precio no puede ser menor o igual a cero");
        } else {
            this.precio = precio;
        }
    }

    public void setIva(int iva) {
        if (iva != Articulo.ivaGeneral && iva != Articulo.ivaReducido && iva != Articulo.ivaSuperReducido) {
            System.err.println("ERROR: IVA no valido");
        } else {
            this.iva = iva;
        }
    }

    public void setCuantosQuedan(int cuantosQuedan) {
        if (cuantosQuedan < 0) {
            System.err.println("ERROR: El stock no puede ser menor que cero");
        } else {
            this.cuantosQuedan = cuantosQuedan;
        }

    }

    // Precio con iva incluido
    public double getPVP() {
        return this.precio + (this.precio / 100.0 * this.iva);
    }

    // Precio con iva incluido
    public double getPVPDescuento(double descuento) {
        double precio = this.getPVP();
        return precio - (precio / 100.0 * descuento);
    }

    // Metodo vender. Actualiza las cantidades si se puede vender. 
    // Devuelve true si la venta es correcta, false en caso contrario
    public boolean vender(int unidades) {
        int cuantos = this.getCuantosQuedan();
        // Si no se puede, devolvemos false
        if (unidades > cuantos) {
            return false;
        } // Si se puede, actualizamos y devolvemos true
        else {
            this.setCuantosQuedan(cuantos - unidades);
            return true;
        }
    }

    // Metodo vender. Actualiza las cantidades si se puede almacenar. 
    // Devuelve true si el almacenaje es posible
    // False si no es posible (ejemplo, numeros negativos)
    public boolean almacenar(int unidades) {
        int cuantos = this.getCuantosQuedan();
        if (cuantos + unidades > 0) {
            this.setCuantosQuedan(cuantos + unidades);
            return true;
        } else {
            return false;
        }
    }

    // imprime datos
    public void imprimir() {
        System.out.println("Nombre:" + this.getNombre() + " IVA:" + this.getIva() + " Precio:" + this.getPrecio() + " PVP:" + this.getPVP() + " Unidades:" + this.getCuantosQuedan());
    }

}
