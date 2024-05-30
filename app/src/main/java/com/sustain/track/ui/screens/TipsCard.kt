package com.sustain.track.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sustain.track.R

@Composable
fun TipsCard(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier.background(Color(0xFFFDF6EE))
            .requiredHeight(120.dp)
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        Row(
            modifier = Modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(0.7f)) {
                Text(
                    modifier = Modifier.padding(bottom = 8.dp),
                    text = "Public transport",
                    color = Color(0xFFFB4F00),
                    fontSize = 24.sp,
                    style = MaterialTheme.typography.labelLarge,
                )
                Text(
                    modifier = Modifier.padding(bottom = 16.dp),
                    text = "Use SL transport for daily \ncommute to work places",
                    color = Color(0xFF512B2B),
                    fontSize = 14.sp,
                    style = MaterialTheme.typography.bodySmall,
                )

                Text(
                    text = "Read more",
                    color = Color(0xFF257886),
                    fontSize = 16.sp,
                    style = MaterialTheme.typography.labelLarge,
                )
            }
            Image(
                modifier = Modifier.weight(0.3f),
                painter = painterResource(id = R.drawable.sl_logo),
                contentDescription = "",
            )
        }
    }
}


@Preview(showSystemUi = true)
@Composable
private fun Preview() {
    TipsCard()
}