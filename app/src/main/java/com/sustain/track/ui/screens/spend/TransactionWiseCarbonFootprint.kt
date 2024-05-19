package com.sustain.track.ui.screens.spend

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.sustain.track.R
import com.sustain.track.ui.relay.compose.CrossAxisAlignment
import com.sustain.track.ui.relay.compose.MainAxisAlignment
import com.sustain.track.ui.relay.compose.RelayContainer
import com.sustain.track.ui.relay.compose.RelayContainerArrangement
import com.sustain.track.ui.relay.compose.RelayContainerScope
import com.sustain.track.ui.relay.compose.RelayText
import com.sustain.track.ui.relay.compose.RelayVector

/**
 * Spend
 *
 * This composable was generated from the UI Package 'transaction_wise_carbon_footprint'.
 * Generated code; do not edit directly
 */
@Composable
fun TransactionWiseCarbonFootprint(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .background(color = Color.White)
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TopLevel(modifier = modifier) {
            Depth0Frame0 {
                Depth1Frame0 {
                    Depth2Frame0 {
                        Depth3Frame0 {}
                        Depth3Frame1 {
                            Depth4Frame0 {
                                Depth5Frame0(modifier = Modifier.rowWeight(1.0f)) {
                                    CarbonImpact()
                                }
                            }
                        }
                        Depth3Frame2 {
                            Depth4Frame1 {}
                        }
                    }
                }
                Depth1Frame1 {
                    Depth2Frame1(modifier = Modifier.rowWeight(1.0f)) {
                        YouVeReduced12OfYourCarbonFootprintThisMonth()
                    }
                }
                Depth1Frame2 {
                    Depth2Frame2(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 16.0.dp,
                                y = 24.0.dp
                            )
                        )
                    ) {
                        Depth3Frame3 {
                            Depth4Frame2 {
                                Depth5Frame1(modifier = Modifier.rowWeight(1.0f)) {
                                    CarbonFootprint()
                                }
                            }
                            Depth4Frame3 {
                                Depth5Frame2 {
                                    Class12(modifier = Modifier.rowWeight(1.0f))
                                }
                            }
                            Depth4Frame4 {
                                Depth5Frame3 {
                                    Depth6Frame0(modifier = Modifier.rowWeight(1.0f)) {
                                        Last30Days()
                                    }
                                }
                            }
                        }
                        Depth3Frame4 {
                            Depth4Frame5 {
                                Depth5Frame4 {
                                    Depth6Frame1 {
                                        Vector0(
                                            modifier = Modifier.boxAlign(
                                                alignment = Alignment.TopStart,
                                                offset = DpOffset(
                                                    x = 2.2468643188476562.dp,
                                                    y = 0.74896240234375.dp
                                                )
                                            )
                                        )
                                        Vector1(
                                            modifier = Modifier.boxAlign(
                                                alignment = Alignment.TopStart,
                                                offset = DpOffset(
                                                    x = 2.2468643188476562.dp,
                                                    y = 0.0.dp
                                                )
                                            )
                                        )
                                        Vector2()
                                        Depth7Frame0(
                                            modifier = Modifier.boxAlign(
                                                alignment = Alignment.TopStart,
                                                offset = DpOffset(
                                                    x = 97.0.dp,
                                                    y = 612.0.dp
                                                )
                                            )
                                        ) {}
                                        Depth7Frame1(
                                            modifier = Modifier.boxAlign(
                                                alignment = Alignment.TopStart,
                                                offset = DpOffset(
                                                    x = 97.0.dp,
                                                    y = 612.0.dp
                                                )
                                            )
                                        ) {}
                                    }
                                }
                                Depth5Frame5 {
                                    Depth6Frame2 {
                                        Depth7Frame2(modifier = Modifier.rowWeight(1.0f)) {
                                            Class1D()
                                        }
                                    }
                                    Depth6Frame3 {
                                        Depth7Frame3(modifier = Modifier.rowWeight(1.0f)) {
                                            Class1W()
                                        }
                                    }
                                    Depth6Frame4 {
                                        Depth7Frame4(modifier = Modifier.rowWeight(1.0f)) {
                                            Class1M()
                                        }
                                    }
                                    Depth6Frame5 {
                                        Depth7Frame5(modifier = Modifier.rowWeight(1.0f)) {
                                            Class3M()
                                        }
                                    }
                                    Depth6Frame6 {
                                        Depth7Frame6(modifier = Modifier.rowWeight(1.0f)) {
                                            Class1Y()
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                Depth1Frame3 {
                    Depth2Frame3 {
                        Depth3Frame5(modifier = Modifier.rowWeight(1.0f)) {
                            RecentTransactions()
                        }
                    }
                }
                Depth1Frame4 {
                    Depth2Frame4(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 16.0.dp,
                                y = 14.0.dp
                            )
                        )
                    ) {
                        Depth3Frame6 {
                            Depth4Frame6 {
                                Depth5Frame6(modifier = Modifier.rowWeight(1.0f)) {
                                    YourPurchaseAtTraderJoeS()
                                }
                            }
                            Depth4Frame7 {
                                Depth5Frame7(modifier = Modifier.rowWeight(1.0f)) {
                                    Class4500OnMar18()
                                }
                            }
                        }
                    }
                    Depth2Frame5(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 295.0.dp,
                                y = 24.0.dp
                            )
                        )
                    ) {
                        Depth3Frame7 {
                            Class02KgCO2(modifier = Modifier.rowWeight(1.0f))
                        }
                    }
                }
                Depth1Frame5 {
                    Depth2Frame6(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 16.0.dp,
                                y = 14.0.dp
                            )
                        )
                    ) {
                        Depth3Frame8 {
                            Depth4Frame8 {
                                Depth5Frame8(modifier = Modifier.rowWeight(1.0f)) {
                                    YourPurchaseAtAmazon()
                                }
                            }
                            Depth4Frame9 {
                                Depth5Frame9(modifier = Modifier.rowWeight(1.0f)) {
                                    Class50000OnMar18()
                                }
                            }
                        }
                    }
                    Depth2Frame7(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 295.0.dp,
                                y = 24.0.dp
                            )
                        )
                    ) {
                        Depth3Frame9 {
                            Class50KgCO2(modifier = Modifier.rowWeight(1.0f))
                        }
                    }
                }
                Depth1Frame6 {
                    Depth2Frame8(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 16.0.dp,
                                y = 14.0.dp
                            )
                        )
                    ) {
                        Depth3Frame10 {
                            Depth4Frame10 {
                                Depth5Frame10(modifier = Modifier.rowWeight(1.0f)) {
                                    YourPurchaseAtWholeFoods()
                                }
                            }
                            Depth4Frame11 {
                                Depth5Frame11(modifier = Modifier.rowWeight(1.0f)) {
                                    Class6000OnMar17()
                                }
                            }
                        }
                    }
                    Depth2Frame9(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 294.0.dp,
                                y = 24.0.dp
                            )
                        )
                    ) {
                        Depth3Frame11 {
                            Class06KgCO2(modifier = Modifier.rowWeight(1.0f))
                        }
                    }
                }
                Depth1Frame7 {
                    Depth2Frame10(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 16.0.dp,
                                y = 14.0.dp
                            )
                        )
                    ) {
                        Depth3Frame12 {
                            Depth4Frame12 {
                                Depth5Frame12(modifier = Modifier.rowWeight(1.0f)) {
                                    YourPurchaseAtTesla()
                                }
                            }
                            Depth4Frame13 {
                                Depth5Frame13(modifier = Modifier.rowWeight(1.0f)) {
                                    Class8000000OnMar15()
                                }
                            }
                        }
                    }
                    Depth2Frame11(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 289.0.dp,
                                y = 24.0.dp
                            )
                        )
                    ) {
                        Depth3Frame13 {
                            Class800KgCO2(modifier = Modifier.rowWeight(1.0f))
                        }
                    }
                }
                Depth1Frame8 {
                    Depth2Frame12 {
                        Depth3Frame14(modifier = Modifier.rowWeight(1.0f)) {
                            CarbonScore()
                        }
                    }
                }
                Depth1Frame9 {
                    Depth2Frame13(modifier = Modifier.rowWeight(1.0f)) {
                        GoodJobYouReInTheTop20OfUsers()
                    }
                }
                Depth1Frame10 {
                    Depth2Frame14 {
                        Depth3Frame15 {
                            Depth4Frame14(modifier = Modifier.rowWeight(1.0f)) {
                                Overall()
                            }
                        }
                    }
                    Depth2Frame15 {
                        Depth2Frame1Synth {
                            Depth3Frame17 {}
                        }
                        Depth3Frame16 {}
                    }
                    Depth2Frame16 {
                        Depth3Frame18(modifier = Modifier.rowWeight(1.0f)) {
                            YourScore80()
                        }
                    }
                }
                Depth1Frame11 {
                    Depth2Frame17(modifier = Modifier.rowWeight(1.0f)) {
                        TheAverageUserHasAScoreOf50()
                    }
                }
                Depth1Frame12 {}
            }
        }
    }
}

