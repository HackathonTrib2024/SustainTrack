package com.sustain.track.ui.screens.track

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.sustain.track.R
import com.sustain.track.ui.relay.compose.home.RelayContainer
import com.sustain.track.ui.relay.compose.home.RelayContainerArrangement
import com.sustain.track.ui.relay.compose.home.RelayContainerScope
import com.sustain.track.ui.relay.compose.home.RelayText
import com.sustain.track.ui.relay.compose.home.RelayVector
import com.sustain.track.ui.relay.compose.home.relayDropShadow

/**
 * TrackScreen
 *
 * This composable was generated from the UI Package 'track'.
 * Generated code; do not edit directly
 */
@Composable
fun Track(
    modifier: Modifier = Modifier
) {
    TopLevel(modifier = modifier) {
            Frame2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 2.0.dp
                    )
                )
            ) {
                CO268KgSoFarThisMonth(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -1.0.dp,
                            y = 11.5.dp
                        )
                    )
                )
                HiJohnYourHaveEmitted68KgCO2ThisMonth(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.CenterStart,
                        offset = DpOffset(
                            x = 23.0.dp,
                            y = -153.5.dp
                        )
                    )
                )
                GroupOne(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 80.0.dp,
                            y = 116.0.dp
                        )
                    )
                ) {
                    Ellipse4()
                    Ellipse5(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 120.591064453125.dp,
                                y = 0.5946044921875.dp
                            )
                        )
                    )
                    Ellipse6(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 204.0.dp,
                                y = 102.0.dp
                            )
                        )
                    )
                }
                Ellipse7(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 23.0.dp,
                            y = 364.0.dp
                        )
                    )
                )
                Ellipse8(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 227.0.dp,
                            y = 363.0.dp
                        )
                    )
                )
                Class5(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 237.0.dp,
                            y = 372.0.dp
                        )
                    )
                )
                Car(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 31.0.dp,
                            y = 372.0.dp
                        )
                    )
                ) {
                    Vector(
                        modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f)
                    )
                }
                Uber(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 76.0.dp,
                            y = 363.0.dp
                        )
                    )
                )
                MostlyUsedTransport(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 76.0.dp,
                            y = 386.0.dp
                        )
                    )
                )
                Class400Kg(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 277.0.dp,
                            y = 365.0.dp
                        )
                    )
                )
                Monthly(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 277.0.dp,
                            y = 386.0.dp
                        )
                    )
                )
            }

            Frame3(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 16.0.dp,
                        y = 566.0.dp
                    )
                )
            ) {
                PublicTransport(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 16.0.dp,
                            y = 12.0.dp
                        )
                    )
                )
                UseSLTransportForDailyCommuteToWorkPlaces(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 16.0.dp,
                            y = 51.0.dp
                        )
                    )
                )
                SlAbStorstockholmLokaltrafik1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 251.0.dp,
                            y = 20.0.dp
                        )
                    )
                ) {
                    Group(
                        modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f)
                    ) {
                        Vector5(
                            modifier = Modifier
                                .rowWeight(1.0f)
                                .columnWeight(1.0f)
                        )
                        Vector6(
                            modifier = Modifier
                                .rowWeight(1.0f)
                                .columnWeight(1.0f)
                        )
                        Vector7(
                            modifier = Modifier
                                .rowWeight(1.0f)
                                .columnWeight(1.0f)
                        )
                        Vector8(
                            modifier = Modifier
                                .rowWeight(1.0f)
                                .columnWeight(1.0f)
                        )
                        Vector9(
                            modifier = Modifier
                                .rowWeight(1.0f)
                                .columnWeight(1.0f)
                        )
                    }
                }
                ReadMoreOnSL(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 16.0.dp,
                            y = 114.0.dp
                        )
                    )
                )
            }
            Frame4(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 16.0.dp,
                        y = 736.0.dp
                    )
                )
            ) {
                PublicTransport1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 16.0.dp,
                            y = 12.0.dp
                        )
                    )
                )
                UseSLTransportForDailyCommuteToWorkPlaces1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 16.0.dp,
                            y = 51.0.dp
                        )
                    )
                )
                SlAbStorstockholmLokaltrafik2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 251.0.dp,
                            y = 20.0.dp
                        )
                    )
                ) {
                    Group1(
                        modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f)
                    ) {
                        Vector10(
                            modifier = Modifier
                                .rowWeight(1.0f)
                                .columnWeight(1.0f)
                        )
                        Vector11(
                            modifier = Modifier
                                .rowWeight(1.0f)
                                .columnWeight(1.0f)
                        )
                        Vector12(
                            modifier = Modifier
                                .rowWeight(1.0f)
                                .columnWeight(1.0f)
                        )
                        Vector13(
                            modifier = Modifier
                                .rowWeight(1.0f)
                                .columnWeight(1.0f)
                        )
                        Vector14(
                            modifier = Modifier
                                .rowWeight(1.0f)
                                .columnWeight(1.0f)
                        )
                    }
                }
                ReadMoreOnSL1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 16.0.dp,
                            y = 114.0.dp
                        )
                    )
                )
            }
            WorriedHereSWhatWeCanNeedToDo(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 13.0.dp,
                        y = 495.0.dp
                    )
                )
            )
        }
}

