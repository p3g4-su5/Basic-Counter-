package com.example.counterscreen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CounterScreen() {
    var count by remember { mutableIntStateOf(0) }

    // Count colour: green for positive, grey for zero
    val countColor = if (count > 0) Color(0xFF4CAF50) else Color(0xFF9E9E9E)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Large count display in the centre
        Text(
            text = count.toString(),
            fontSize = 96.sp,
            fontWeight = FontWeight.Bold,
            color = countColor
        )

        Spacer(modifier = Modifier.height(48.dp))

        // Row of three buttons: -, Reset, +
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Decrement button — disabled when count is 0
            Button(
                onClick = { if (count > 0) count-- },
                enabled = count > 0,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFF44336),
                    disabledContainerColor = Color(0xFFBDBDBD)
                ),
                modifier = Modifier.size(72.dp)
            ) {
                Text(
                    text = "-",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            // Reset button
            Button(
                onClick = { count = 0 },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF607D8B)
                ),
                modifier = Modifier
                    .height(72.dp)
                    .padding(horizontal = 4.dp)
            ) {
                Text(
                    text = "Reset",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }

            // Increment button
            Button(
                onClick = { count++ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF4CAF50)
                ),
                modifier = Modifier.size(72.dp)
            ) {
                Text(
                    text = "+",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CounterScreenPreview() {
    com.example.counterscreen.ui.theme.CounterScreenTheme {
        CounterScreen()
    }
}