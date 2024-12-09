package com.example.s1122043
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    var gameDuration by remember { mutableStateOf(6) }
    var score by remember { mutableStateOf(0) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xff95fe95))
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxSize().padding(16.dp)
        ) {

            Text(
                text = "2024期末上機考 (資管四A楊子青)",
                fontSize = 18.sp,
                color = Color.Black,
                modifier = Modifier.padding(top = 8.dp)
            )


            Image(
                painter = painterResource(id = R.drawable.class_b), // 替換為您的圖片資源
                contentDescription = "Group Photo",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(8.dp)
            )


            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = "遊戲持續時間 ${gameDuration} 秒",
                    fontSize = 16.sp,
                    color = Color.Black,
                    modifier = Modifier.padding(8.dp)
                )
                Text(
                    text = "您的成績 ${score} 分",
                    fontSize = 16.sp,
                    color = Color.Black,
                    modifier = Modifier.padding(8.dp)
                )
            }


            Button(
                onClick = { closeApp() },
                modifier = Modifier.padding(bottom = 16.dp)
            ) {
                Text(text = "結束App")
            }

        }
    }
}

fun closeApp() {
    System.exit(0)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}
