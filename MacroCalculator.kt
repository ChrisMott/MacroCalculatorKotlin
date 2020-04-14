

import java.util.*
import kotlin.collections.ArrayList

val allFoodMacros: MutableList<Food> = ArrayList()

var macroInput = Scanner(System.`in`)

var runInput: Int = 1

var endInput = Scanner(System.`in`)

fun main(){



    var greenBeans = Food("Green Beans", 4.0, 140.0, 24.0, 0.0, 8.0 )

    var eggs = Food("Eggs", 1.0, 20.0, 5.0, 12.0, 16.0)

    allFoodMacros.add(greenBeans)


    allFoodMacros.add(eggs)

    println("Welcome to the Macro Calculator! This calculator will help you track your macro-nutrients on a daily basis.")


    while( runInput != 0) {





        userInputFood()



        }

    println("Today's Food Log: ")
    println()

    for(food in allFoodMacros){

        println(food)


    }

    }






fun userInputFood(){

    println("Enter a piece of food or meal that you made starting with it's name: ")

    var enteredFoodName: String = macroInput.nextLine()

    println("Enter the amount of servings consumed: ")

    var enteredServings: Double = macroInput.nextDouble()

    println("Enter the amount of calories per serving: ")

    var enteredCalories: Double = macroInput.nextDouble()

    println("Enter the amount of carbohydrates per serving: ")

    var enteredCarbs: Double = macroInput.nextDouble()

    println("Enter the amount of fats per serving: ")

    var enteredFats: Double = macroInput.nextDouble()

    println("Enter the amount of proteins per serving: ")

    var enteredProteins: Double = macroInput.nextDouble()

    var newFood = Food(enteredFoodName,enteredServings,enteredCalories,enteredCarbs,enteredFats,enteredProteins)

    allFoodMacros.add(newFood)

    println("Do you wish to keep adding food information? Press 0 to stop. Press any other key to add another item.")

    runInput = endInput.nextInt()

    macroInput = Scanner(System.`in`)


}