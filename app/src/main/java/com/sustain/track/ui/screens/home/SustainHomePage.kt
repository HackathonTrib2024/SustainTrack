package com.sustain.track.ui.screens.home

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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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
import com.sustain.track.ui.relay.compose.RelayImage
import com.sustain.track.ui.relay.compose.RelayText
import com.sustain.track.ui.relay.compose.RelayVector

/**
 * Home
 *
 */
@Composable
fun SustainHomeScreen() {
    Column(
        modifier = Modifier
            .background(color = Color.White)
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TopLevel {
            Depth0Frame0 {
//                Depth1Frame0 {
//                    Depth2Frame0 {
//                        Depth3Frame0 {}
//                        Depth3Frame1 {
//                            Depth4Frame0 {
//                                Depth5Frame0 {
//                                    Depth6Frame0 {
//                                        Depth7Frame0 {
//                                            Vector0(
//                                                modifier = Modifier.boxAlign(
//                                                    alignment = Alignment.TopStart,
//                                                    offset = DpOffset(
//                                                        x = 2.229278564453125.dp,
//                                                        y = 2.229248046875.dp
//                                                    )
//                                                )
//                                            )
//                                            Depth8Frame0(
//                                                modifier = Modifier.boxAlign(
//                                                    alignment = Alignment.TopStart,
//                                                    offset = DpOffset(
//                                                        x = 457.0.dp,
//                                                        y = 911.0.dp
//                                                    )
//                                                )
//                                            ) {}
//                                        }
//                                    }
//                                }
//                            }
//                        }
//                    }
//                }
                Depth1Frame1 {
                    Depth2Frame1 {
                        Depth3Frame2 {
                            Depth4Frame1 {
                                Depth5Frame1()
                            }
                            Depth4Frame2 {
                                Depth5Frame2 {
                                    Depth6Frame1(modifier = Modifier.rowWeight(1.0f)) {
                                        LilySCarbonFootprint()
                                    }
                                }
                                Depth5Frame3 {
                                    Depth6Frame2(modifier = Modifier.rowWeight(1.0f)) {
                                        Class79LowerThanLastMonth()
                                    }
                                }
                            }
                        }
                        Depth3Frame3 {
                            Depth4Frame3 {
                                Depth5Frame4 {
                                    Depth6Frame3 {
                                        Depth7Frame1(modifier = Modifier.rowWeight(1.0f)) {
                                            View()
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                Depth1Frame2 {
                    Depth2Frame2 {
                        Depth3Frame4(modifier = Modifier.rowWeight(1.0f)) {
                            YourImpact()
                        }
                    }
                }
                Depth1Frame3 {
                    Depth2Frame3(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 16.0.dp,
                                y = 24.0.dp
                            )
                        )
                    ) {
                        Depth3Frame5 {
                            Depth4Frame4 {
                                Depth5Frame5(modifier = Modifier.rowWeight(1.0f)) {
                                    CarbonEmissions()
                                }
                            }
                            Depth4Frame5 {
                                Depth5Frame6 {
                                    Class25(modifier = Modifier.rowWeight(1.0f))
                                }
                            }
                            Depth4Frame6 {
                                Depth5Frame7 {
                                    Depth6Frame4(modifier = Modifier.rowWeight(1.0f)) {
                                        Last30Days()
                                    }
                                }
                                Depth5Frame8 {
                                    Depth6Frame5(modifier = Modifier.rowWeight(1.0f)) {
                                        Class251()
                                    }
                                }
                            }
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
                            Depth4Frame7(modifier = Modifier.rowWeight(1.0f)) {
                                YouReDoingGreat()
                            }
                        }
                        Depth3Frame7 {
                            Depth4Frame8 {
                                Depth5Frame9 {
                                    Depth6Frame6 {
                                        Depth7Frame2 {
                                            Vector1(
                                                modifier = Modifier.boxAlign(
                                                    alignment = Alignment.TopStart,
                                                    offset = DpOffset(
                                                        x = 2.25.dp,
                                                        y = 2.25.dp
                                                    )
                                                )
                                            )
                                            Depth8Frame1(
                                                modifier = Modifier.boxAlign(
                                                    alignment = Alignment.TopStart,
                                                    offset = DpOffset(
                                                        x = 459.0.dp,
                                                        y = 356.0.dp
                                                    )
                                                )
                                            ) {}
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                Depth1Frame5 {
                    Depth2Frame5 {
                        Depth3Frame8(modifier = Modifier.rowWeight(1.0f)) {
                            WhatYouCanDo()
                        }
                    }
                }
                Depth1Frame6 {
                    Depth2Frame6(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 16.0.dp,
                                y = 8.0.dp
                            )
                        )
                    ) {
                        Depth3Frame9 {
                            Depth4Frame9 {
                                Depth5Frame10(modifier = Modifier.rowWeight(1.0f)) {
                                    Earn4xPointsOnSustainablePurchases()
                                }
                            }
                            Depth4Frame10 {
                                Depth5Frame11(modifier = Modifier.rowWeight(1.0f)) {
                                    GetUpTo4xPointsWhenYouShopAtBusinessesWithHighEcoScores()
                                }
                            }
                        }
                    }
                    Depth2Frame7(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 346.0.dp,
                                y = 27.0.dp
                            )
                        )
                    ) {
                        Depth3Frame10 {
                            Depth4Frame11 {
                                Depth5Frame12 {
                                    Vector2(
                                        modifier = Modifier.boxAlign(
                                            alignment = Alignment.TopStart,
                                            offset = DpOffset(
                                                x = 3.0.dp,
                                                y = 4.4995880126953125.dp
                                            )
                                        )
                                    )
                                    Depth6Frame7(
                                        modifier = Modifier.boxAlign(
                                            alignment = Alignment.TopStart,
                                            offset = DpOffset(
                                                x = 459.0.dp,
                                                y = 227.5.dp
                                            )
                                        )
                                    ) {}
                                }
                            }
                        }
                    }
                }
                Depth1Frame7 {
                    Depth2Frame8(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 16.0.dp,
                                y = 8.0.dp
                            )
                        )
                    ) {
                        Depth3Frame11 {
                            Depth4Frame12 {
                                Depth5Frame13(modifier = Modifier.rowWeight(1.0f)) {
                                    PlantATreeWithEveryPurchase()
                                }
                            }
                            Depth4Frame13 {
                                Depth5Frame14(modifier = Modifier.rowWeight(1.0f)) {
                                    WeLlPlantATreeForEvery10YouSpendUsingYourCreditCard()
                                }
                            }
                        }
                    }
                    Depth2Frame9(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 346.0.dp,
                                y = 27.0.dp
                            )
                        )
                    ) {
                        Depth3Frame12 {
                            Depth4Frame14 {
                                Depth5Frame15 {
                                    Vector3(
                                        modifier = Modifier.boxAlign(
                                            alignment = Alignment.TopStart,
                                            offset = DpOffset(
                                                x = 3.0.dp,
                                                y = 4.4995880126953125.dp
                                            )
                                        )
                                    )
                                    Depth6Frame8(
                                        modifier = Modifier.boxAlign(
                                            alignment = Alignment.TopStart,
                                            offset = DpOffset(
                                                x = 459.0.dp,
                                                y = 145.5.dp
                                            )
                                        )
                                    ) {}
                                }
                            }
                        }
                    }
                }
//                Depth1Frame10 {}
            }
        }
    }
}

@Preview()
@Composable
private fun SustainHomePagePreview() {
    MaterialTheme {
        SustainHomeScreen()
    }
}

@Composable
fun Depth3Frame0(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(48.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun Vector0(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.sustain_home_page_vector_0),
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth8Frame0(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(0.0.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Depth7Frame0(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth6Frame0(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth5Frame0(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.End,
        arrangement = RelayContainerArrangement.Row,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(48.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun Depth4Frame0(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(48.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun Depth3Frame1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.SpaceBetween,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 262.0.dp,
            top = 0.0.dp,
            end = 0.0.dp,
            bottom = 0.0.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(310.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun Depth2Frame0(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.SpaceBetween,
        arrangement = RelayContainerArrangement.Row,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(358.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun Depth1Frame0(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 239,
            green = 244,
            blue = 239
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
        modifier = modifier.fillMaxWidth().requiredHeight(72.0.dp)
    )
}

@Composable
fun Depth5Frame1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.sustain_home_page_depth_5_frame_0),
        radius = 64.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(128.0.dp).requiredHeight(128.0.dp)
    )
}

@Composable
fun Depth4Frame1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(128.0.dp).requiredHeight(128.0.dp)
    )
}

@Composable
fun LilySCarbonFootprint(modifier: Modifier = Modifier) {
    RelayText(
        content = "Lily's carbon footprint",
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
fun Depth6Frame1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Depth5Frame2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(224.890625.dp).requiredHeight(27.5.dp)
    )
}

@Composable
fun Class79LowerThanLastMonth(modifier: Modifier = Modifier) {
    RelayText(
        content = "7.9% lower than last month",
        fontSize = 16.0.sp,
        fontFamily = manrope,
        color = Color(
            alpha = 255,
            red = 99,
            green = 135,
            blue = 99
        ),
        height = 1.5.em,
        modifier = modifier
    )
}

@Composable
fun Depth6Frame2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Depth5Frame3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(198.484375.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth4Frame2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(224.890625.dp).requiredHeight(51.5.dp)
    )
}

@Composable
fun Depth3Frame2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        itemSpacing = 16.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(224.890625.dp).requiredHeight(195.5.dp)
    )
}

@Composable
fun View(modifier: Modifier = Modifier) {
    RelayText(
        content = "View",
        fontFamily = manrope,
        color = Color(
            alpha = 255,
            red = 17,
            green = 22,
            blue = 17
        ),
        height = 1.5.em,
        letterSpacing = 0.20999999344348907.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Depth7Frame1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
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
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 239,
            green = 244,
            blue = 239
        ),
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        content = content,
        modifier = modifier.requiredWidth(32.859375.dp).requiredHeight(21.0.dp)
    )
}

@Composable
fun Depth5Frame4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 239,
            green = 244,
            blue = 239
        ),
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 16.0.dp,
            top = 0.0.dp,
            end = 16.0.dp,
            bottom = 0.0.dp
        ),
        radius = 12.0,
        content = content,
        modifier = modifier.requiredWidth(358.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun Depth4Frame3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(358.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun Depth3Frame3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 12.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(358.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun Depth2Frame1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        itemSpacing = 16.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(358.0.dp).requiredHeight(251.5.dp)
    )
}

@Composable
fun Depth1Frame1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 16.0.dp),
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(390.0.dp).requiredHeight(283.5.dp)
    )
}

@Composable
fun YourImpact(modifier: Modifier = Modifier) {
    RelayText(
        content = "Your impact",
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
fun Depth3Frame4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
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
fun Depth2Frame2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(123.046875.dp).requiredHeight(27.5.dp)
    )
}

@Composable
fun Depth1Frame2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
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
        modifier = modifier.requiredWidth(390.0.dp).requiredHeight(59.5.dp)
    )
}

@Composable
fun CarbonEmissions(modifier: Modifier = Modifier) {
    RelayText(
        content = "Carbon emissions",
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
fun Depth5Frame5(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
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
fun Depth4Frame4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(358.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Class25(modifier: Modifier = Modifier) {
    RelayText(
        content = "-2.5%",
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
fun Depth5Frame6(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(358.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun Depth4Frame5(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        content = content,
        modifier = modifier.requiredWidth(358.0.dp).requiredHeight(40.0.dp)
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
fun Depth6Frame4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
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
fun Depth5Frame7(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(92.953125.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Class251(modifier: Modifier = Modifier) {
    RelayText(
        content = "-2.5%",
        fontSize = 16.0.sp,
        fontFamily = manrope,
        color = Color(
            alpha = 255,
            red = 232,
            green = 33,
            blue = 7
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Depth6Frame5(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
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
fun Depth5Frame8(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(44.046875.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth4Frame6(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 4.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(358.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth3Frame5(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        itemSpacing = 8.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(358.0.dp).requiredHeight(104.0.dp)
    )
}

@Composable
fun Depth2Frame3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        itemSpacing = 8.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(358.0.dp).requiredHeight(104.0.dp)
    )
}

@Composable
fun Depth1Frame3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(390.0.dp).requiredHeight(152.0.dp)
    )
}

@Composable
fun YouReDoingGreat(modifier: Modifier = Modifier) {
    RelayText(
        content = "You're doing great!",
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
        modifier = modifier
    )
}

@Composable
fun Depth4Frame7(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
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
fun Depth3Frame6(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        content = content,
        modifier = modifier.requiredWidth(314.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Vector1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.sustain_home_page_vector_1),
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth8Frame1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(0.0.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Depth7Frame2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth6Frame6(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth5Frame9(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(28.0.dp).requiredHeight(28.0.dp)
    )
}

@Composable
fun Depth4Frame8(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(28.0.dp).requiredHeight(28.0.dp)
    )
}

@Composable
fun Depth3Frame7(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.End,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(28.0.dp).requiredHeight(28.0.dp)
    )
}

@Composable
fun Depth2Frame4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 16.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(358.0.dp).requiredHeight(28.0.dp)
    )
}

@Composable
fun Depth1Frame4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
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
        modifier = modifier.requiredWidth(390.0.dp).requiredHeight(56.0.dp)
    )
}

@Composable
fun WhatYouCanDo(modifier: Modifier = Modifier) {
    RelayText(
        content = "What you can do",
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
fun Depth3Frame8(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
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
fun Depth2Frame5(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(171.09375.dp).requiredHeight(27.5.dp)
    )
}

@Composable
fun Depth1Frame5(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
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
        modifier = modifier.requiredWidth(390.0.dp).requiredHeight(59.5.dp)
    )
}

@Composable
fun Earn4xPointsOnSustainablePurchases(modifier: Modifier = Modifier) {
    RelayText(
        content = "Earn 4x points on sustainable purchases",
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
    content: @Composable RelayContainerScope.() -> Unit
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
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        content = content,
        modifier = modifier.requiredWidth(314.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun GetUpTo4xPointsWhenYouShopAtBusinessesWithHighEcoScores(modifier: Modifier = Modifier) {
    RelayText(
        content = "Get up to 4x points when you shop at businesses with high eco-scores.",
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
    content: @Composable RelayContainerScope.() -> Unit
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
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        content = content,
        modifier = modifier.requiredWidth(314.0.dp).requiredHeight(42.0.dp)
    )
}

@Composable
fun Depth3Frame9(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(314.0.dp).requiredHeight(66.0.dp)
    )
}

@Composable
fun Depth2Frame6(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 16.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(314.0.dp).requiredHeight(66.0.dp)
    )
}

@Composable
fun Vector2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.sustain_home_page_vector_2),
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth6Frame7(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(0.0.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Depth5Frame12(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth4Frame11(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth3Frame10(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(28.0.dp).requiredHeight(28.0.dp)
    )
}

@Composable
fun Depth2Frame7(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(28.0.dp).requiredHeight(28.0.dp)
    )
}

@Composable
fun Depth1Frame6(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
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
        modifier = modifier.requiredWidth(390.0.dp).requiredHeight(82.0.dp)
    )
}

@Composable
fun PlantATreeWithEveryPurchase(modifier: Modifier = Modifier) {
    RelayText(
        content = "Plant a tree with every purchase",
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
fun Depth5Frame13(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
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
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        content = content,
        modifier = modifier.requiredWidth(314.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun WeLlPlantATreeForEvery10YouSpendUsingYourCreditCard(modifier: Modifier = Modifier) {
    RelayText(
        content = "We'll plant a tree for every \$10 you spend using your credit card.",
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
fun Depth5Frame14(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
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
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        content = content,
        modifier = modifier.requiredWidth(314.0.dp).requiredHeight(42.0.dp)
    )
}

@Composable
fun Depth3Frame11(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(314.0.dp).requiredHeight(66.0.dp)
    )
}

@Composable
fun Depth2Frame8(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 16.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(314.0.dp).requiredHeight(66.0.dp)
    )
}

@Composable
fun Vector3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.sustain_home_page_vector_3),
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth6Frame8(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(0.0.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Depth5Frame15(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth4Frame14(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth3Frame12(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(28.0.dp).requiredHeight(28.0.dp)
    )
}

@Composable
fun Depth2Frame9(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(28.0.dp).requiredHeight(28.0.dp)
    )
}

@Composable
fun Depth1Frame7(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
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
        modifier = modifier.requiredWidth(390.0.dp).requiredHeight(82.0.dp)
    )
}

@Composable
fun Vector4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.sustain_home_page_vector_4),
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth7Frame3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(0.0.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Depth6Frame9(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth5Frame16(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth4Frame15(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        clipToParent = false,
        radius = 16.0,
        content = content,
        modifier = modifier.requiredWidth(48.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Home(modifier: Modifier = Modifier) {
    RelayText(
        content = "Home",
        fontSize = 12.0.sp,
        fontFamily = manrope,
        color = Color(
            alpha = 255,
            red = 17,
            green = 22,
            blue = 17
        ),
        height = 1.5.em,
        letterSpacing = 0.18000000715255737.sp,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Depth5Frame17(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Depth4Frame16(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(33.734375.dp).requiredHeight(18.0.dp)
    )
}

@Composable
fun Depth3Frame13(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        itemSpacing = 4.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(65.203125.dp).requiredHeight(54.0.dp)
    )
}

@Composable
fun Vector5(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.sustain_home_page_vector_5),
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth7Frame4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(0.0.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Depth6Frame10(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth5Frame18(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth4Frame17(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 4.0.dp,
            end = 0.0.dp,
            bottom = 4.0.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Spending(modifier: Modifier = Modifier) {
    RelayText(
        content = "Spending",
        fontSize = 12.0.sp,
        fontFamily = manrope,
        color = Color(
            alpha = 255,
            red = 99,
            green = 135,
            blue = 99
        ),
        height = 1.5.em,
        letterSpacing = 0.18000000715255737.sp,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Depth5Frame19(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Depth4Frame18(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(55.0.dp).requiredHeight(18.0.dp)
    )
}

@Composable
fun Depth3Frame14(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        itemSpacing = 4.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(65.203125.dp).requiredHeight(54.0.dp)
    )
}

@Composable
fun Vector6(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.sustain_home_page_vector_6),
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth7Frame5(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(0.0.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Depth6Frame11(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth5Frame20(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth4Frame19(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 4.0.dp,
            end = 0.0.dp,
            bottom = 4.0.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Investing(modifier: Modifier = Modifier) {
    RelayText(
        content = "Investing",
        fontSize = 12.0.sp,
        fontFamily = manrope,
        color = Color(
            alpha = 255,
            red = 99,
            green = 135,
            blue = 99
        ),
        height = 1.5.em,
        letterSpacing = 0.18000000715255737.sp,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Depth5Frame21(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Depth4Frame20(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(53.78125.dp).requiredHeight(18.0.dp)
    )
}

@Composable
fun Depth3Frame15(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        itemSpacing = 4.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(65.203125.dp).requiredHeight(54.0.dp)
    )
}

@Composable
fun Vector7(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.sustain_home_page_vector_7),
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth7Frame6(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(0.0.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Depth6Frame12(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth5Frame22(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth4Frame21(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 4.0.dp,
            end = 0.0.dp,
            bottom = 4.0.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Credit(modifier: Modifier = Modifier) {
    RelayText(
        content = "Credit",
        fontSize = 12.0.sp,
        fontFamily = manrope,
        color = Color(
            alpha = 255,
            red = 99,
            green = 135,
            blue = 99
        ),
        height = 1.5.em,
        letterSpacing = 0.18000000715255737.sp,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Depth5Frame23(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Depth4Frame22(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(36.375.dp).requiredHeight(18.0.dp)
    )
}

@Composable
fun Depth3Frame16(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        itemSpacing = 4.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(65.203125.dp).requiredHeight(54.0.dp)
    )
}

@Composable
fun Vector8(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.sustain_home_page_vector_8),
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth7Frame7(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(0.0.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Depth6Frame13(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth5Frame24(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth4Frame23(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 4.0.dp,
            end = 0.0.dp,
            bottom = 4.0.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Profile(modifier: Modifier = Modifier) {
    RelayText(
        content = "Profile",
        fontSize = 12.0.sp,
        fontFamily = manrope,
        color = Color(
            alpha = 255,
            red = 99,
            green = 135,
            blue = 99
        ),
        height = 1.5.em,
        letterSpacing = 0.18000000715255737.sp,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Depth5Frame25(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Depth4Frame24(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(37.859375.dp).requiredHeight(18.0.dp)
    )
}

@Composable
fun Depth3Frame17(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        itemSpacing = 4.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(65.203125.dp).requiredHeight(54.0.dp)
    )
}

@Composable
fun Depth2Frame10(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 8.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(358.0.dp).requiredHeight(54.0.dp)
    )
}

@Composable
fun Depth1Frame9(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
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
            top = 8.0.dp,
            end = 16.0.dp,
            bottom = 12.0.dp
        ),
        clipToParent = false,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 239,
            green = 244,
            blue = 239
        ),
        content = content,
        modifier = modifier.requiredWidth(390.0.dp).requiredHeight(75.0.dp)
    )
}

@Composable
fun Depth1Frame10(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
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
        modifier = modifier.requiredWidth(390.0.dp).requiredHeight(20.0.dp)
    )
}

@Composable
fun Depth0Frame0(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
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
        modifier = modifier.requiredWidth(390.0.dp)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
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


