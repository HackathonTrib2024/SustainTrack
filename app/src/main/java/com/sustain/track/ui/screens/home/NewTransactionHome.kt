package com.sustain.track.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sustain.track.R
import com.sustain.track.ui.screens.TransactionItemScreen


@Composable
fun NewTransactionsHome(
    modifier: Modifier = Modifier,
    viewModel: TransactionViewModel = viewModel()
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color(0XFFFDF6EE))
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
    ) {
        TextField(
            value = "Search Transaction",
            onValueChange = {},
            trailingIcon = {
                Image(painter = painterResource(id = R.drawable.ic_search), contentDescription = "")
            },
            modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp)
        )

        Text(
            text = "Privatkonto",
            fontFamily = FontFamily.Default,
            fontSize = 20.sp,
            color = Color(0xFF512B2B)
        )
        Text(
            text = "8417-8,4 724 675-6",
            modifier = Modifier.padding(bottom = 4.dp, top = 4.dp),
            fontFamily = FontFamily.Default,
            fontSize = 14.sp,
            color = Color(0xFF512B2B)
        )
        Text(
            text = "Available amount",
            fontFamily = FontFamily.Default,
            fontSize = 14.sp,
            color = Color(0xFF512B2B)
        )
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            colors = ButtonDefaults
                .buttonColors(containerColor = Color(0xFFDBF8ED)),
            contentPadding = ButtonDefaults.TextButtonContentPadding

        ) {
            Text(
                text = "Pay or transfer from account",
                textAlign = TextAlign.Center,
                color = Color(0xFF257886)
            )
        }
        Text(
            text = "Transactions",
            fontFamily = FontFamily.Default,
            fontSize = 16.sp,
            color = Color(0xFFFB4F00),
            modifier = Modifier.padding(top = 16.dp)
        )
        LazyColumn {
            items(viewModel.transactions) { item ->
                TransactionItemScreen(item = item)
            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun Preview() {
    NewTransactionsHome()
}