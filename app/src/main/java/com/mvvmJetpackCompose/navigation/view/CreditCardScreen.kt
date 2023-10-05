import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.mvvmJetpackCompose.navigation.R

// Composable function for the CreditCardScreen
@Composable
fun CreditCardScreen(viewModel: CreditCardViewModel) {
    // Observe the creditCards LiveData using observeAsState
    val creditCards by viewModel.creditCards.observeAsState(null)

    // Fetch credit cards when the composable is launched
    LaunchedEffect(Unit) {
        viewModel.fetchCreditCards()
    }

    Column {
        if (creditCards == null) {
            // Show loading indicator or placeholder when creditCards is null
            Text(text = stringResource(R.string.loading))
        } else {
            // Display the list of credit cards when creditCards is not null
            CreditCardItem(creditCards!!)
        }
    }
}

// Composable function for displaying a list of credit cards
@Composable
fun CreditCardItem(items: List<CreditCardResponse>) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            LazyColumn {
                items(items) { item ->
                    // Display credit card number
                    Text(
                        text = item.credit_card_number,
                        style = MaterialTheme.typography.bodyLarge
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    // Display credit card expiry date
                    Text(
                        text = stringResource(R.string.expiry_date, item.credit_card_expiry_date),
                        style = MaterialTheme.typography.bodySmall
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    // Display credit card type
                    Text(
                        text = item.credit_card_type,
                        style = MaterialTheme.typography.bodySmall
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    // Add a divider between credit card items
                    Divider(Modifier.height(2.dp))
                }
            }
        }
    }
}
