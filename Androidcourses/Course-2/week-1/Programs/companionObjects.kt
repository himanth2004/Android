data class OrderItem(
    val name: String,
    val price: Double
)

class TaxCalculator {
    companion object {
        val salesTaxPercentage = 15.0

        fun getTaxAmountForOrderItems(orderItems: List<OrderItem>): Double {
            var orderAmount = 0.00

            for (orderItem in orderItems) {
                orderAmount += orderItem.price
            }

            return orderAmount * salesTaxPercentage / 100.0
        }
    }
}

fun main() {
    val orderItemList = listOf(
        OrderItem("Burger", 8.00),
        OrderItem("Fries", 4.00),
        OrderItem("Soda", 2.00)
    )

    val taxAmount = TaxCalculator.getTaxAmountForOrderItems(orderItemList)

    println(taxAmount)
}
