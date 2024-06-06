package com.sustain.track.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sustain.track.R
import com.sustain.track.ui.notification.NotificationUtils
import com.sustain.track.ui.screens.TransactionItemScreen


@Composable
fun NewTransactionsHome(
    modifier: Modifier = Modifier,
    viewModel: TransactionViewModel = viewModel(),
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color(0XFFFDF6EE))
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
    ) {
        Text(
            text = "My Account",
            fontFamily = FontFamily.Default,
            fontSize = 20.sp,
            color = Color(0xFF512B2B)
        )
        Text(
            text = "1111-1,1 111 111-6",
            modifier = Modifier.padding(bottom = 4.dp, top = 4.dp),
            fontFamily = FontFamily.Default,
            fontSize = 14.sp,
            color = Color(0xFF512B2B)
        )
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Text(
                text = "Current Balance:",
                fontFamily = FontFamily.Default,
                fontSize = 14.sp,
                color = Color(0xFF512B2B)
            )
            Text(
                text = "222 222,23",
                modifier = Modifier.fillMaxWidth(),
                fontFamily = FontFamily.Default,
                fontSize = 14.sp,
                textAlign = TextAlign.End,
                color = Color(0xFF512B2B)
            )
        }
        val context = LocalContext.current
        Button(
            onClick = {
                NotificationUtils.showNotification(
                    context,
                    "750kr paid to Uber", "Your a/c XX0423 is debited for Kr.750 " +
                            "and credited to a/c XX6902(Ref no 4582604274045)." +
                            "Plz call 18002356464 if not done by you."
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            colors = ButtonDefaults
                .buttonColors(containerColor = Color(0xFF64B5F6)),
            contentPadding = ButtonDefaults.TextButtonContentPadding

        ) {
            Text(
                text = "Make Payment",
                textAlign = TextAlign.Center,
                color = Color(0xFFF9FBE7)
            )
        }
//        TextField(
//            value = "Search Transaction",
//            onValueChange = {},
//            trailingIcon = {
//                Image(painter = painterResource(id = R.drawable.ic_search), contentDescription = "")
//            },
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(top = 16.dp)
//        )
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