package com.example.bonus_assignment_19k1513

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bonus_assignment_19k1513.ui.theme.Bonus_assignment_19k1513Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Bonus_assignment_19k1513Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TapApp();
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Bonus_assignment_19k1513Theme {
        TapApp();
    }
}

@Composable
fun TapApp()
{
    var count by remember { mutableStateOf(0) }

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
         Text(text = "$count" ,
         style = MaterialTheme.typography.h4,
         fontSize = 24.sp,
         color = Color.Black
         )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { count++ },
            modifier = Modifier
                .padding(16.dp)
                .height(48.dp)
                .width(200.dp)
                .clickable { count++ }
        )
        {
           Text(text = "Tab",
            style = MaterialTheme.typography.button,
            fontSize = 16.sp,
            color = Color.White)
        }
    }
}