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











class Taza(var color: String = "Blanco", var capacidad: Int = 50){
    var cantidad: Int = 0
        set(value){
            field = if (value > capacidad){
                capacidad
            }else{
                value
            }
        }



    fun llenar(){
        this.cantidad = capacidad
    }



    fun llenar(nuevaCantidad: Int){
        cantidad = if (nuevaCantidad > capacidad){
            capacidad
        }else{
            nuevaCantidad
        }
    }




    override fun toString(): String {
        return "Taza(color = $color, capacidad = $capacidad c.c., cantidad = $cantidad c.c.)"
    }
}






fun main(){



}