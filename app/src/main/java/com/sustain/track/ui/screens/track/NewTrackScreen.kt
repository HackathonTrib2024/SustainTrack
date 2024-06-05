package com.sustain.track.ui.screens.track

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.jaikeerthick.composable_graphs.composables.pie.PieChart
import com.sustain.track.ui.screens.TipsCard
import com.sustain.track.ui.screens.TrackItem
import com.sustain.track.ui.screens.home.TransactionViewModel

@Composable
fun NewTrackScreen(
    modifier: Modifier = Modifier.verticalScroll(rememberScrollState()),
    viewModel: TransactionViewModel = viewModel(),
) {
    Column(
        modifier = modifier
            .background(Color(0xFFFDF6EE))
            .padding(16.dp)
            .fillMaxSize()
    ) {
        Text(
            text = "Hi John,",
            style = MaterialTheme.typography.titleLarge,
            color = Color(0xFF512B2B)
        )
        Text(
            modifier = Modifier.padding(top = 8.dp, bottom = 16.dp),
            text = "Your have emitted 68 kg CO2 this month",
            style = MaterialTheme.typography.labelMedium,
            color = Color(0xFF512B2B)
        )
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .shadow(
                    elevation = 16.dp,
                    shape = RoundedCornerShape(14.dp)
                )
        ) {
            Box(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                contentAlignment = Alignment.Center
            ) {
                PieChart(
                    modifier = Modifier
                        .padding(20.dp)
                        .size(180.dp),
                    data = viewModel.pieChartData,
                    style = viewModel.pieChartStyle,
                    onSliceClick = {}
                )
            }
        }
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
            text = "Worried? Here’s what we can  need to do",
            textAlign = TextAlign.Center,
            color = Color(0xFF512B2B),
            style = MaterialTheme.typography.labelLarge,
        )
        TipsCard(modifier = Modifier.padding(top = 16.dp, bottom = 8.dp))
        TipsCard(modifier = Modifier.padding(bottom = 8.dp))
        TipsCard(modifier = Modifier.padding(bottom = 8.dp))
    }
}


@Preview(showSystemUi = true)
@Composable
fun Preview() {
    NewTrackScreen()
}