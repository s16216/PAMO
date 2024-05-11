package com.example.myapplication

//
//class FeedSuggestionGenerator {
//    fun generateFeed(bmi: Float): String {
//        return when {
//            bmi < 16 -> "Mięso, warzywa, kasze, ryż"
//            bmi < 18.5 -> "Mięso, warzywa, kasze"
//            bmi < 25 -> "Warzywa, owoce, wędliny"
//            bmi < 30 -> "Dużo wody, warzywa, produkty mało przetworzone, aktywność fizyczna"
//            else -> "Dużo wody, dieta niskokaloryczna, regularne badania"
//        }
//    }
//}
class FeedSuggestionGenerator {
    fun generateFeed(bmi: Float): List<List<String>> {
        return when {
            bmi < 16 -> listOf(
                listOf("Chicken", "Carrots", "Peas", "Rice", "Soy Sauce"),
                listOf("Beef", "Potatoes", "Onions", "Tomatoes", "Basil")
            )
            bmi < 18.5 -> listOf(
                listOf("Pork", "Sweet Potatoes", "Spinach", "Milk", "Quinoa"),
                listOf("Turkey", "Lettuce", "Cucumber", "Apples", "Walnuts")
            )
            bmi < 25 -> listOf(
                listOf("Salmon", "Broccoli", "Garlic", "Lemon", "Almonds"),
                listOf("Tofu", "Cauliflower", "Chickpeas", "Parsley", "Olive Oil")
            )
            bmi < 30 -> listOf(
                listOf("Tuna", "Celery", "Tomato Sauce", "Cheese", "Pasta"),
                listOf("Sardines", "Bell Peppers", "Eggplant", "Coconut Milk", "Rice Noodles")
            )
            else -> listOf(
                listOf("Lentils", "Kale", "Sweet Corn", "Avocado", "Sesame Seeds"),
                listOf("Mushrooms", "Zucchini", "Bean Sprouts", "Scallions", "Tahini")
            )
        }
    }
}
