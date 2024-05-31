package com.sustain.track.modal.home

data class TransactionItem(
    val vendor: String? = null,
    val category: String? = null,
    val amount: Double? = null,
    val date: String? = null,
    val carbonPoints: Double? = null,
    val iconConfig: IconConfig
)

data class IconConfig(
    val iconDrawable: Int,
    val iconBgColor: Int
)