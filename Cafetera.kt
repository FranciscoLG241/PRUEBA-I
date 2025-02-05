
import java.awt.Color

class Cafetera(val ubicacion: String) {
    private var cantidad: Int = 0
    private val capacidadMaxima: Int = 1000


    constructor(ubicacion: String, capacidadMaxima: Int) : this(ubicacion) {
        this.cantidad = capacidadMaxima
    }


    constructor(ubicacion: String, capacidadMaxima: Int, cantidad: Int) : this(ubicacion) {
        this.cantidad = if (cantidad > capacidadMaxima) {
            capacidadMaxima
        } else {
            cantidad
        }
    }


    fun llenar(){
        this.cantidad = capacidadMaxima
    }


    override fun toString(): String {
        return "Cafetera(ubicación = $ubicacion, capacidad = $capacidadMaxima c.c., cantidad = $cantidad c.c.)"
    }
}