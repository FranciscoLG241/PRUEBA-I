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
}