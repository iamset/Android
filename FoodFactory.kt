
interface Food {
    val type:String;
    fun getType();

}

class Pizza(override val type:String): Food{
    override fun getType() {
        println("Someone ordered Fast food");
    }
}

class Cake (override val type:String):Food{
    override fun getType() {
        println("Someone ordered Dessert!")
    }
}

class FoodFactory {

    fun getFood(type:String){
        val obj:object? = null;
        if(type == "Pizza"){
            println("The factory returned class Pizza")
            val obj = Pizza(type);


        } else {
            println("The factory returned class cake");
            obj = Cake(type);
        }
        return obj;
    }
}

fun main(){
    val factory = FoodFactory();

    factory.getFood("Pizza");

    factory.getFood("Cake");


}
