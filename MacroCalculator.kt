import java.util.*
import kotlin.collections.ArrayList

val allFoodMacros: MutableList<Food> = ArrayList()

var macroInput = Scanner(System.`in`)

var removalInput = Scanner(System.`in`)

var runInput: Int = 1

var endInput = Scanner(System.`in`)

fun main() {


    var greenBeans = Food("Green Beans", 4.0, 140.0, 24.0, 0.0, 8.0)

    var eggs = Food("Eggs", 1.0, 20.0, 5.0, 12.0, 16.0)

    allFoodMacros.add(greenBeans)


    allFoodMacros.add(eggs)

    println("Welcome to the Macro Calculator! This calculator will help you track your macro-nutrients on a daily basis.")


    while (runInput != 0) {


        when (runInput) {

            1 -> userInputFood()

            2 -> removeFood()

            3 -> calculateTotalMacros()

            else -> runInput = endInput.nextInt()
        }


    }
}


fun userInputFood() {


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

    var newFood = Food(enteredFoodName, enteredServings, enteredCalories, enteredCarbs, enteredFats, enteredProteins)

    allFoodMacros.add(newFood)



    println()

    printFoodLog()

    println()

    nextDecision()

//    println("Do you wish to add food information? Enter 0 to stop.")
//
//    println()
//
//    println("Enter 1 to add a Food item.")
//
//    println()
//
//    println("If you wish to remove an item, enter 2.")
//
//    println()
//
//    println("If you wish to calculate your total macros consumed so far today, enter 3.")
//
//    println()
//
//    runInput = endInput.nextInt()
//
//
//
//    macroInput = Scanner(System.`in`)


}

fun removeFood() {


    println("Which food item do you wish to remove from your food log? Enter the corresponding number of the food item for removal")

    printFoodLog()

//    var counter: Int = 0
//
//    for (food in allFoodMacros) {
//
//
//        println(counter.toString() + " --- " + food)
//
//        counter++
//
//
//    }

    var removeFoodAt: Int = removalInput.nextInt()

    allFoodMacros.removeAt(removeFoodAt)

    println("The Food log now contains: ")


    printFoodLog()

//    for (food in allFoodMacros) {
//
//        println(food)
//
//
//    }

    println()

    nextDecision()

//    println("Do you wish to add food information? Enter 0 to stop.")
//
//    println()
//
//    println("Enter 1 to add a Food item.")
//
//    println()
//
//    println("If you wish to remove another item, enter 2.")
//
//    println()
//
//    println("If you wish to calculate your total macros consumed so far today, enter 3.")
//
//    println()
//
//    runInput = endInput.nextInt()
//
//    macroInput = Scanner(System.`in`)

}

fun calculateTotalMacros(){

    var totalCalories: Double = 0.0

    var totalCarbohydrates: Double = 0.0

    var totalFats: Double = 0.0

    var totalProteins: Double = 0.0

    for(food in allFoodMacros){

        totalCalories += food.calories

        totalCarbohydrates += food.carbs

        totalFats += food.fat

        totalProteins += food.protein

    }

    printFoodLog()

    println("_________________________________________________________________")

    println()

    println("The total of your macros for today is currently: ")

    println()

    println(totalCalories.toString() + " calories consumed.")

    println()

    println(totalCarbohydrates.toString() + " carbs consumed.")

    println()

    println(totalFats.toString() + " fats consumed.")

    println()

    println(totalProteins.toString() + " proteins consumed.")

    println()

    nextDecision()


}

fun nextDecision(){


    println("Do you wish to add food information? Enter 0 to stop.")

    println()

    println("Enter 1 to add a Food item.")

    println()

    println("If you wish to remove another item, enter 2.")

    println()

    println("If you wish to calculate your total macros consumed so far today, enter 3.")

    println()

    runInput = endInput.nextInt()

    macroInput = Scanner(System.`in`)

}

fun printFoodLog(){
    var counter: Int = 0

    println("Today's Food Log:")

    println("_________________________________________________________________")

    println()

    for (food in allFoodMacros) {


        println(counter.toString() + " --- " + food)

        counter++


    }

}