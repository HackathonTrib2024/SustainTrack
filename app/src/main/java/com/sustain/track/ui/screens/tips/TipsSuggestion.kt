package com.sustain.track.ui.screens.tips

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
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
 * SustainTips
 *
 * This composable was generated from the UI Package 'tips_suggestion'.
 * Generated code; do not edit directly
 */
@Composable
fun TipsSuggestion(modifier: Modifier = Modifier) {
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
                                    GreenTips()
                                }
                            }
                        }
                        Depth3Frame2 {
                            Depth4Frame1 {}
                        }
                    }
                }
                Depth1Frame1 {
                    Depth2Frame1 {
                        Depth3Frame3 {
                            Depth4Frame2()
                            Depth3Frame0Synth {}
                        }
                    }
                }
                Depth1Frame2 {
                    Depth2Frame2(modifier = Modifier.rowWeight(1.0f)) {
                        ReduceYourCarbonFootprint()
                    }
                }
                Depth1Frame3 {
                    Depth2Frame3(modifier = Modifier.rowWeight(1.0f)) {
                        DidYouKnowThatA5MinuteShowerUses1025GallonsOfWaterTryTakingShorterShowersToSaveWaterAndReduceYourCarbonFootprint()
                    }
                }
                Depth1Frame4 {
                    Depth2Frame4(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 16.0.dp,
                                y = 8.0.dp
                            )
                        )
                    ) {
                        Depth3Frame4 {
                            Depth4Frame3 {
                                Depth5Frame1(modifier = Modifier.rowWeight(1.0f)) {
                                    DailyChallenges()
                                }
                            }
                            Depth4Frame4 {
                                Depth5Frame2(modifier = Modifier.rowWeight(1.0f)) {
                                    TakeShorterShowersUsePublicTransportationOrBuyLocalProduce()
                                }
                            }
                        }
                    }
                    Depth2Frame5(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 346.0.dp,
                                y = 27.0.dp
                            )
                        )
                    ) {
                        Depth3Frame5 {
                            Depth4Frame5 {
                                Depth5Frame3 {
                                    Vector0(
                                        modifier = Modifier.boxAlign(
                                            alignment = Alignment.TopStart,
                                            offset = DpOffset(
                                                x = 2.99957275390625.dp,
                                                y = 5.99957275390625.dp
                                            )
                                        )
                                    )
                                    Depth6Frame0(
                                        modifier = Modifier.boxAlign(
                                            alignment = Alignment.TopStart,
                                            offset = DpOffset(
                                                x = -889.0.dp,
                                                y = 472.5.dp
                                            )
                                        )
                                    ) {}
                                }
                            }
                        }
                    }
                }
                Depth1Frame5 {
                    Depth2Frame6(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 16.0.dp,
                                y = 13.0.dp
                            )
                        )
                    ) {
                        Depth3Frame6 {
                            Depth4Frame6 {
                                Depth5Frame4(modifier = Modifier.rowWeight(1.0f)) {
                                    EducationalContent()
                                }
                            }
                            Depth4Frame7 {
                                Depth5Frame5(modifier = Modifier.rowWeight(1.0f)) {
                                    LearnHowToReduceYourCarbonFootprint()
                                }
                            }
                        }
                    }
                    Depth2Frame7(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 346.0.dp,
                                y = 22.0.dp
                            )
                        )
                    ) {
                        Depth3Frame7 {
                            Depth4Frame8 {
                                Depth5Frame6 {
                                    Vector1(
                                        modifier = Modifier.boxAlign(
                                            alignment = Alignment.TopStart,
                                            offset = DpOffset(
                                                x = 3.0.dp,
                                                y = 4.49957275390625.dp
                                            )
                                        )
                                    )
                                    Depth6Frame1(
                                        modifier = Modifier.boxAlign(
                                            alignment = Alignment.TopStart,
                                            offset = DpOffset(
                                                x = -889.0.dp,
                                                y = 395.5.dp
                                            )
                                        )
                                    ) {}
                                }
                            }
                        }
                    }
                }
                Depth1Frame6 {
                    Depth2Frame8(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 16.0.dp,
                                y = 13.0.dp
                            )
                        )
                    ) {
                        Depth3Frame8 {
                            Depth4Frame9 {
                                Depth5Frame7(modifier = Modifier.rowWeight(1.0f)) {
                                    PersonalizedSuggestions()
                                }
                            }
                            Depth4Frame10 {
                                Depth5Frame8(modifier = Modifier.rowWeight(1.0f)) {
                                    BasedOnYourSpendingPatterns()
                                }
                            }
                        }
                    }
                    Depth2Frame9(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 346.0.dp,
                                y = 22.0.dp
                            )
                        )
                    ) {
                        Depth3Frame9 {
                            Depth4Frame11 {
                                Depth5Frame9 {
                                    Vector2(
                                        modifier = Modifier.boxAlign(
                                            alignment = Alignment.TopStart,
                                            offset = DpOffset(
                                                x = 3.0.dp,
                                                y = 4.49957275390625.dp
                                            )
                                        )
                                    )
                                    Depth6Frame2(
                                        modifier = Modifier.boxAlign(
                                            alignment = Alignment.TopStart,
                                            offset = DpOffset(
                                                x = -889.0.dp,
                                                y = 323.5.dp
                                            )
                                        )
                                    ) {}
                                }
                            }
                        }
                    }
                }
