package com.example.vyn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.vyn.ui.theme.VynTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VynTheme {
                HalfRedWhiteScreen()
            }
        }
    }
}

@Composable
fun HalfRedWhiteScreen() {

    Box(modifier = Modifier.fillMaxSize()) {

        // 🔴 TOP HALF (MERAH)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.5f)
                .align(Alignment.TopCenter)
                .background(Color.Red)
        )

        // ⚪ BOTTOM HALF (PUTIH)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.5f)
                .align(Alignment.BottomCenter)
                .background(Color.White)
        )

        // 📄 CONTENT
        Column(
            modifier = Modifier
                .align(Alignment.Center)
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Text(text = "Nama   : Calvin Putra Pratama", color = Color.Green)
            Text(text = "NIM    : 25.52.0004", color = Color.Green)
            Text(text = "Kota   : Malang", color = Color.Blue)
            Text(text = "Alamat : Jalan Konoha No.14 Kota Malang", color = Color.Blue)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHalfRedWhite() {
    VynTheme {
        HalfRedWhiteScreen()
    }
}
