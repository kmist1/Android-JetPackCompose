package com.example.articleapp

import android.graphics.drawable.PaintDrawable
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.articleapp.ui.theme.ArticleAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArticleAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeArticle()
                }
            }
        }
    }
}

@Composable
fun ComposeArticle() {
    Column {
        ArticleImage()
        Column(modifier = Modifier
            .align(Alignment.CenterHorizontally)) {
            ComposeTitle()
            ComposeDescription()
        }
    }
}

@Composable
fun ArticleImage() {
    Image(painter = painterResource(id = R.drawable.bg_compose_background), contentDescription = "composeImage")
}

@Composable
fun ComposeTitle() {
    Text(text = stringResource(R.string.jetpack_compose_tutorial),
        fontSize = 24 .sp,
        modifier = Modifier
            .padding(all = 16 .dp))
}

@Composable
fun ComposeDescription() {
    Text(text = stringResource(R.string.jetpack_compose_tutorial_description),
        modifier = Modifier
            .padding(start = 16 .dp, end = 16 .dp),
        textAlign = TextAlign.Justify)
    Text(text = stringResource(R.string.jetpack_compose_tutorial_description1),
        modifier = Modifier
            .padding(all = 16 .dp),
        textAlign = TextAlign.Justify)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArticleAppTheme {
       ComposeArticle()
    }
}