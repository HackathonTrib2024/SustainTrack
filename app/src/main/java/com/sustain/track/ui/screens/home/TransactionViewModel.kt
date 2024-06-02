package com.sustain.track.ui.screens.home

import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import com.jaikeerthick.composable_graphs.composables.pie.model.PieData
import com.jaikeerthick.composable_graphs.composables.pie.style.PieChartStyle
import com.jaikeerthick.composable_graphs.composables.pie.style.PieChartVisibility
import com.sustain.track.R
import com.sustain.track.modal.home.IconConfig
import com.sustain.track.modal.home.TransactionItem


class TransactionViewModel : ViewModel() {


    val transactions = listOf(
        TransactionItem(
            vendor = "ICAA",
            category = "Groceries",
            date = "2022-01-01",
            amount = 203.00,
            carbonPoints = 2.44,
            iconConfig = IconConfig(
                iconDrawable = R.drawable.ic_yellow_circle,
                iconBgColor = R.drawable.ic_home2
            )
        ),
        TransactionItem(
            vendor = "Uberr",
            category = "Fuel",
            date = "2023-01-01",
            amount = 500.00,
            carbonPoints = 5.44,
            iconConfig = IconConfig(
                iconDrawable = R.drawable.ic_blue_circle,
                iconBgColor = R.drawable.ic_home2
            )
        ),
        TransactionItem(
            vendor = "Ikeaa",
            category = "Fashion",
            date = "2022-11-01",
            amount = 103.00,
            carbonPoints = 1.44,
            iconConfig = IconConfig(
                iconDrawable = R.drawable.ic_pink_circle,
                iconBgColor = R.drawable.ic_home2
            )
        ),
        TransactionItem(
            vendor = "ICAA",
            category = "Groceries",
            date = "2022-01-01",
            amount = 203.00,
            carbonPoints = 2.44,
            iconConfig = IconConfig(
                iconDrawable = R.drawable.ic_pink_circle,
                iconBgColor = R.drawable.ic_home2
            )
        ),
        TransactionItem(
            vendor = "SL card",
            category = "Public Transportation",
            date = "2022-01-01",
            amount = 1203.00,
            carbonPoints = 0.44,
            iconConfig = IconConfig(
                iconDrawable = R.drawable.ic_pink_circle,
                iconBgColor = R.drawable.ic_home2
            )
        ),
        TransactionItem(
            vendor = "Uber",
            category = "Fuel",
            date = "2023-01-01",
            amount = 500.00,
            carbonPoints = 5.44,
            iconConfig = IconConfig(
                iconDrawable = R.drawable.ic_blue_circle,
                iconBgColor = R.drawable.ic_home2
            )
        ),
        TransactionItem(
            vendor = "Apotekk",
            category = "Medical",
            date = "2022-11-01",
            amount = 103.00,
            carbonPoints = 1.44,
            iconConfig = IconConfig(
                iconDrawable = R.drawable.ic_pink_circle,
                iconBgColor = R.drawable.ic_home2
            )
        ),
        TransactionItem(
            vendor = "HNMM",
            category = "Fashion",
            date = "2022-11-01",
            amount = 103.00,
            carbonPoints = 1.44,
            iconConfig = IconConfig(
                iconDrawable = R.drawable.ic_pink_circle,
                iconBgColor = R.drawable.ic_home2
            )
        ),
        TransactionItem(
            vendor = "ICAA",
            category = "Groceries",
            date = "2022-01-01",
            amount = 203.00,
            carbonPoints = 2.44,
            iconConfig = IconConfig(
                iconDrawable = R.drawable.ic_pink_circle,
                iconBgColor = R.drawable.ic_home2
            )
        )
    )

    val pieChartData = listOf(
        PieData(value = 130F, label = "Cloths"),
        PieData(value = 260F, label = "Groceries"),
        PieData(value = 500F, label = "Fuel"),
    )

    val pieChartStyle = PieChartStyle(
        visibility = PieChartVisibility(
            isLabelVisible = true,
            isPercentageVisible = true
        ),
        labelSize = 10.sp
    )
}