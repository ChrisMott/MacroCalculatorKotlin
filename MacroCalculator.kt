

import java.util.*
import kotlin.collections.ArrayList

//data class Food(var name:String, var servings:Double, var calories:Double, var carbs:Double, var fat:Double, var protein:Double)

fun main(){

    //var allFoodMacros = arrayOf<Food>()

    val allFoodMacros: MutableList<Food> = ArrayList()


    var greenBeans = Food("Green Beans", 4.0, 140.0, 24.0, 0.0, 8.0 )

    var eggs = Food("Eggs", 1.0, 20.0, 5.0, 12.0, 16.0)

    allFoodMacros.add(greenBeans)
    

    allFoodMacros.add(eggs)


    for(food in allFoodMacros){

        println(food)



    }


}