//                Depth1Frame7 {}
//                Depth1Frame8 {
//                    Depth2Frame10 {
//                        Depth3Frame10 {
//                            Depth4Frame12 {
//                                Depth5Frame10 {
//                                    Depth6Frame3 {
//                                        Vector3(
//                                            modifier = Modifier.boxAlign(
//                                                alignment = Alignment.TopStart,
//                                                offset = DpOffset(
//                                                    x = 3.0.dp,
//                                                    y = 2.2515869140625.dp
//                                                )
//                                            )
//                                        )
//                                        Depth7Frame0(
//                                            modifier = Modifier.boxAlign(
//                                                alignment = Alignment.TopStart,
//                                                offset = DpOffset(
//                                                    x = -577.6015625.dp,
//                                                    y = 178.0.dp
//                                                )
//                                            )
//                                        ) {}
//                                    }
//                                }
//                            }
//                            Depth4Frame13 {
//                                Depth5Frame11(modifier = Modifier.rowWeight(1.0f)) {
//                                    Home()
//                                }
//                            }
//                        }
//                        Depth3Frame11 {
//                            Depth4Frame14 {
//                                Depth5Frame12 {
//                                    Depth6Frame4 {
//                                        Vector4(
//                                            modifier = Modifier.boxAlign(
//                                                alignment = Alignment.TopStart,
//                                                offset = DpOffset(
//                                                    x = 1.5.dp,
//                                                    y = 4.5.dp
//                                                )
//                                            )
//                                        )
//                                        Depth7Frame1(
//                                            modifier = Modifier.boxAlign(
//                                                alignment = Alignment.TopStart,
//                                                offset = DpOffset(
//                                                    x = -650.8046875.dp,
//                                                    y = 178.0.dp
//                                                )
//                                            )
//                                        ) {}
//                                    }
//                                }
//                            }
//                            Depth4Frame15 {
//                                Depth5Frame13(modifier = Modifier.rowWeight(1.0f)) {
//                                    Spend()
//                                }
//                            }
//                        }
//                        Depth3Frame12 {
//                            Depth4Frame16 {
//                                Depth5Frame14 {
//                                    Depth6Frame5 {
//                                        Vector5(
//                                            modifier = Modifier.boxAlign(
//                                                alignment = Alignment.TopStart,
//                                                offset = DpOffset(
//                                                    x = 0.0.dp,
//                                                    y = 3.0.dp
//                                                )
//                                            )
//                                        )
//                                        Depth7Frame2(
//                                            modifier = Modifier.boxAlign(
//                                                alignment = Alignment.TopStart,
//                                                offset = DpOffset(
//                                                    x = -724.0078125.dp,
//                                                    y = 178.0.dp
//                                                )
//                                            )
//                                        ) {}
//                                    }
//                                }
//                            }
//                            Depth4Frame17 {
//                                Depth5Frame15(modifier = Modifier.rowWeight(1.0f)) {
//                                    Save()
//                                }
//                            }
//                        }
//                        Depth3Frame13 {
//                            Depth4Frame18 {
//                                Depth5Frame16 {
//                                    Depth6Frame6 {
//                                        Vector6(
//                                            modifier = Modifier.boxAlign(
//                                                alignment = Alignment.TopStart,
//                                                offset = DpOffset(
//                                                    x = 2.25.dp,
//                                                    y = 2.25.dp
//                                                )
//                                            )
//                                        )
//                                        Depth7Frame3(
//                                            modifier = Modifier.boxAlign(
//                                                alignment = Alignment.TopStart,
//                                                offset = DpOffset(
//                                                    x = -797.2109375.dp,
//                                                    y = 178.0.dp
//                                                )
//                                            )
//                                        ) {}
//                                    }
//                                }
//                            }
//                            Depth4Frame19 {
//                                Depth5Frame17(modifier = Modifier.rowWeight(1.0f)) {
//                                    Credit()
//                                }
//                            }
//                        }
//                        Depth3Frame14 {
//                            Depth4Frame20 {
//                                Depth5Frame18 {
//                                    Depth6Frame7 {
//                                        Vector7(
//                                            modifier = Modifier.boxAlign(
//                                                alignment = Alignment.TopStart,
//                                                offset = DpOffset(
//                                                    x = 2.18988037109375.dp,
//                                                    y = 2.1898956298828125.dp
//                                                )
//                                            )
//                                        )
//                                        Depth7Frame4(
//                                            modifier = Modifier.boxAlign(
//                                                alignment = Alignment.TopStart,
//                                                offset = DpOffset(
//                                                    x = -870.4140625.dp,
//                                                    y = 178.0.dp
//                                                )
//                                            )
//                                        ) {}
//                                    }
//                                }
//                            }
//                            Depth4Frame21 {
//                                Depth5Frame19(modifier = Modifier.rowWeight(1.0f)) {
//                                    Profile()
//                                }
//                            }
//                        }
//                    }
//                }
//                Depth1Frame9 {}
            }
        }
    }
}

