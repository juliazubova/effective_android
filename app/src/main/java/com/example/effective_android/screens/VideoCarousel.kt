import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.effective_android.R

@Preview(showBackground = true)
@Composable
fun VideoCarousel() {
    Row(
        modifier = Modifier
            .padding(bottom = 20.dp)
            .horizontalScroll(rememberScrollState())
    ) {
        Spacer(modifier = Modifier.padding(start = 24.dp))
        ImageInCarousel(R.drawable.example_image1, stringResource(id = R.string.img_desc_example1))
        ImageInCarousel(R.drawable.example_image2, stringResource(id = R.string.img_desc_example2))
        Spacer(modifier = Modifier.padding(start = 11.dp))
    }
}

@Composable
fun ImageInCarousel(path: Int, imgDesc: String) {
    Image(
        painter = painterResource(id = path),
        contentDescription = imgDesc,
        contentScale = ContentScale.FillBounds,
        modifier = Modifier
            .width(240.dp)
            .height(135.dp)
            .padding(end = 13.dp)
            .clip(RoundedCornerShape(16.dp))
    )
}