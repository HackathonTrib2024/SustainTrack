package com.sustain.track.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
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
fun TrackItem(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
    ) {
        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                modifier = Modifier.weight(.1f),
                painter = painterResource(id = R.drawable.ic_taxi),
                contentDescription = "transaction type icon",
            )
            Column(
                modifier = Modifier
                    .weight(.9f)
                    .padding(start = 8.dp),
                verticalArrangement = Arrangement.SpaceEvenly
            ) {

                Text(
                    text = "Uber",
                    style = MaterialTheme.typography.labelLarge,
                    color = Color(0xFF512B2B)
                )

                Text(
                    text = "Mostly used transport",
                    style = MaterialTheme.typography.labelMedium,
                    color = Color(0xFF512B2B),
                    modifier = Modifier.padding(vertical = 4.dp),
                )
            }
        }
    }
}

@Preview(showSystemUi = false, showBackground = true)
@Composable
private fun Preview() {
    TrackItem()
}