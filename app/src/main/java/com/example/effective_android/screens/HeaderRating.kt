import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.effective_android.R

@Preview(showBackground = true)
@Composable
fun HeaderRating() {
    Text(
        text = stringResource(id = R.string.reviewHeader),
        color = MaterialTheme.colorScheme.onPrimary,
        style = MaterialTheme.typography.titleMedium,
        modifier = Modifier.padding(start = 24.dp, bottom = 12.dp)
    )
    Row(
        verticalAlignment = Alignment.Bottom,
        modifier = Modifier.padding(start = 24.dp, end = 24.dp, bottom = 30.dp)
    ) {
        Text(
            text = stringResource(id = R.string.gameRating),
            color = MaterialTheme.colorScheme.secondary,
            style = MaterialTheme.typography.titleLarge
        )
        Column(modifier = Modifier.padding(start = 17.dp)) {
            Image(
                painter = painterResource(id = R.drawable.stars),
                contentDescription = stringResource(id = R.string.img_desc_rating),
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Text(
                text = stringResource(id = R.string.longNumberOfReviews),
                color = MaterialTheme.colorScheme.onSecondary,
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(bottom = 7.dp)
            )
        }
    }
}