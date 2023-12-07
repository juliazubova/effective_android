package com.example.effective_android.screens

import Descrition
import HeaderImage
import HeaderRating
import HeaderWithLogo
import InstallButton
import Reviews
import Tags
import VideoCarousel
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MainScreen() {
    val lazyListState = rememberLazyListState()

    LazyColumn(
        state = lazyListState,
        modifier = Modifier
            .background(MaterialTheme.colorScheme.primary)
            .fillMaxSize(),
    ) {
        item {
            HeaderImage()
        }
        item {
            HeaderWithLogo()
        }
        item {
            Tags()
        }
        item {
            Descrition()
        }
        item {
            VideoCarousel()
        }
        item {
            HeaderRating()
        }
        item {
            Reviews()
        }
        item {
            InstallButton()
        }
    }
}
