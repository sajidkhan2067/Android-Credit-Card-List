import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    // Define the base URL for the API
    private const val BASE_URL = "https://random-data-api.com/api/v2/"

    // Create a Retrofit instance using lazy initialization
    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    // Define a property to access the CreditCardService interface
    val creditCardService: CreditCardService by lazy {
        // Create an instance of the CreditCardService interface using Retrofit
        retrofit.create(CreditCardService::class.java)
    }
}

