import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.effective_android.R

@Composable
fun Comment(image: Int, imgDesc: String, username: String, date: String, comment: String) {
    Row(
        modifier = Modifier.padding(start = 24.dp, end = 24.dp)
    ) {
        Image(
            painter = painterResource(id = image),
            contentDescription = imgDesc,
            modifier = Modifier
                .size(36.dp)
                .padding(end = 16.dp)
        )
        Column {
            Text(
                text = username,
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.secondary,
                modifier = Modifier.padding(bottom = 7.dp)
            )
            Text(
                text = date,
                style = MaterialTheme.typography.titleSmall,
                color = MaterialTheme.colorScheme.onSecondary,
                modifier = Modifier.padding(bottom = 7.dp)
            )
        }
    }
    Text(
        text = comment,
        style = MaterialTheme.typography.headlineSmall,
        color = MaterialTheme.colorScheme.onPrimary,
        modifier = Modifier.padding(start = 24.dp, bottom = 24.dp, end = 24.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun Reviews() {
    Comment(
        R.drawable.person1,
        stringResource(id = R.string.img_desc_commentator1),
        stringResource(id = R.string.commentator1),
        stringResource(id = R.string.date1),
        stringResource(id = R.string.comment1)
    )
    Divider(
        color = MaterialTheme.colorScheme.onSecondary,
        thickness = 1.dp,
        modifier = Modifier.padding(bottom = 24.dp, start = 38.dp, end = 38.dp)
    )
    Comment(
        R.drawable.person2,
        stringResource(id = R.string.img_desc_commentator2),
        stringResource(id = R.string.commentator2),
        stringResource(id = R.string.date2),
        stringResource(id = R.string.comment2)
    )
}