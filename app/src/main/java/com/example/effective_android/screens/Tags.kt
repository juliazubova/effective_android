import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.effective_android.R

@Preview(showBackground = true)
@Composable
fun Tags() {
    val tags = stringArrayResource(R.array.tags)
    Row(
        modifier = Modifier.padding(start = 24.dp, end = 24.dp, bottom = 30.dp)
    ) {
        for (elem in tags)
            Tag(elem)
    }
}

@Composable
fun Tag(name: String) {
    Row(
        modifier = Modifier
            .height(22.dp)
            .clip(shape = RoundedCornerShape(200.dp))
            .background(color = MaterialTheme.colorScheme.primaryContainer),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Spacer(modifier = Modifier.width(10.dp))
        Text(
            text = name,
            style = MaterialTheme.typography.labelMedium,
            color = MaterialTheme.colorScheme.onPrimaryContainer
        )
        Spacer(modifier = Modifier.width(10.dp))
    }
    Spacer(modifier = Modifier.width(10.dp))
}