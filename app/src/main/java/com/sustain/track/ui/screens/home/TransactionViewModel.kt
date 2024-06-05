package com.sustain.track.ui.screens.home

import androidx.compose.ui.graphics.Color
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
                iconDrawable = R.drawable.ic_cart_shopping,
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
                iconDrawable = R.drawable.ic_taxi,
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
                iconDrawable = R.drawable.ic_shirt,
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
                iconDrawable = R.drawable.ic_cart_shopping,
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
                iconDrawable = R.drawable.ic_bus,
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
                iconDrawable = R.drawable.ic_taxi,
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
                iconDrawable = R.drawable.ic_medical,
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
                iconDrawable = R.drawable.ic_shirt,
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
                iconDrawable = R.drawable.ic_cart_shopping,
                iconBgColor = R.drawable.ic_home2
            )
        )
    )

    val pieChartData = listOf(
        PieData(value = 130F, label = "Cloths", color = Color(0xFF084D85)),
        PieData(value = 260F, label = "Groceries", color = Color(0xFF118AEB)),
        PieData(value = 500F, label = "Fuel", color = Color(0xFF64B5F6)),
    )

    val pieChartStyle = PieChartStyle(
        visibility = PieChartVisibility(
            isLabelVisible = true,
            isPercentageVisible = true
        ),
        labelSize = 10.sp
    )
}