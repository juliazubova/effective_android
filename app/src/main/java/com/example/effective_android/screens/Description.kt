import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.effective_android.R

@Preview(showBackground = true)
@Composable
fun Descrition() {
    Text(
        text = stringResource(id = R.string.game_description),
        color = MaterialTheme.colorScheme.onPrimary,
        style = MaterialTheme.typography.bodyMedium,
        modifier = Modifier.padding(start = 24.dp, end = 24.dp, bottom = 15.dp)
    )
}