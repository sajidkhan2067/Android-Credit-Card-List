// Define a data class representing a Credit Card Response
data class CreditCardResponse(
    val id: Int, // Unique identifier for the credit card
    val uid: String, // User ID associated with the credit card
    val credit_card_number: String, // Credit card number
    val credit_card_expiry_date: String, // Credit card expiry date
    val credit_card_type: String // Credit card type (e.g., Visa, MasterCard)
)