@Preview()
@Composable
private fun TrackPreview() {
    MaterialTheme {
        RelayContainer {
            Track(modifier = Modifier
                .rowWeight(1.0f)
                .columnWeight(1.0f))
        }
    }
}

@Composable
fun CO268KgSoFarThisMonth(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 27,
                        green = 165,
                        blue = 82
                    ),
                    fontFamily = roboto,
                    fontSize = 24.0.sp,
                    fontWeight = FontWeight(500.0.toInt())
                )
            ) {
                append("CO")
            }
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 27,
                        green = 165,
                        blue = 82
                    ),
                    fontFamily = roboto,
                    fontSize = 24.0.sp,
                    fontWeight = FontWeight(500.0.toInt())
                )
            ) {
                append("2 \n")
            }
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 81,
                        green = 43,
                        blue = 43
                    ),
                    fontFamily = roboto,
                    fontSize = 32.0.sp,
                    fontWeight = FontWeight(500.0.toInt())
                )
            ) {
                append("68 kg\n")
            }
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 27,
                        green = 165,
                        blue = 82
                    ),
                    fontFamily = roboto,
                    fontWeight = FontWeight(500.0.toInt())
                )
            ) {
                append("so far this month")
            }
        },
        fontSize = 16.0.sp,
        height = 2.5.em,
        modifier = modifier
    )
}

@Composable
fun HiJohnYourHaveEmitted68KgCO2ThisMonth(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    fontSize = 24.0.sp,
                    color = Color(
                        alpha = 255,
                        red = 81,
                        green = 43,
                        blue = 43
                    ),
                    fontWeight = FontWeight(700.0.toInt()),
                )
            ) {
                append("Hi John,\n")
            }
            append("Your have emitted 68 kg CO")
            append("2 ")
            append("this month")
        },
        fontSize = 16.0.sp,
        color = Color(
            alpha = 255,
            red = 81,
            green = 43,
            blue = 43
        ),
        height = 1.75.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier
            .requiredWidth(283.0.dp)
            .requiredHeight(69.0.dp)
    )
}

@Composable
fun Ellipse4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.track_ellipse_4),
        modifier = modifier
            .requiredWidth(220.0.dp)
            .requiredHeight(220.0.dp)
    )
}

@Composable
fun Ellipse5(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.track_ellipse_5),
        modifier = modifier
            .requiredWidth(220.0.dp)
            .requiredHeight(220.0.dp)
    )
}

@Composable
fun Ellipse6(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.track_ellipse_6),
        modifier = modifier
            .requiredWidth(25.0.dp)
            .requiredHeight(25.0.dp)
    )
}

@Composable
fun GroupOne(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(229.0.dp)
            .requiredHeight(220.0.dp)
    )
}

@Composable
fun Ellipse7(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.track_ellipse_7),
        modifier = modifier
            .requiredWidth(40.0.dp)
            .requiredHeight(40.0.dp)
    )
}

@Composable
fun Ellipse8(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.track_ellipse_8),
        modifier = modifier
            .requiredWidth(40.0.dp)
            .requiredHeight(40.0.dp)
    )
}