@Preview(widthDp = 390, heightDp = 828)
@Composable
private fun TipsSuggestionPreview() {
    MaterialTheme {
        RelayContainer {
            TipsSuggestion(modifier = Modifier.columnWeight(1.0f))
        }
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
fun GreenTips(modifier: Modifier = Modifier) {
    RelayText(
        content = "Green Tips",
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
            .requiredWidth(90.375.dp)
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
fun Depth4Frame2(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.tips_suggestion_depth_4_frame_0),
        contentScale = ContentScale.Crop,
        modifier = modifier
            .requiredWidth(390.0.dp)
            .requiredHeight(218.0.dp)
    )
}

@Composable
fun Depth3Frame0Synth(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        content = content,
        modifier = modifier
            .requiredWidth(390.0.dp)
            .requiredHeight(218.0.dp)
            .alpha(alpha = 100.0f)
    )
}

@Composable
fun Depth3Frame3(
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
        content = content,
        modifier = modifier
            .requiredWidth(390.0.dp)
            .requiredHeight(218.0.dp)
    )
}

@Composable
fun Depth2Frame1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(390.0.dp)
            .requiredHeight(218.0.dp)
    )
}

@Composable
fun Depth1Frame1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(390.0.dp)
            .requiredHeight(218.0.dp)
    )
}

