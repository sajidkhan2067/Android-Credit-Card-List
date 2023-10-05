import retrofit2.http.GET
import retrofit2.http.Query

// Define a Retrofit service interface for Credit Cards
interface CreditCardService {
    // Define a function to make a GET request to retrieve credit card data
    @GET("credit_cards") // Specify the endpoint for the GET request
    // The 'suspend' keyword indicates that this function can be called from a coroutine
    // It returns a list of 'CreditCardResponse' objects asynchronously
    // The '@Query' annotation is used to specify query parameters, in this case, 'size'
    suspend fun getCreditCards(@Query("size") size: Int): List<CreditCardResponse>
}
