/**
 *Exercise 1
 * Using a when expression, update the following program so that when you input the names of GameBoy buttons, the actions are printed to output.
 * Button Action
 * The following examples use the increment operator ++ to increment the value of the cakesEaten variable.
 * 75
 * A Yes
 * B No
 * X Menu
 * Y Nothing
 * Other There is no such button
 * Button Action
 * fun main() {
 * val button = "A"
 * println(
 * // Write your code here
 * )
 * }
 *
 */
fun main() {
    val button = "A"
    println(
        when (button) {
            "A" -> "Yes"
            "B" -> "No"
            "X" -> "Menu"
            "Y" -> "Nothing"
            else -> "There is no such button"
        }
    )
}