@Composable
fun ReduceYourCarbonFootprint(modifier: Modifier = Modifier) {
    RelayText(
        content = "Reduce your carbon footprint",
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
fun Depth2Frame2(
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
fun Depth1Frame2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
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
fun DidYouKnowThatA5MinuteShowerUses1025GallonsOfWaterTryTakingShorterShowersToSaveWaterAndReduceYourCarbonFootprint(
    modifier: Modifier = Modifier,
) {
    RelayText(
        content = "Did you know that a 5-minute shower uses 10-25 gallons of water? Try taking shorter showers to save water and reduce your carbon footprint.",
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
fun Depth2Frame3(
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
fun Depth1Frame3(
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
            .requiredHeight(88.0.dp)
    )
}

@Composable
fun DailyChallenges(modifier: Modifier = Modifier) {
    RelayText(
        content = "Daily Challenges",
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
fun Depth4Frame3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        content = content,
        modifier = modifier
            .requiredWidth(314.0.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun TakeShorterShowersUsePublicTransportationOrBuyLocalProduce(modifier: Modifier = Modifier) {
    RelayText(
        content = "Take shorter showers, use public transportation,  or buy local produce",
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
fun Depth5Frame2(
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
fun Depth4Frame4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        content = content,
        modifier = modifier
            .requiredWidth(314.0.dp)
            .requiredHeight(42.0.dp)
    )
}

@Composable
fun Depth3Frame4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        crossAxisAlignment = CrossAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(314.0.dp)
            .requiredHeight(66.0.dp)
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
            .requiredWidth(314.0.dp)
            .requiredHeight(66.0.dp)
    )
}

@Composable
fun Vector0(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.tips_suggestion_vector_0),
        modifier = modifier
            .requiredWidth(24.0.dp)
            .requiredHeight(24.0.dp)
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
        modifier = modifier
            .requiredWidth(0.0.dp)
            .requiredHeight(0.0.dp)
    )
}

@Composable
fun Depth5Frame3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier
            .requiredWidth(24.0.dp)
            .requiredHeight(24.0.dp)
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
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(24.0.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth3Frame5(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(28.0.dp)
            .requiredHeight(28.0.dp)
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
            .requiredWidth(28.0.dp)
            .requiredHeight(28.0.dp)
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
            .requiredHeight(82.0.dp)
    )
}

@Composable
fun EducationalContent(modifier: Modifier = Modifier) {
    RelayText(
        content = "Educational Content",
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
fun Depth5Frame4(
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
            .requiredWidth(271.09375.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun LearnHowToReduceYourCarbonFootprint(modifier: Modifier = Modifier) {
    RelayText(
        content = "Learn how to reduce your carbon footprint",
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
fun Depth5Frame5(
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
            .requiredWidth(271.09375.dp)
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
            .requiredWidth(271.09375.dp)
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
            .requiredWidth(292.546875.dp)
            .requiredHeight(45.0.dp)
    )
}

@Composable
fun Vector1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.tips_suggestion_vector_1),
        modifier = modifier
            .requiredWidth(24.0.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth6Frame1(
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
fun Depth5Frame6(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier
            .requiredWidth(24.0.dp)
            .requiredHeight(24.0.dp)
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
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(24.0.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth3Frame7(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(28.0.dp)
            .requiredHeight(28.0.dp)
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
            .requiredWidth(28.0.dp)
            .requiredHeight(28.0.dp)
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
fun PersonalizedSuggestions(modifier: Modifier = Modifier) {
    RelayText(
        content = "Personalized Suggestions",
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
fun Depth4Frame9(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        content = content,
        modifier = modifier
            .requiredWidth(212.390625.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun BasedOnYourSpendingPatterns(modifier: Modifier = Modifier) {
    RelayText(
        content = "Based on your spending patterns",
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
fun Depth4Frame10(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        content = content,
        modifier = modifier
            .requiredWidth(212.390625.dp)
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
            .requiredWidth(212.390625.dp)
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
            .requiredWidth(263.1875.dp)
            .requiredHeight(45.0.dp)
    )
}

@Composable
fun Vector2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.tips_suggestion_vector_2),
        modifier = modifier
            .requiredWidth(24.0.dp)
            .requiredHeight(24.0.dp)
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
            .requiredWidth(0.0.dp)
            .requiredHeight(0.0.dp)
    )
}

@Composable
fun Depth5Frame9(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier
            .requiredWidth(24.0.dp)
            .requiredHeight(24.0.dp)
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
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(24.0.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth3Frame9(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(28.0.dp)
            .requiredHeight(28.0.dp)
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
            .requiredWidth(28.0.dp)
            .requiredHeight(28.0.dp)
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
fun Depth1Frame7(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 85.5.dp,
            end = 0.0.dp,
            bottom = 0.0.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(390.0.dp)
            .requiredHeight(85.5.dp)
    )
}

@Composable
fun Vector3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.tips_suggestion_vector_3),
        modifier = modifier
            .requiredWidth(24.0.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth7Frame0(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(0.0.dp)
            .requiredHeight(0.0.dp)
    )
}

@Composable
fun Depth6Frame3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier
            .requiredWidth(24.0.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth5Frame10(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(24.0.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth4Frame12(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        clipToParent = false,
        radius = 16.0,
        content = content,
        modifier = modifier
            .requiredWidth(48.0.dp)
            .requiredHeight(32.0.dp)
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
fun Depth5Frame11(
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
fun Depth4Frame13(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(33.734375.dp)
            .requiredHeight(18.0.dp)
    )
}

@Composable
fun Depth3Frame10(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        itemSpacing = 4.0,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(65.203125.dp)
            .requiredHeight(54.0.dp)
    )
}

@Composable
fun Vector4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.tips_suggestion_vector_4),
        modifier = modifier
            .requiredWidth(24.0.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth7Frame1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(0.0.dp)
            .requiredHeight(0.0.dp)
    )
}

@Composable
fun Depth6Frame4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier
            .requiredWidth(24.0.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth5Frame12(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(24.0.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth4Frame14(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
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
        modifier = modifier
            .requiredWidth(24.0.dp)
            .requiredHeight(32.0.dp)
    )
}

@Composable
fun Spend(modifier: Modifier = Modifier) {
    RelayText(
        content = "Spend",
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
fun Depth5Frame13(
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
fun Depth4Frame15(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(37.0.dp)
            .requiredHeight(18.0.dp)
    )
}

@Composable
fun Depth3Frame11(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        itemSpacing = 4.0,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(65.203125.dp)
            .requiredHeight(54.0.dp)
    )
}

@Composable
fun Vector5(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.tips_suggestion_vector_5),
        modifier = modifier
            .requiredWidth(24.0.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth7Frame2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(0.0.dp)
            .requiredHeight(0.0.dp)
    )
}

@Composable
fun Depth6Frame5(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier
            .requiredWidth(24.0.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth5Frame14(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(24.0.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth4Frame16(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
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
        modifier = modifier
            .requiredWidth(24.0.dp)
            .requiredHeight(32.0.dp)
    )
}

@Composable
fun Save(modifier: Modifier = Modifier) {
    RelayText(
        content = "Save",
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
fun Depth5Frame15(
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
fun Depth4Frame17(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(27.953125.dp)
            .requiredHeight(18.0.dp)
    )
}

@Composable
fun Depth3Frame12(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        itemSpacing = 4.0,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(65.203125.dp)
            .requiredHeight(54.0.dp)
    )
}

@Composable
fun Vector6(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.tips_suggestion_vector_6),
        modifier = modifier
            .requiredWidth(24.0.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth7Frame3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(0.0.dp)
            .requiredHeight(0.0.dp)
    )
}

@Composable
fun Depth6Frame6(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier
            .requiredWidth(24.0.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth5Frame16(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(24.0.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth4Frame18(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
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
        modifier = modifier
            .requiredWidth(24.0.dp)
            .requiredHeight(32.0.dp)
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
fun Depth5Frame17(
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
fun Depth4Frame19(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(36.375.dp)
            .requiredHeight(18.0.dp)
    )
}

@Composable
fun Depth3Frame13(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        itemSpacing = 4.0,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(65.203125.dp)
            .requiredHeight(54.0.dp)
    )
}

@Composable
fun Vector7(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.tips_suggestion_vector_7),
        modifier = modifier
            .requiredWidth(24.0.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth7Frame4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(0.0.dp)
            .requiredHeight(0.0.dp)
    )
}

@Composable
fun Depth6Frame7(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier
            .requiredWidth(24.0.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth5Frame18(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(24.0.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun Depth4Frame20(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
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
        modifier = modifier
            .requiredWidth(24.0.dp)
            .requiredHeight(32.0.dp)
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
fun Depth5Frame19(
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
fun Depth4Frame21(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(37.859375.dp)
            .requiredHeight(18.0.dp)
    )
}

@Composable
fun Depth3Frame14(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        itemSpacing = 4.0,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(65.203125.dp)
            .requiredHeight(54.0.dp)
    )
}

@Composable
fun Depth2Frame10(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 8.0,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(358.0.dp)
            .requiredHeight(54.0.dp)
    )
}

@Composable
fun Depth1Frame8(
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
        modifier = modifier
            .requiredWidth(390.0.dp)
            .requiredHeight(75.0.dp)
    )
}

@Composable
fun Depth1Frame9(
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
            .requiredHeight(844.0.dp)
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
        modifier = modifier
            .width(IntrinsicSize.Min)
            .fillMaxHeight(1.0f)
    )
}