@Composable
fun Class5(modifier: Modifier = Modifier) {
    RelayText(
        content = "-5%",
        color = Color(
            alpha = 255,
            red = 27,
            green = 165,
            blue = 82
        ),
        height = 1.7142857360839843.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.track_vector),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 0.75.dp,
                    top = 3.0.dp,
                    end = 0.75.dp,
                    bottom = 3.75.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Car(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(24.0.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun Uber(modifier: Modifier = Modifier) {
    RelayText(
        content = "Uber",
        fontSize = 16.0.sp,
        color = Color(
            alpha = 255,
            red = 81,
            green = 43,
            blue = 43
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun MostlyUsedTransport(modifier: Modifier = Modifier) {
    RelayText(
        content = "Mostly used transport",
        color = Color(
            alpha = 255,
            red = 81,
            green = 43,
            blue = 43
        ),
        height = 1.7142857360839843.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun Class400Kg(modifier: Modifier = Modifier) {
    RelayText(
        content = "400 Kg",
        fontSize = 16.0.sp,
        color = Color(
            alpha = 255,
            red = 81,
            green = 43,
            blue = 43
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun Monthly(modifier: Modifier = Modifier) {
    RelayText(
        content = "Monthly ",
        color = Color(
            alpha = 255,
            red = 81,
            green = 43,
            blue = 43
        ),
        height = 1.7142857360839843.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun Frame2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 253,
            green = 246,
            blue = 238
        ),
        isStructured = false,
        content = content,
        modifier = modifier
            .fillMaxWidth()
            .requiredHeight(450.0.dp)
    )
}

@Composable
fun Icon(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 85.0,
        content = content,
        modifier = modifier
            .requiredWidth(64.0.dp)
            .requiredHeight(32.0.dp)
    )
}

@Composable
fun Label(modifier: Modifier = Modifier) {
    RelayText(
        content = "Home",
        fontSize = 12.0.sp,
        color = Color(
            alpha = 255,
            red = 68,
            green = 71,
            blue = 70
        ),
        height = 1.3333332824707032.em,
        letterSpacing = 0.4000000059604645.sp,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun MaterialYouTab1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        padding = PaddingValues(
            start = 0.0.dp,
            top = 10.0.dp,
            end = 0.0.dp,
            bottom = 8.0.dp
        ),
        itemSpacing = 6.0,
        content = content,
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Icon1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 194,
            green = 231,
            blue = 255
        ),
        isStructured = false,
        clipToParent = false,
        radius = 85.0,
        content = content,
        modifier = modifier
            .requiredWidth(64.0.dp)
            .requiredHeight(32.0.dp)
    )
}

@Composable
fun Label1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Track",
        fontSize = 12.0.sp,
        color = Color(
            alpha = 255,
            red = 20,
            green = 27,
            blue = 44
        ),
        height = 1.3333332824707032.em,
        letterSpacing = 0.4000000059604645.sp,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun MaterialYouTab2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        padding = PaddingValues(
            start = 0.0.dp,
            top = 10.0.dp,
            end = 0.0.dp,
            bottom = 8.0.dp
        ),
        itemSpacing = 6.0,
        content = content,
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Tabs(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        clipToParent = false,
        content = content,
        modifier = modifier
            .fillMaxWidth(1.0f)
            .requiredHeight(80.0.dp)
    )
}

@Composable
fun Rectangle(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.track_rectangle),
        modifier = modifier
            .requiredWidth(64.0.dp)
            .requiredHeight(2.0.dp)
    )
}

@Composable
fun GestureNavigation1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 253,
            green = 246,
            blue = 238
        ),
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun GestureNavigation(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 253,
            green = 246,
            blue = 238
        ),
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .fillMaxWidth(1.0f)
            .requiredHeight(14.0.dp)
    )
}


@Composable
fun Vector3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.track_vector1),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 1.4996337890625.dp,
                    top = 4.5.dp,
                    end = 1.499948501586914.dp,
                    bottom = 5.999582290649414.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}


@Composable
fun Vector4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.track_vector2),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 3.0.dp,
                    top = 2.250732421875.dp,
                    end = 3.0.dp,
                    bottom = 2.9999618530273438.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}


