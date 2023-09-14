data class Order(
    val orderId: Int,
    val month: String,
    val amount: Int
)
 
fun main() {
   val orderList = listOf(
       Order(1, "August", 40),
       Order(2, "August", 27),
       Order(3, "September", 44),
       Order(4, "September", 57),
       Order(5, "October", 38),
   )
   
   val aggregatesSalesTaxForSeptember = orderList.filter { order ->
       order.month == "September"
   }.map { order ->
       9.5 /100 * order.amount
   }.fold(0.0) { totalSalesTax, salesTaxForOrder ->
       totalSalesTax + salesTaxForOrder
   }
   
   println(aggregatesSalesTaxForSeptember)
}
