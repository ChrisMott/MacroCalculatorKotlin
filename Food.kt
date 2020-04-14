class Food(var name: String, var servings: Double, var calories: Double, var carbs: Double, var fat: Double, var protein: Double){






override fun toString(): String {

    var returnMacros: String = "Food is " + name + " " + servings + " servings " + calories + " calories " + carbs + " carbs " +  fat + " fats " + protein + " proteins."

    return returnMacros


}

//    var name: String = ""
//
//    var servings: Double = 0.0
//
//    var calories: Double = 0.0
//
//    var carbs: Double = 0.0
//
//    var fat: Double = 0.0
//
//    var protein: Double = 0.0




}