@Composable
fun PublicTransport(modifier: Modifier = Modifier) {
    RelayText(
        content = "Public transport",
        fontSize = 24.0.sp,
        color = Color(
            alpha = 255,
            red = 251,
            green = 79,
            blue = 0
        ),
        height = 1.1666666412353515.em,
        fontWeight = FontWeight(900.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun UseSLTransportForDailyCommuteToWorkPlaces(modifier: Modifier = Modifier) {
    RelayText(
        content = "Use SL transport for daily commute to work places",
        color = Color(
            alpha = 255,
            red = 81,
            green = 43,
            blue = 43
        ),
        height = 1.4285714721679688.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(203.0.dp)
    )
}

@Composable
fun Vector5(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.track_vector3),
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector6(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.track_vector4),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 23.0023193359375.dp,
                    top = 21.09326171875.dp,
                    end = 22.977402687072754.dp,
                    bottom = 25.640228271484375.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector7(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.track_vector5),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 25.7568359375.dp,
                    top = 24.97705078125.dp,
                    end = 25.49802589416504.dp,
                    bottom = 29.96691083908081.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector8(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.track_vector6),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 18.5162353515625.dp,
                    top = 27.826904296875.dp,
                    end = 18.516178131103516.dp,
                    bottom = 21.092870712280273.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector9(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.track_vector7),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 20.7529296875.dp,
                    top = 27.826904296875.dp,
                    end = 20.753313064575195.dp,
                    bottom = 23.3659725189209.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Group(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun SlAbStorstockholmLokaltrafik1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier
            .requiredWidth(61.0.dp)
            .requiredHeight(62.0.dp)
    )
}

@Composable
fun ReadMoreOnSL(modifier: Modifier = Modifier) {
    RelayText(
        content = "Read more on SL",
        fontSize = 16.0.sp,
        color = Color(
            alpha = 255,
            red = 37,
            green = 120,
            blue = 134
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 253,
            green = 246,
            blue = 238
        ),
        isStructured = false,
        radius = 4.0,
        content = content,
        modifier = modifier
            .fillMaxWidth()
            .padding(end = 32.0.dp)
            .requiredHeight(150.0.dp)
            .relayDropShadow(
                color = Color(
                    alpha = 63,
                    red = 0,
                    green = 0,
                    blue = 0
                ),
                borderRadius = 4.0.dp,
                blur = 4.0.dp,
                offsetX = 0.0.dp,
                offsetY = 4.0.dp,
                spread = 0.0.dp
            )
    )
}

@Composable
fun PublicTransport1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Public transport",
        fontSize = 24.0.sp,
        color = Color(
            alpha = 255,
            red = 251,
            green = 79,
            blue = 0
        ),
        height = 1.1666666412353515.em,
        fontWeight = FontWeight(900.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun UseSLTransportForDailyCommuteToWorkPlaces1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Use SL transport for daily commute to work places",
        color = Color(
            alpha = 255,
            red = 81,
            green = 43,
            blue = 43
        ),
        height = 1.4285714721679688.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(203.0.dp)
    )
}

@Composable
fun Vector10(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.track_vector8),
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector11(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.track_vector9),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 23.0023193359375.dp,
                    top = 21.09326171875.dp,
                    end = 22.977402687072754.dp,
                    bottom = 25.640228271484375.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector12(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.track_vector10),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 25.7568359375.dp,
                    top = 24.97705078125.dp,
                    end = 25.49802589416504.dp,
                    bottom = 29.96691083908081.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector13(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.track_vector11),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 18.5162353515625.dp,
                    top = 27.826904296875.dp,
                    end = 18.516178131103516.dp,
                    bottom = 21.092870712280273.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector14(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.track_vector12),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 20.7529296875.dp,
                    top = 27.826904296875.dp,
                    end = 20.753313064575195.dp,
                    bottom = 23.3659725189209.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Group1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun SlAbStorstockholmLokaltrafik2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier
            .requiredWidth(61.0.dp)
            .requiredHeight(62.0.dp)
    )
}

@Composable
fun ReadMoreOnSL1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Read more on SL",
        fontSize = 16.0.sp,
        color = Color(
            alpha = 255,
            red = 37,
            green = 120,
            blue = 134
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 253,
            green = 246,
            blue = 238
        ),
        isStructured = false,
        radius = 4.0,
        content = content,
        modifier = modifier
            .fillMaxWidth()
            .padding(end = 32.0.dp)
            .requiredHeight(150.0.dp)
            .relayDropShadow(
                color = Color(
                    alpha = 63,
                    red = 0,
                    green = 0,
                    blue = 0
                ),
                borderRadius = 4.0.dp,
                blur = 4.0.dp,
                offsetX = 0.0.dp,
                offsetY = 4.0.dp,
                spread = 0.0.dp
            )
    )
}

@Composable
fun WorriedHereSWhatWeCanNeedToDo(modifier: Modifier = Modifier) {
    RelayText(
        content = "Worried? Here’s what we can  need to do",
        fontSize = 20.0.sp,
        color = Color(
            alpha = 255,
            red = 81,
            green = 43,
            blue = 43
        ),
        height = 1.2.em,
        maxLines = -1,
        modifier = modifier
            .requiredWidth(330.0.dp)
            .requiredHeight(44.0.dp)
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
        isStructured = false,
        content = content,
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}
