import kotlin.random.Random
 
fun main() {
    
    var maximumDiscountValue = 0
    
    repeat(3) { index ->
        val discount = Random.nextInt(10)
        println("Attempt ${index+1}: $discount")
        if (discount > maximumDiscountValue) {
            maximumDiscountValue = discount
        }
    }
    
    println(maximumDiscountValue)
}