@Preview(widthDp = 390, heightDp = 1219)
@Composable
private fun TransactionWiseCarbonFootprintPreview() {
    MaterialTheme {
        TransactionWiseCarbonFootprint()
    }
}

@Composable
fun Depth3Frame0(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(48.0.dp)
            .requiredHeight(48.0.dp)
    )
}

@Composable
fun CarbonImpact(modifier: Modifier = Modifier) {
    RelayText(
        content = "Carbon Impact",
        fontSize = 18.0.sp,
        fontFamily = manrope,
        color = Color(
            alpha = 255,
            red = 17,
            green = 22,
            blue = 17
        ),
        height = 1.25.em,
        letterSpacing = -0.27000001072883606.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Depth5Frame0(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Depth4Frame0(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        content = content,
        modifier = modifier
            .requiredWidth(125.359375.dp)
            .requiredHeight(22.5.dp)
    )
}

@Composable
fun Depth3Frame1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(262.0.dp)
            .requiredHeight(22.5.dp)
    )
}

@Composable
fun Depth4Frame1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.End,
        arrangement = RelayContainerArrangement.Row,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(48.0.dp)
            .requiredHeight(48.0.dp)
    )
}

@Composable
fun Depth3Frame2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(48.0.dp)
            .requiredHeight(48.0.dp)
    )
}

