package com.sustain.track.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sustain.track.R
import com.sustain.track.modal.home.IconConfig
import com.sustain.track.modal.home.TransactionItem

@Composable
fun TransactionItemScreen(
    modifier: Modifier = Modifier,
    item: TransactionItem,
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                modifier = Modifier.size(24.dp).weight(.1f),
                painter = painterResource(id = item.iconConfig.iconDrawable),
                contentDescription = "transaction type icon",
            )
            Column(
                modifier = Modifier.weight(.5f).padding(start = 8.dp),
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                item.vendor?.let {
                    Text(
                        text = it,
                        style = MaterialTheme.typography.labelLarge,
                    )
                }
                item.category?.let {
                    Text(
                        text = it,
                        style = MaterialTheme.typography.labelMedium,
                        modifier = Modifier.padding(vertical = 4.dp),
                    )
                }
                item.date?.let {
                    Text(
                        text = it,
                        style = MaterialTheme.typography.labelMedium
                    )
                }
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(.2f),
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                item.amount?.let {
                    Text(
                        text = "$it Kr",
                        style = MaterialTheme.typography.labelLarge,
                        modifier = Modifier.padding(bottom = 8.dp),
                    )
                }
                item.carbonPoints?.let {
                    Text(
                        text = "$it KG CO2",
                        style = MaterialTheme.typography.labelLarge,
                        color = Color.Green
                    )
                }
            }
            Image(
                modifier = Modifier.weight(.1f),
                painter = painterResource(id = R.drawable.ic_right_arrow),
                contentDescription = "transaction type icon",
            )
        }
    }
}

@Preview(showSystemUi = false, showBackground = true)
@Composable
private fun Preview() {
    TransactionItemScreen(
        item = TransactionItem(
            vendor = "ICA",
            category = "Groceries",
            date = "2022-01-01",
            amount = 203.00,
            carbonPoints = 2.44,
            iconConfig = IconConfig(
                iconDrawable = R.drawable.ic_cart_shopping,
                iconBgColor = R.drawable.ic_home2
            )
        )
    )
}