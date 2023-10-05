import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

// Create a ViewModel class for managing UI-related data
class CreditCardViewModel : ViewModel() {

    // Create an instance of the CreditCardRepository to handle data retrieval
    private val repository = CreditCardRepository()

    // Create a MutableLiveData to hold the list of credit card data
    private val _creditCards = MutableLiveData<List<CreditCardResponse>>()

    // Expose an immutable LiveData for the UI to observe
    val creditCards: LiveData<List<CreditCardResponse>> = _creditCards

    // Function to fetch credit card data using coroutines
    fun fetchCreditCards() {
        viewModelScope.launch {
            try {
                // Use the repository to get credit card data asynchronously
                val cards = repository.getCreditCards()

                // Update the MutableLiveData with the fetched data
                _creditCards.value = cards
            } catch (e: Exception) {
                // Handle any errors that may occur during data retrieval
                // Typically, you would implement error handling here
            }
        }
    }
}