@Composable
fun Depth2Frame0(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.SpaceBetween,
        arrangement = RelayContainerArrangement.Row,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(358.0.dp)
            .requiredHeight(48.0.dp)
    )
}

@Composable
fun Depth1Frame0(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(
            start = 16.0.dp,
            top = 16.0.dp,
            end = 16.0.dp,
            bottom = 8.0.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(390.0.dp)
            .requiredHeight(72.0.dp)
    )
}

@Composable
fun YouVeReduced12OfYourCarbonFootprintThisMonth(modifier: Modifier = Modifier) {
    RelayText(
        content = "You've reduced 12% of your carbon  footprint this month.",
        fontSize = 22.0.sp,
        fontFamily = manrope,
        color = Color(
            alpha = 255,
            red = 17,
            green = 22,
            blue = 17
        ),
        height = 1.25.em,
        letterSpacing = -0.33000001311302185.sp,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Depth2Frame1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Depth1Frame1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        padding = PaddingValues(
            start = 16.0.dp,
            top = 20.0.dp,
            end = 16.0.dp,
            bottom = 12.0.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(390.0.dp)
            .requiredHeight(87.0.dp)
    )
}

@Composable
fun CarbonFootprint(modifier: Modifier = Modifier) {
    RelayText(
        content = "Carbon Footprint",
        fontSize = 16.0.sp,
        fontFamily = manrope,
        color = Color(
            alpha = 255,
            red = 17,
            green = 22,
            blue = 17
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Depth5Frame1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Depth4Frame2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(358.0.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun Class12(modifier: Modifier = Modifier) {
    RelayText(
        content = "-12%",
        fontSize = 32.0.sp,
        fontFamily = manrope,
        color = Color(
            alpha = 255,
            red = 17,
            green = 22,
            blue = 17
        ),
        height = 1.25.em,
        letterSpacing = -0.800000011920929.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Depth5Frame2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(358.0.dp)
            .requiredHeight(40.0.dp)
    )
}

@Composable
fun Depth4Frame3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        content = content,
        modifier = modifier
            .requiredWidth(358.0.dp)
            .requiredHeight(40.0.dp)
    )
}

@Composable
fun Last30Days(modifier: Modifier = Modifier) {
    RelayText(
        content = "Last 30 Days",
        fontSize = 16.0.sp,
        fontFamily = manrope,
        color = Color(
            alpha = 255,
            red = 99,
            green = 135,
            blue = 99
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun Depth6Frame0(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Depth5Frame3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(92.953125.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth4Frame4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 4.0,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(358.0.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth3Frame3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        itemSpacing = 8.0,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(358.0.dp)
            .requiredHeight(104.0.dp)
    )
}

@Composable
fun Vector0(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.transaction_wise_carbon_footprint_vector_0),
        modifier = modifier
            .requiredWidth(358.0.dp)
            .requiredHeight(148.0.dp)
    )
}

@Composable
fun Vector1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.transaction_wise_carbon_footprint_vector_1),
        modifier = modifier
            .requiredWidth(358.0.dp)
            .requiredHeight(148.0.dp)
    )
}

@Composable
fun Vector2(modifier: Modifier = Modifier) {
    RelayVector(modifier = modifier
        .requiredWidth(358.0.dp)
        .requiredHeight(148.0.dp))
}

@Composable
fun Depth7Frame0(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(0.0.dp)
            .requiredHeight(0.0.dp)
    )
}

@Composable
fun Depth7Frame1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(0.0.dp)
            .requiredHeight(0.0.dp)
    )
}

