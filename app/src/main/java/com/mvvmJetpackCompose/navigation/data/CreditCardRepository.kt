class CreditCardRepository {
    // Create an instance of the credit card service from Retrofit
    private val creditCardService = RetrofitInstance.creditCardService

    // Define the number of credit cards to fetch
    private val numberOfCard = 10

    // Function to fetch a list of credit cards asynchronously
    suspend fun getCreditCards(): List<CreditCardResponse> {
        return creditCardService.getCreditCards(numberOfCard)
    }
}
