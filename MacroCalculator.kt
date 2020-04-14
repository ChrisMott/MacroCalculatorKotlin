

import java.util.*
import kotlin.collections.ArrayList

//data class Food(var name:String, var servings:Double, var calories:Double, var carbs:Double, var fat:Double, var protein:Double)

fun main(){

    //var allFoodMacros = arrayOf<Food>()

    val allFoodMacros: MutableList<Food> = ArrayList()

    var macroInput = Scanner(System.`in`)


    var greenBeans = Food("Green Beans", 4.0, 140.0, 24.0, 0.0, 8.0 )

    var eggs = Food("Eggs", 1.0, 20.0, 5.0, 12.0, 16.0)

    allFoodMacros.add(greenBeans)


    allFoodMacros.add(eggs)

    println("Enter a piece of food or meal that you made starting with it's name: ")

    val enteredFoodName: String = macroInput.nextLine()

    println("Enter the amount of servings consumed: ")

    val enteredServings: Double = macroInput.nextDouble()

    println("Enter the amount of calories per serving: ")

    val enteredCalories: Double = macroInput.nextDouble()

    println("Enter the amount of carbohydrates per serving: ")

    val enteredCarbs: Double = macroInput.nextDouble()

    println("Enter the amount of fats per serving: ")

    val enteredFats: Double = macroInput.nextDouble()

    println("Enter the amount of proteins per serving: ")

    val enteredProteins: Double = macroInput.nextDouble()



    var newFood = Food(enteredFoodName,enteredServings,enteredCalories,enteredCarbs,enteredFats,enteredProteins)

    allFoodMacros.add(newFood)



    for(food in allFoodMacros){

        println(food)



    }


}