import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.effective_android.R

@Preview(showBackground = true)
@Composable
fun HeaderImage() {
    Image(
        painter = painterResource(id = R.drawable.header),
        contentDescription = stringResource(R.string.img_desc_header),
        contentScale = ContentScale.FillWidth,
        modifier = Modifier.fillMaxWidth()
    )
}