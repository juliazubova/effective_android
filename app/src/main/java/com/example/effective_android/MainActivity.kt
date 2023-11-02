package com.example.effective_android

import android.content.res.Resources
import android.os.Bundle
import android.provider.Settings
import android.provider.Settings.Global.getString
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.effective_android.ui.theme.Effective_androidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val res: Resources = resources
            Effective_androidTheme {
                Column(modifier = Modifier
                    .fillMaxSize()
                    .background(color = MaterialTheme.colorScheme.primary)
                    .verticalScroll(rememberScrollState())
                ){
                    HeaderImage()
                    Card(
                        colors = CardDefaults.cardColors(MaterialTheme.colorScheme.primary),
                        modifier = Modifier.padding(start = 24.dp).fillMaxWidth()
                    ) {
                        HeaderWithLogo(getString(R.string.game_name), getString(R.string.number_of_reviews))
                        Spacer(modifier = Modifier.height(16.dp))
                        TagsAndDescrition(res.getStringArray(R.array.tags), getString(R.string.game_description))
                        Carousel()
                    }
                }

            }
        }
    }
}

@Composable
fun HeaderImage(){
    Image(
        painter = painterResource(id = R.drawable.header),
        contentDescription = "image",
        contentScale = ContentScale.FillWidth,
        modifier = Modifier.fillMaxWidth()
    )
}

//@Preview(showBackground = true)
@Composable
fun HeaderWithLogo(game_name: String, number_of_reviews: String){
    Row(verticalAlignment = Alignment.CenterVertically) {
        Image (
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.width(88.dp))
        Spacer(modifier = Modifier.width(12.dp))
        Column {
            Text(
                text = game_name,
                color = MaterialTheme.colorScheme.secondary,
                style = MaterialTheme.typography.headlineLarge,
                modifier = Modifier.padding(end = 6.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Row {
                Image(
                    painter = painterResource(id = R.drawable.stars),
                    contentDescription = "image"
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = number_of_reviews,
                    color = MaterialTheme.colorScheme.onSecondary,
                    style = MaterialTheme.typography.headlineSmall
                )
            }
        }
    }
}

@Composable
fun TagsAndDescrition(tags: Array<String>, description: String){
    Row {
        for (elem in tags)
            Tag(elem)
    }
    Spacer(modifier = Modifier.height(30.dp))
    Text(
        text = description,
        color = MaterialTheme.colorScheme.onPrimary,
        style = MaterialTheme.typography.bodyMedium,
        modifier = Modifier.padding(end = 24.dp, bottom = 15.dp)
    )
}

@Composable
fun Tag(name: String){
    Row(
        modifier = Modifier
            .height(22.dp)
            .clip(shape = RoundedCornerShape(200.dp))
            .background(color = MaterialTheme.colorScheme.primaryContainer),
        //contentAlignment = Alignment.Center
        verticalAlignment = Alignment.CenterVertically
    ){
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
@Preview(showBackground = true)
@Composable
fun Carousel(){
    Row(modifier = Modifier
        .padding(bottom = 20.dp)
        .horizontalScroll(rememberScrollState())) {
        ImageInCarousel(R.drawable.example_image1)
        ImageInCarousel(R.drawable.example_image2)
    }
}

@Composable
fun ImageInCarousel(path: Int){
    Image(
        painter = painterResource(id = path),
        contentDescription = "image",
        contentScale = ContentScale.FillBounds,
        modifier = Modifier
            .width(240.dp)
            .height(135.dp)
            .padding(end = 13.dp)
            .clip(RoundedCornerShape(16.dp))
    )
}