import kotlin.random.Random




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



    fun vaciar(){
        cantidad = 0
    }



    fun agregarCafe(cantidadCafe: Int = 200){
        cantidad += cantidadCafe
        if (cantidad > capacidadMaxima) {
            cantidad = capacidadMaxima
        }
    }



    fun servirTaza(taza: Taza) {
        val cantidadAservir = if (cantidad >= taza.capacidad){
            taza.capacidad
        }else{
            cantidad
        }

        taza.llenar(cantidadAservir)
        cantidad -= cantidadAservir
    }



    override fun toString(): String {
        return "Cafetera(ubicación = $ubicacion, capacidad = $capacidadMaxima c.c., cantidad = $cantidad c.c.)"
    }
}





enum class Color{
    BLANCO, NEGRO, GRIS, AZUL, VERDE
}





class Taza(var color: Color = Color.BLANCO, var capacidad: Int = 50){
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
        return "Taza(color = ${color.name}, capacidad = $capacidad c.c., cantidad = $cantidad c.c.)"
    }
}





fun generarTazasAleatorias(cantidadTazas: Int): List<Taza> {
    return List(cantidadTazas) {
        val capacidadAleatoria = when (Random.nextInt(3)) {
            0 -> 50
            1 -> 75
            else -> 100
        }

        Taza(capacidad = capacidadAleatoria)
    }
}







fun main(){

    val cafetera1 = Cafetera("Salón", 1000, 0)
    val cafetera2 = Cafetera("Cocina", 750, 750)
    val cafetera3 = Cafetera("Balcón", 500, 200)


    println(cafetera1)
    println(cafetera2)
    println(cafetera3)


    val tazas = generarTazasAleatorias(20)

    print("\n **LISTA DE TAZAS**")
    tazas.forEach{ println(it)}


    println("**********************************************")












}