@Composable
fun Depth6Frame1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier
            .requiredWidth(358.0.dp)
            .requiredHeight(148.0.dp)
    )
}

@Composable
fun Depth5Frame4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 16.0.dp,
            end = 0.0.dp,
            bottom = 16.0.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(358.0.dp)
            .requiredHeight(180.0.dp)
    )
}

@Composable
fun Class1D(modifier: Modifier = Modifier) {
    RelayText(
        content = "1D",
        fontSize = 13.0.sp,
        fontFamily = manrope,
        color = Color(
            alpha = 255,
            red = 99,
            green = 135,
            blue = 99
        ),
        height = 1.5.em,
        letterSpacing = 0.19499999284744263.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Depth7Frame2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Depth6Frame2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(15.203125.dp)
            .requiredHeight(19.5.dp)
    )
}

@Composable
fun Class1W(modifier: Modifier = Modifier) {
    RelayText(
        content = "1W",
        fontSize = 13.0.sp,
        fontFamily = manrope,
        color = Color(
            alpha = 255,
            red = 99,
            green = 135,
            blue = 99
        ),
        height = 1.5.em,
        letterSpacing = 0.19499999284744263.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Depth7Frame3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Depth6Frame3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(18.78125.dp)
            .requiredHeight(19.5.dp)
    )
}

@Composable
fun Class1M(modifier: Modifier = Modifier) {
    RelayText(
        content = "1M",
        fontSize = 13.0.sp,
        fontFamily = manrope,
        color = Color(
            alpha = 255,
            red = 99,
            green = 135,
            blue = 99
        ),
        height = 1.5.em,
        letterSpacing = 0.19499999284744263.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Depth7Frame4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Depth6Frame4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(17.203125.dp)
            .requiredHeight(19.5.dp)
    )
}

@Composable
fun Class3M(modifier: Modifier = Modifier) {
    RelayText(
        content = "3M",
        fontSize = 13.0.sp,
        fontFamily = manrope,
        color = Color(
            alpha = 255,
            red = 99,
            green = 135,
            blue = 99
        ),
        height = 1.5.em,
        letterSpacing = 0.19499999284744263.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Depth7Frame5(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Depth6Frame5(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(19.078125.dp)
            .requiredHeight(19.5.dp)
    )
}

@Composable
fun Class1Y(modifier: Modifier = Modifier) {
    RelayText(
        content = "1Y",
        fontSize = 13.0.sp,
        fontFamily = manrope,
        color = Color(
            alpha = 255,
            red = 99,
            green = 135,
            blue = 99
        ),
        height = 1.5.em,
        letterSpacing = 0.19499999284744263.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Depth7Frame6(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Depth6Frame6(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(14.046875.dp)
            .requiredHeight(19.5.dp)
    )
}

@Composable
fun Depth5Frame5(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.SpaceBetween,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(358.0.dp)
            .requiredHeight(19.5.dp)
    )
}

@Composable
fun Depth4Frame5(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        itemSpacing = 8.0,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(358.0.dp)
            .requiredHeight(207.5.dp)
    )
}

@Composable
fun Depth3Frame4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 16.0.dp,
            end = 0.0.dp,
            bottom = 16.0.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(358.0.dp)
            .requiredHeight(239.5.dp)
    )
}

