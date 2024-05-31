package com.sustain.track.ui.screens.track

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sustain.track.R
import com.sustain.track.ui.screens.TipsCard
import com.sustain.track.ui.screens.TrackItem
import com.sustain.track.ui.screens.home.TransactionViewModel

@Composable
fun NewTrackScreen(
    viewModel: TransactionViewModel = viewModel(),
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .background(Color(0xFFFDF6EE))
            .padding(16.dp)
            .fillMaxSize()
    ) {
        Text(
            text = "Hi John,",
            fontSize = 24.sp,
            color = Color(0xFF512B2B)
        )
        Text(
            modifier = Modifier.padding(top = 8.dp, bottom = 16.dp),
            text = "Your have emitted 68 kg CO2 this month",
            fontSize = 16.sp,
            color = Color(0xFF512B2B)
        )
        Image(
            modifier = Modifier.fillMaxWidth(),
            painter = painterResource(id = R.drawable.ic_graph_circle),
            contentDescription = "transaction type icon",
        )
        Row(
            modifier = Modifier
                .padding(top = 16.dp)
                .requiredHeight(56.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            TrackItem(modifier = Modifier.weight(0.5f))
            TrackItem(modifier = Modifier.weight(0.5f))
        }
        Text(
            modifier = Modifier
                .padding(vertical = 16.dp),
            text = "Worried? Here’s what we can  need to do",
            textAlign = TextAlign.Center,
            fontSize = 24.sp,
            color = Color(0xFF512B2B),
            style = MaterialTheme.typography.labelLarge,
        )
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(viewModel.transactions) { item ->
                TipsCard()
            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun Preview() {
    NewTrackScreen()
}