@Composable
fun Depth2Frame2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        itemSpacing = 8.0,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(358.0.dp)
            .requiredHeight(351.5.dp)
    )
}

@Composable
fun Depth1Frame2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(390.0.dp)
            .requiredHeight(399.5.dp)
    )
}

@Composable
fun RecentTransactions(modifier: Modifier = Modifier) {
    RelayText(
        content = "Recent Transactions",
        fontSize = 22.0.sp,
        fontFamily = manrope,
        color = Color(
            alpha = 255,
            red = 17,
            green = 22,
            blue = 17
        ),
        height = 1.25.em,
        letterSpacing = -0.33000001311302185.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Depth3Frame5(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Depth2Frame3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(213.984375.dp)
            .requiredHeight(27.5.dp)
    )
}

@Composable
fun Depth1Frame3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 16.0.dp,
            top = 20.0.dp,
            end = 16.0.dp,
            bottom = 12.0.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(390.0.dp)
            .requiredHeight(59.5.dp)
    )
}

@Composable
fun YourPurchaseAtTraderJoeS(modifier: Modifier = Modifier) {
    RelayText(
        content = "Your purchase at Trader Joe's",
        fontSize = 16.0.sp,
        fontFamily = manrope,
        color = Color(
            alpha = 255,
            red = 17,
            green = 22,
            blue = 17
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Depth5Frame6(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Depth4Frame6(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        content = content,
        modifier = modifier
            .requiredWidth(218.453125.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun Class4500OnMar18(modifier: Modifier = Modifier) {
    RelayText(
        content = "\$45.00 on Mar 18",
        fontFamily = manrope,
        color = Color(
            alpha = 255,
            red = 99,
            green = 135,
            blue = 99
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun Depth5Frame7(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Depth4Frame7(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        content = content,
        modifier = modifier
            .requiredWidth(218.453125.dp)
            .requiredHeight(21.0.dp)
    )
}

@Composable
fun Depth3Frame6(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(218.453125.dp)
            .requiredHeight(45.0.dp)
    )
}

@Composable
fun Depth2Frame4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 16.0,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(240.75.dp)
            .requiredHeight(45.0.dp)
    )
}

@Composable
fun Class02KgCO2(modifier: Modifier = Modifier) {
    RelayText(
        content = "0.2 kg CO2",
        fontSize = 16.0.sp,
        fontFamily = manrope,
        color = Color(
            alpha = 255,
            red = 17,
            green = 22,
            blue = 17
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Depth3Frame7(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(78.9375.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth2Frame5(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(78.9375.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth1Frame4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(390.0.dp)
            .requiredHeight(72.0.dp)
    )
}

@Composable
fun YourPurchaseAtAmazon(modifier: Modifier = Modifier) {
    RelayText(
        content = "Your purchase at Amazon",
        fontSize = 16.0.sp,
        fontFamily = manrope,
        color = Color(
            alpha = 255,
            red = 17,
            green = 22,
            blue = 17
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Depth5Frame8(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Depth4Frame8(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        content = content,
        modifier = modifier
            .requiredWidth(189.4375.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun Class50000OnMar18(modifier: Modifier = Modifier) {
    RelayText(
        content = "\$500.00 on Mar 18",
        fontFamily = manrope,
        color = Color(
            alpha = 255,
            red = 99,
            green = 135,
            blue = 99
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun Depth5Frame9(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Depth4Frame9(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        content = content,
        modifier = modifier
            .requiredWidth(189.4375.dp)
            .requiredHeight(21.0.dp)
    )
}

@Composable
fun Depth3Frame8(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(189.4375.dp)
            .requiredHeight(45.0.dp)
    )
}

@Composable
fun Depth2Frame6(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 16.0,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(226.1875.dp)
            .requiredHeight(45.0.dp)
    )
}

@Composable
fun Class50KgCO2(modifier: Modifier = Modifier) {
    RelayText(
        content = "5.0 kg CO2",
        fontSize = 16.0.sp,
        fontFamily = manrope,
        color = Color(
            alpha = 255,
            red = 17,
            green = 22,
            blue = 17
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Depth3Frame9(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(79.0625.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth2Frame7(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(79.0625.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth1Frame5(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(390.0.dp)
            .requiredHeight(72.0.dp)
    )
}

@Composable
fun YourPurchaseAtWholeFoods(modifier: Modifier = Modifier) {
    RelayText(
        content = "Your purchase at Whole Foods",
        fontSize = 16.0.sp,
        fontFamily = manrope,
        color = Color(
            alpha = 255,
            red = 17,
            green = 22,
            blue = 17
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Depth5Frame10(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Depth4Frame10(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        content = content,
        modifier = modifier
            .requiredWidth(225.46875.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun Class6000OnMar17(modifier: Modifier = Modifier) {
    RelayText(
        content = "\$60.00 on Mar 17",
        fontFamily = manrope,
        color = Color(
            alpha = 255,
            red = 99,
            green = 135,
            blue = 99
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun Depth5Frame11(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Depth4Frame11(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        content = content,
        modifier = modifier
            .requiredWidth(225.46875.dp)
            .requiredHeight(21.0.dp)
    )
}

@Composable
fun Depth3Frame10(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(225.46875.dp)
            .requiredHeight(45.0.dp)
    )
}

@Composable
fun Depth2Frame8(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 16.0,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(243.859375.dp)
            .requiredHeight(45.0.dp)
    )
}

@Composable
fun Class06KgCO2(modifier: Modifier = Modifier) {
    RelayText(
        content = "0.6 kg CO2",
        fontSize = 16.0.sp,
        fontFamily = manrope,
        color = Color(
            alpha = 255,
            red = 17,
            green = 22,
            blue = 17
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Depth3Frame11(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(79.75.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth2Frame9(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(79.75.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth1Frame6(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(390.0.dp)
            .requiredHeight(72.0.dp)
    )
}

@Composable
fun YourPurchaseAtTesla(modifier: Modifier = Modifier) {
    RelayText(
        content = "Your purchase at Tesla",
        fontSize = 16.0.sp,
        fontFamily = manrope,
        color = Color(
            alpha = 255,
            red = 17,
            green = 22,
            blue = 17
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Depth5Frame12(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Depth4Frame12(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        content = content,
        modifier = modifier
            .requiredWidth(168.375.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun Class8000000OnMar15(modifier: Modifier = Modifier) {
    RelayText(
        content = "\$80,000.00 on Mar 15",
        fontFamily = manrope,
        color = Color(
            alpha = 255,
            red = 99,
            green = 135,
            blue = 99
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun Depth5Frame13(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Depth4Frame13(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        content = content,
        modifier = modifier
            .requiredWidth(168.375.dp)
            .requiredHeight(21.0.dp)
    )
}

@Composable
fun Depth3Frame12(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(168.375.dp)
            .requiredHeight(45.0.dp)
    )
}

@Composable
fun Depth2Frame10(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 16.0,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(212.78125.dp)
            .requiredHeight(45.0.dp)
    )
}

@Composable
fun Class800KgCO2(modifier: Modifier = Modifier) {
    RelayText(
        content = "800 kg CO2",
        fontSize = 16.0.sp,
        fontFamily = manrope,
        color = Color(
            alpha = 255,
            red = 17,
            green = 22,
            blue = 17
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Depth3Frame13(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(84.8125.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth2Frame11(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(84.8125.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth1Frame7(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(390.0.dp)
            .requiredHeight(72.0.dp)
    )
}

@Composable
fun CarbonScore(modifier: Modifier = Modifier) {
    RelayText(
        content = "Carbon Score",
        fontSize = 22.0.sp,
        fontFamily = manrope,
        color = Color(
            alpha = 255,
            red = 17,
            green = 22,
            blue = 17
        ),
        height = 1.25.em,
        letterSpacing = -0.33000001311302185.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Depth3Frame14(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Depth2Frame12(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(141.34375.dp)
            .requiredHeight(27.5.dp)
    )
}

@Composable
fun Depth1Frame8(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 16.0.dp,
            top = 20.0.dp,
            end = 16.0.dp,
            bottom = 12.0.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(390.0.dp)
            .requiredHeight(59.5.dp)
    )
}

@Composable
fun GoodJobYouReInTheTop20OfUsers(modifier: Modifier = Modifier) {
    RelayText(
        content = "Good job! You're in the top 20% of users.",
        fontSize = 22.0.sp,
        fontFamily = manrope,
        color = Color(
            alpha = 255,
            red = 17,
            green = 22,
            blue = 17
        ),
        height = 1.25.em,
        letterSpacing = -0.33000001311302185.sp,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Depth2Frame13(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Depth1Frame9(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        padding = PaddingValues(
            start = 16.0.dp,
            top = 20.0.dp,
            end = 16.0.dp,
            bottom = 12.0.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(390.0.dp)
            .requiredHeight(87.0.dp)
    )
}

@Composable
fun Overall(modifier: Modifier = Modifier) {
    RelayText(
        content = "Overall",
        fontSize = 16.0.sp,
        fontFamily = manrope,
        color = Color(
            alpha = 255,
            red = 17,
            green = 22,
            blue = 17
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Depth4Frame14(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Depth3Frame15(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(51.90625.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth2Frame14(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.SpaceBetween,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(358.0.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth3Frame17(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 219,
            green = 229,
            blue = 219
        ),
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        radius = 4.0,
        content = content,
        modifier = modifier
            .requiredWidth(358.0.dp)
            .requiredHeight(8.0.dp)
    )
}

@Composable
fun Depth2Frame1Synth(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.End,
        arrangement = RelayContainerArrangement.Row,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(358.0.dp)
            .requiredHeight(8.0.dp)
            .alpha(alpha = 100.0f)
    )
}

@Composable
fun Depth3Frame16(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 17,
            green = 22,
            blue = 17
        ),
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        radius = 4.0,
        content = content,
        modifier = modifier
            .requiredWidth(286.390625.dp)
            .requiredHeight(8.0.dp)
    )
}

@Composable
fun Depth2Frame15(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(358.0.dp)
            .requiredHeight(8.0.dp)
    )
}

@Composable
fun YourScore80(modifier: Modifier = Modifier) {
    RelayText(
        content = "Your score: 80",
        fontFamily = manrope,
        color = Color(
            alpha = 255,
            red = 99,
            green = 135,
            blue = 99
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun Depth3Frame18(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Depth2Frame16(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(91.140625.dp)
            .requiredHeight(21.0.dp)
    )
}

@Composable
fun Depth1Frame10(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(all = 16.0.dp),
        itemSpacing = 12.0,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(390.0.dp)
            .requiredHeight(109.0.dp)
    )
}

@Composable
fun TheAverageUserHasAScoreOf50(modifier: Modifier = Modifier) {
    RelayText(
        content = "The average user has a score of 50.",
        fontFamily = manrope,
        color = Color(
            alpha = 255,
            red = 99,
            green = 135,
            blue = 99
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun Depth2Frame17(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Depth1Frame11(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(
            start = 16.0.dp,
            top = 4.0.dp,
            end = 16.0.dp,
            bottom = 12.0.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(390.0.dp)
            .requiredHeight(37.0.dp)
    )
}

@Composable
fun Depth1Frame12(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 0.0.dp,
            end = 0.0.dp,
            bottom = 20.0.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(390.0.dp)
            .requiredHeight(20.0.dp)
    )
}

@Composable
fun Depth0Frame0(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        content = content,
        modifier = modifier
            .requiredWidth(390.0.dp)
            .requiredHeight(1218.5.dp)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.width(IntrinsicSize.Min)
    )
}
