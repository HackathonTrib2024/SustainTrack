package com.sustain.track.ui.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sustain.track.R
import com.sustain.track.modal.home.IconConfig
import com.sustain.track.modal.home.TransactionItem
import com.sustain.track.ui.relay.compose.BorderAlignment
import com.sustain.track.ui.relay.compose.BoxScopeInstance.boxAlign
import com.sustain.track.ui.relay.compose.CrossAxisAlignment
import com.sustain.track.ui.relay.compose.MainAxisAlignment
import com.sustain.track.ui.relay.compose.RelayContainer
import com.sustain.track.ui.relay.compose.RelayContainerArrangement
import com.sustain.track.ui.relay.compose.RelayContainerScope
import com.sustain.track.ui.relay.compose.RelayText
import com.sustain.track.ui.relay.compose.RelayVector

/**
 * TransactionsHome
 *
 * This composable was generated from the UI Package 'transactions_home'.
 * Generated code; do not edit directly
 */
@Composable
fun TransactionsHome(
    viewModel: TransactionViewModel = viewModel()
    ) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        TopLevel(modifier = Modifier) {
            AppBar(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 2.0.dp
                    )
                )
            ) {
                AppBar1()
                Transactions1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.CenterStart,
                        offset = DpOffset(
                            x = 34.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
            }
            Transactions(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 16.0.dp,
                        y = 323.0.dp
                    )
                )
            )
            Frame2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 58.0.dp
                    )
                )
            ) {
                SearchBar(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 7.0.dp
                        )
                    )
                ) {
                    SearchBar1 {
                        StateLayer(
                            modifier = Modifier
                                .rowWeight(1.0f)
                                .columnWeight(1.0f)
                        ) {
                            LeadingIcon {
                                Container {
                                    StateLayer1 {
                                        Icon {
                                            Icon(
                                                modifier = Modifier
                                                    .rowWeight(1.0f)
                                                    .columnWeight(1.0f)
                                            )
                                        }
                                    }
                                }
                            }
                            Content(
                                modifier = Modifier
                                    .rowWeight(1.0f)
                                    .columnWeight(1.0f)
                            ) {
                                SupportingText()
                            }
                            TrailingElements {
                                Class1stTrailingIcon {
                                    Container1 {
                                        StateLayer2 {
                                            Icon1 {
                                                Icon1(
                                                    modifier = Modifier
                                                        .rowWeight(1.0f)
                                                        .columnWeight(1.0f)
                                                )
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                Privatkonto(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 16.0.dp,
                            y = 82.0.dp
                        )
                    )
                )
                Class8417847246756(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 16.0.dp,
                            y = 114.0.dp
                        )
                    )
                )
                AvailableAmount(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 16.0.dp,
                            y = 142.0.dp
                        )
                    )
                )
            }
            Rectangle30(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 16.0.dp,
                        y = 259.0.dp
                    )
                )
            )
            PayOrTransferFromAccount(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = -0.5.dp,
                        y = 270.0.dp
                    )
                )
            )

            // first list item, need to use lazy colunm to scroll
            AddTransactionList(modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 358.0.dp
                )
            )) {
                LazyColumn {
                    viewModel.transactions
                    items(viewModel.transactions) { item ->
                        TransactionsList(item)
                    }
                }
            }
//            LazyColumn {
//                viewModel.transactions
//                items(viewModel.transactions) { item ->
//                    TransactionsList(item)
//                }
//            }
            // First list item ends here

//            List1(
//                modifier = Modifier.boxAlign(
//                    alignment = Alignment.TopStart,
//                    offset = DpOffset(
//                        x = 0.0.dp,
//                        y = 438.0.dp
//                    )
//                )
//            ) {
//                Divider2 {}
//                Divider3(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.BottomStart,
//                        offset = DpOffset(
//                            x = 0.0.dp,
//                            y = 0.0.dp
//                        )
//                    )
//                ) {}
//                Text2(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.CenterEnd,
//                        offset = DpOffset(
//                            x = -33.0.dp,
//                            y = 0.0.dp
//                        )
//                    )
//                ) {
//                    Class5KGCO2(
//                        modifier = Modifier.boxAlign(
//                            alignment = Alignment.TopStart,
//                            offset = DpOffset(
//                                x = -18.0.dp,
//                                y = 19.0.dp
//                            )
//                        )
//                    )
//                    Class500Kr(
//                        modifier = Modifier.boxAlign(
//                            alignment = Alignment.BottomStart,
//                            offset = DpOffset(
//                                x = -12.0.dp,
//                                y = -17.0.dp
//                            )
//                        )
//                    )
//                }
//                Text3(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.CenterStart,
//                        offset = DpOffset(
//                            x = 60.0.dp,
//                            y = 0.0.dp
//                        )
//                    )
//                ) {
//                    Transportation(
//                        modifier = Modifier.boxAlign(
//                            alignment = Alignment.TopStart,
//                            offset = DpOffset(
//                                x = 0.0.dp,
//                                y = 9.0.dp
//                            )
//                        )
//                    )
//                    Class20240525(
//                        modifier = Modifier.boxAlign(
//                            alignment = Alignment.TopStart,
//                            offset = DpOffset(
//                                x = 0.0.dp,
//                                y = 25.0.dp
//                            )
//                        )
//                    )
//                    Uber(
//                        modifier = Modifier.boxAlign(
//                            alignment = Alignment.TopStart,
//                            offset = DpOffset(
//                                x = 0.0.dp,
//                                y = -10.0.dp
//                            )
//                        )
//                    )
//                }
//                AngleRight1(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.CenterStart,
//                        offset = DpOffset(
//                            x = 336.0.dp,
//                            y = -1.0.dp
//                        )
//                    )
//                ) {
//                    Vector3(
//                        modifier = Modifier
//                            .rowWeight(1.0f)
//                            .columnWeight(1.0f)
//                    )
//                }
//                Home1(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.CenterStart,
//                        offset = DpOffset(
//                            x = 20.0.dp,
//                            y = 0.0.dp
//                        )
//                    )
//                ) {
//                    Vector4(
//                        modifier = Modifier
//                            .rowWeight(1.0f)
//                            .columnWeight(1.0f)
//                    )
//                    Vector5(
//                        modifier = Modifier
//                            .rowWeight(1.0f)
//                            .columnWeight(1.0f)
//                    )
//                }
//                Ellipse2(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.Center,
//                        offset = DpOffset(
//                            x = -148.0.dp,
//                            y = 0.0.dp
//                        )
//                    )
//                )
//                Car(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.CenterStart,
//                        offset = DpOffset(
//                            x = 20.0.dp,
//                            y = 0.0.dp
//                        )
//                    )
//                ) {
//                    Vector6(
//                        modifier = Modifier
//                            .rowWeight(1.0f)
//                            .columnWeight(1.0f)
//                    )
//                }
//            }
//            List2(
//                modifier = Modifier.boxAlign(
//                    alignment = Alignment.TopStart,
//                    offset = DpOffset(
//                        x = 0.0.dp,
//                        y = 518.0.dp
//                    )
//                )
//            ) {
//                Divider4 {}
//                Divider5(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.BottomStart,
//                        offset = DpOffset(
//                            x = 0.0.dp,
//                            y = 0.0.dp
//                        )
//                    )
//                ) {}
//                Text4(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.CenterEnd,
//                        offset = DpOffset(
//                            x = -33.0.dp,
//                            y = 0.0.dp
//                        )
//                    )
//                ) {
//                    Class35KGCO2(
//                        modifier = Modifier.boxAlign(
//                            alignment = Alignment.TopStart,
//                            offset = DpOffset(
//                                x = -31.0.dp,
//                                y = 19.0.dp
//                            )
//                        )
//                    )
//                    Class199Kr(
//                        modifier = Modifier.boxAlign(
//                            alignment = Alignment.BottomStart,
//                            offset = DpOffset(
//                                x = -12.0.dp,
//                                y = -17.0.dp
//                            )
//                        )
//                    )
//                }
//                Text5(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.CenterStart,
//                        offset = DpOffset(
//                            x = 60.0.dp,
//                            y = 0.0.dp
//                        )
//                    )
//                ) {
//                    Health(
//                        modifier = Modifier.boxAlign(
//                            alignment = Alignment.TopStart,
//                            offset = DpOffset(
//                                x = 0.0.dp,
//                                y = 9.0.dp
//                            )
//                        )
//                    )
//                    Class20240526(
//                        modifier = Modifier.boxAlign(
//                            alignment = Alignment.TopStart,
//                            offset = DpOffset(
//                                x = 0.0.dp,
//                                y = 25.0.dp
//                            )
//                        )
//                    )
//                    XYZClinic(
//                        modifier = Modifier.boxAlign(
//                            alignment = Alignment.TopStart,
//                            offset = DpOffset(
//                                x = 0.0.dp,
//                                y = -10.0.dp
//                            )
//                        )
//                    )
//                }
//                Ellipse3(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.Center,
//                        offset = DpOffset(
//                            x = -148.0.dp,
//                            y = -1.0.dp
//                        )
//                    )
//                )
//                AngleRight2(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.CenterStart,
//                        offset = DpOffset(
//                            x = 336.0.dp,
//                            y = -1.0.dp
//                        )
//                    )
//                ) {
//                    Vector7(
//                        modifier = Modifier
//                            .rowWeight(1.0f)
//                            .columnWeight(1.0f)
//                    )
//                }
//                Heartbeat(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.TopStart,
//                        offset = DpOffset(
//                            x = 20.0.dp,
//                            y = 28.0.dp
//                        )
//                    )
//                ) {
//                    Vector8(
//                        modifier = Modifier
//                            .rowWeight(1.0f)
//                            .columnWeight(1.0f)
//                    )
//                }
//            }
//            List3(
//                modifier = Modifier.boxAlign(
//                    alignment = Alignment.TopStart,
//                    offset = DpOffset(
//                        x = 0.0.dp,
//                        y = 598.0.dp
//                    )
//                )
//            ) {
//                Divider6 {}
//                Divider7(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.BottomStart,
//                        offset = DpOffset(
//                            x = 0.0.dp,
//                            y = 0.0.dp
//                        )
//                    )
//                ) {}
//                Text6(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.CenterEnd,
//                        offset = DpOffset(
//                            x = -33.0.dp,
//                            y = 0.0.dp
//                        )
//                    )
//                ) {
//                    Class35KGCO3(
//                        modifier = Modifier.boxAlign(
//                            alignment = Alignment.TopStart,
//                            offset = DpOffset(
//                                x = -31.0.dp,
//                                y = 19.0.dp
//                            )
//                        )
//                    )
//                    Class199Kr1(
//                        modifier = Modifier.boxAlign(
//                            alignment = Alignment.BottomStart,
//                            offset = DpOffset(
//                                x = -12.0.dp,
//                                y = -17.0.dp
//                            )
//                        )
//                    )
//                }
//                Text7(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.CenterStart,
//                        offset = DpOffset(
//                            x = 60.0.dp,
//                            y = 0.0.dp
//                        )
//                    )
//                ) {
//                    Health1(
//                        modifier = Modifier.boxAlign(
//                            alignment = Alignment.TopStart,
//                            offset = DpOffset(
//                                x = 0.0.dp,
//                                y = 9.0.dp
//                            )
//                        )
//                    )
//                    Class20240527(
//                        modifier = Modifier.boxAlign(
//                            alignment = Alignment.TopStart,
//                            offset = DpOffset(
//                                x = 0.0.dp,
//                                y = 25.0.dp
//                            )
//                        )
//                    )
//                    XYZClinic1(
//                        modifier = Modifier.boxAlign(
//                            alignment = Alignment.TopStart,
//                            offset = DpOffset(
//                                x = 0.0.dp,
//                                y = -10.0.dp
//                            )
//                        )
//                    )
//                }
//                Ellipse4(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.Center,
//                        offset = DpOffset(
//                            x = -148.0.dp,
//                            y = -1.0.dp
//                        )
//                    )
//                )
//                AngleRight3(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.CenterStart,
//                        offset = DpOffset(
//                            x = 336.0.dp,
//                            y = -1.0.dp
//                        )
//                    )
//                ) {
//                    Vector9(
//                        modifier = Modifier
//                            .rowWeight(1.0f)
//                            .columnWeight(1.0f)
//                    )
//                }
//                Heartbeat1(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.TopStart,
//                        offset = DpOffset(
//                            x = 20.0.dp,
//                            y = 28.0.dp
//                        )
//                    )
//                ) {
//                    Vector10(
//                        modifier = Modifier
//                            .rowWeight(1.0f)
//                            .columnWeight(1.0f)
//                    )
//                }
//            }

        }
    }

}

@Composable
private fun TransactionsList(item: TransactionItem) {
    List(
        modifier = Modifier
    ) {
        Divider {}
        Divider1(
            modifier = Modifier.boxAlign(
                alignment = Alignment.BottomStart,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 0.0.dp
                )
            )
        ) {}
        Text(
            modifier = Modifier.boxAlign(
                alignment = Alignment.CenterEnd,
                offset = DpOffset(
                    x = -33.0.dp,
                    y = 0.0.dp
                )
            )
        ) {
            CarbonPrint(
                item.carbonPoints,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = -10.0.dp,
                        y = 19.0.dp
                    )
                )
            )
            Amount(
                item.amount,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.BottomStart,
                    offset = DpOffset(
                        x = -12.0.dp,
                        y = -17.0.dp
                    )
                )
            )
        }
        Text1(
            modifier = Modifier.boxAlign(
                alignment = Alignment.CenterStart,
                offset = DpOffset(
                    x = 80.0.dp,
                    y = 0.0.dp
                )
            )
        ) {
            Category(
                item.category,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 9.0.dp
                    )
                )
            )
            DateOfTransaction(
                item.date,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 25.0.dp
                    )
                )
            )
            VendorName(
                item.vendor,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = -20.0.dp,
                        y = -10.0.dp
                    )
                )
            )
        }
        AngleRight(
            modifier = Modifier.boxAlign(
                alignment = Alignment.CenterStart,
                offset = DpOffset(
                    x = 380.0.dp,
                    y = -1.0.dp
                )
            )
        ) {
            Vector(
                modifier = Modifier
                    .rowWeight(1.0f)
                    .columnWeight(1.0f)
            )
        }
        RightIconBg(
            item.iconConfig,
            modifier = Modifier.boxAlign(
                alignment = Alignment.CenterStart,
                offset = DpOffset(
                    x = 16.0.dp,
                    y = 0.0.dp
                )
            )
        )
        RightIcon(
            modifier = Modifier.boxAlign(
                alignment = Alignment.CenterStart,
                offset = DpOffset(
                    x = 20.0.dp,
                    y = 0.0.dp
                )
            )
        ) {
//            Vector1(
//                modifier = Modifier
//                    .rowWeight(1.0f)
//                    .columnWeight(1.0f)
//            )
            VectorImage(
                item.iconConfig,
                modifier = Modifier
                    .rowWeight(1.0f)
                    .columnWeight(1.0f)
            )
        }
    }
}

@Preview()
@Composable
private fun TransactionsHomePreview() {
    MaterialTheme {
        RelayContainer {
            TransactionsHome(
            )
        }
    }
}

@Composable
fun AppBar1(modifier: Modifier = Modifier) {
//    RelayVector(
//        vector = painterResource(R.drawable.transactions_home_app_bar),
//        modifier = modifier
//            .fillMaxWidth()
//            .requiredHeight(56.0.dp)
//    )

    RelayContainer(
        backgroundColor = Color(0xFFFDF6EE),
        content = {  },
        modifier = modifier
            .fillMaxWidth()
            .requiredHeight(56.0.dp)
    )
}

@Composable
fun Transactions1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Transactions",
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
fun AppBar(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .fillMaxWidth()
            .requiredHeight(56.0.dp)
    )
}

@Composable
fun Transactions(modifier: Modifier = Modifier) {
    RelayText(
        content = "Transactions",
        fontSize = 16.0.sp,
        color = Color(
            alpha = 255,
            red = 251,
            green = 79,
            blue = 0
        ),
        height = 1.5.em,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier.wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Icon(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.transactions_home_icon),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 3.0.dp,
                    top = 6.0.dp,
                    end = 3.0.dp,
                    bottom = 6.0.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
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
        content = content,
        modifier = modifier
            .requiredWidth(24.0.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun StateLayer1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 8.0.dp),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun Container(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 10.0,
        radius = 100.0,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun LeadingIcon(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(48.0.dp)
            .requiredHeight(48.0.dp)
    )
}

@Composable
fun SupportingText(modifier: Modifier = Modifier) {
    RelayText(
        content = "Search transactions",
        fontSize = MaterialTheme.typography.bodyLarge.fontSize,
        fontFamily = MaterialTheme.typography.bodyLarge.fontFamily,
        color = MaterialTheme.colorScheme.onSurfaceVariant,
        height = MaterialTheme.typography.bodyLarge.lineHeight,
        letterSpacing = MaterialTheme.typography.bodyLarge.letterSpacing,
        textAlign = TextAlign.Left,
        fontWeight = MaterialTheme.typography.bodyLarge.fontWeight,
        modifier = modifier.wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Content(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Icon1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.transactions_home_icon1),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 3.0.dp,
                    top = 3.0.dp,
                    end = 3.509998321533203.dp,
                    bottom = 3.509998321533203.dp
                )
            )
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
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(24.0.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun StateLayer2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 8.0.dp),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun Container1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 10.0,
        radius = 100.0,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun Class1stTrailingIcon(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(48.0.dp)
            .requiredHeight(48.0.dp)
    )
}

@Composable
fun TrailingElements(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.End,
        arrangement = RelayContainerArrangement.Row,
        clipToParent = false,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun StateLayer(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 4.0.dp),
        itemSpacing = 4.0,
        clipToParent = false,
        content = content,
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun SearchBar1(
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
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 4.0,
        radius = 28.0,
        borderAlignment = BorderAlignment.Center,
        content = content,
        modifier = modifier
            .fillMaxWidth()
            .requiredHeight(56.0.dp)
    )
}

@Composable
fun SearchBar(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        clipToParent = false,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun Privatkonto(modifier: Modifier = Modifier) {
    RelayText(
        content = "Privatkonto",
        fontSize = 20.0.sp,
        color = Color(
            alpha = 255,
            red = 81,
            green = 43,
            blue = 43
        ),
        height = 1.2.em,
        textAlign = TextAlign.Right,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Class8417847246756(modifier: Modifier = Modifier) {
    RelayText(
        content = "8417-8,4 724 675-6",
        color = Color(
            alpha = 153,
            red = 81,
            green = 43,
            blue = 43
        ),
        height = 1.4285714721679688.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun AvailableAmount(modifier: Modifier = Modifier) {
    RelayText(
        content = "Available amount",
        color = Color(
            alpha = 153,
            red = 81,
            green = 43,
            blue = 43
        ),
        height = 1.4285714721679688.em,
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
            .requiredHeight(181.0.dp)
    )
}

@Composable
fun Rectangle30(modifier: Modifier = Modifier) {
    RelayContainer(
        backgroundColor = Color(0xFFDBF8ED),
        content = {  },
        modifier = modifier
            .fillMaxWidth()
            .requiredHeight(44.0.dp)
    )
}

@Composable
fun PayOrTransferFromAccount(modifier: Modifier = Modifier) {
    RelayText(
        content = "Pay or transfer from account",
        fontSize = 16.0.sp,
        color = Color(
            alpha = 255,
            red = 37,
            green = 120,
            blue = 134
        ),
        height = 1.5.em,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier.wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Divider(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 51,
            red = 56,
            green = 26,
            blue = 26
        ),
        isStructured = false,
        content = content,
        modifier = modifier
            .fillMaxWidth()
            .requiredHeight(1.0.dp)
    )
}

@Composable
fun Divider1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 51,
            red = 56,
            green = 26,
            blue = 26
        ),
        isStructured = false,
        content = content,
        modifier = modifier
            .fillMaxWidth()
            .requiredHeight(1.0.dp)
    )
}

@Composable
fun CarbonPrint(co2: Double?, modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            withStyle(style = SpanStyle(fontSize = 16.0.sp)) {
                append("$co2 kg")
            }
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 81,
                        green = 151,
                        blue = 27
                    ),
                    fontFamily = roboto,
                    fontSize = 16.0.sp,
                    fontWeight = FontWeight(400.0.toInt())
                )
            ) {
                append("2")
            }
        },
        color = Color(
            alpha = 255,
            red = 81,
            green = 151,
            blue = 27
        ),
        height = 1.4285714721679688.em,
        textAlign = TextAlign.Right,
        modifier = modifier
    )
}

@Composable
fun Amount(amount: Double?, modifier: Modifier = Modifier) {
    RelayText(
        content = "$amount",
        fontSize = 16.0.sp,
        color = Color(
            alpha = 255,
            red = 81,
            green = 43,
            blue = 43
        ),
        height = 1.5.em,
        textAlign = TextAlign.Right,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier
            .requiredWidth(55.0.dp)
            .requiredHeight(26.0.dp)
    )
}

@Composable
fun Text(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(52.0.dp)
            .requiredHeight(40.0.dp)
    )
}

@Composable
fun Category(category: String?, modifier: Modifier = Modifier) {
    RelayText(
        content = category.toString(),
        color = Color(
            alpha = 153,
            red = 81,
            green = 43,
            blue = 43
        ),
        height = 1.4285714721679688.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier
            .requiredWidth(96.0.dp)
            .requiredHeight(25.0.dp)
    )
}

@Composable
fun DateOfTransaction(date: String?, modifier: Modifier = Modifier) {
    RelayText(
        content = date.toString(),
        color = Color(
            alpha = 153,
            red = 81,
            green = 43,
            blue = 43
        ),
        height = 1.4285714721679688.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier
            .requiredWidth(96.0.dp)
            .requiredHeight(25.0.dp)
    )
}

@Composable
fun VendorName(name: String?, modifier: Modifier = Modifier) {
    RelayText(
        content = name.toString(),
        color = Color(
            alpha = 255,
            red = 81,
            green = 43,
            blue = 43
        ),
        height = 1.4285714721679688.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun Text1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(52.0.dp)
            .requiredHeight(40.0.dp)
    )
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.transactions_home_vector),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 9.0.dp,
                    top = 7.0.dp,
                    end = 8.0.dp,
                    bottom = 7.0.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun AngleRight(
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
fun RightIconBg(iconConfig: IconConfig?, modifier: Modifier = Modifier) {
    RelayVector(
//        vector = painterResource(R.drawable.transactions_home_ellipse_1),
        vector = painterResource(iconConfig?.iconBgColor ?: R.drawable.transactions_home_ellipse_1),
        modifier = modifier
            .requiredWidth(32.0.dp)
            .requiredHeight(32.0.dp)
    )
}

@Composable
fun Vector1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.transactions_home_vector1),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 4.0.dp,
                    top = 5.0.dp,
                    end = 4.0.dp,
                    bottom = 12.599999904632568.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun VectorImage(iconConfig: IconConfig?, modifier: Modifier = Modifier) {
    RelayVector(
//        vector = painterResource(R.drawable.transactions_home_vector2),
        vector = painterResource(iconConfig?.iconDrawable ?: R.drawable.transactions_home_vector2),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 6.0.dp,
                    top = 8.0.dp,
                    end = 6.0.dp,
                    bottom = 5.0.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun RightIcon(
    modifier: Modifier = Modifier,
    content: @Composable() (RelayContainerScope.() -> Unit),
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
fun List(
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
            .fillMaxWidth()
            .requiredHeight(80.0.dp)
    )
}

@Composable
fun AddTransactionList(
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
            .fillMaxWidth()
            .requiredHeight(205.0.dp)
    )
}

@Composable
fun Divider2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 51,
            red = 56,
            green = 26,
            blue = 26
        ),
        isStructured = false,
        content = content,
        modifier = modifier
            .fillMaxWidth()
            .requiredHeight(1.0.dp)
    )
}

@Composable
fun Divider3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 51,
            red = 56,
            green = 26,
            blue = 26
        ),
        isStructured = false,
        content = content,
        modifier = modifier
            .fillMaxWidth()
            .requiredHeight(1.0.dp)
    )
}

@Composable
fun Class5KGCO2(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 197,
                        green = 19,
                        blue = 28
                    ),
                    fontSize = 16.0.sp
                )
            ) {
                append("5KG CO")
            }
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 197,
                        green = 19,
                        blue = 28
                    ),
                    fontFamily = roboto,
                    fontSize = 16.0.sp,
                    fontWeight = FontWeight(400.0.toInt())
                )
            ) {
                append("2")
            }
        },
        color = Color(
            alpha = 255,
            red = 81,
            green = 151,
            blue = 27
        ),
        height = 1.4285714721679688.em,
        textAlign = TextAlign.Right,
        modifier = modifier
    )
}

@Composable
fun Class500Kr(modifier: Modifier = Modifier) {
    RelayText(
        content = "-500 kr",
        fontSize = 16.0.sp,
        color = Color(
            alpha = 255,
            red = 81,
            green = 43,
            blue = 43
        ),
        height = 1.5.em,
        textAlign = TextAlign.Right,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier
            .requiredWidth(55.0.dp)
            .requiredHeight(26.0.dp)
    )
}

@Composable
fun Text2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(52.0.dp)
            .requiredHeight(40.0.dp)
    )
}

@Composable
fun Transportation(modifier: Modifier = Modifier) {
    RelayText(
        content = "Transportation",
        color = Color(
            alpha = 153,
            red = 81,
            green = 43,
            blue = 43
        ),
        height = 1.4285714721679688.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier
            .requiredWidth(96.0.dp)
            .requiredHeight(25.0.dp)
    )
}

@Composable
fun Class20240525(modifier: Modifier = Modifier) {
    RelayText(
        content = "2024-05-24",
        color = Color(
            alpha = 153,
            red = 81,
            green = 43,
            blue = 43
        ),
        height = 1.4285714721679688.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier
            .requiredWidth(96.0.dp)
            .requiredHeight(25.0.dp)
    )
}

@Composable
fun Uber(modifier: Modifier = Modifier) {
    RelayText(
        content = "Uber",
        color = Color(
            alpha = 255,
            red = 81,
            green = 43,
            blue = 43
        ),
        height = 1.4285714721679688.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun Text3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(52.0.dp)
            .requiredHeight(40.0.dp)
    )
}

@Composable
fun Vector3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.transactions_home_vector3),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 9.0.dp,
                    top = 7.0.dp,
                    end = 8.0.dp,
                    bottom = 7.0.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun AngleRight1(
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
fun Vector4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.transactions_home_vector4),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 4.0.dp,
                    top = 5.0.dp,
                    end = 4.0.dp,
                    bottom = 12.599999904632568.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector5(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.transactions_home_vector5),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 6.0.dp,
                    top = 8.0.dp,
                    end = 6.0.dp,
                    bottom = 5.0.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Home1(
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
fun Ellipse2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.transactions_home_ellipse_2),
        modifier = modifier
            .requiredWidth(32.0.dp)
            .requiredHeight(32.0.dp)
    )
}

@Composable
fun Vector6(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.transactions_home_vector6),
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
fun List1(
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
            .fillMaxWidth()
            .requiredHeight(80.0.dp)
    )
}

@Composable
fun Divider4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 51,
            red = 56,
            green = 26,
            blue = 26
        ),
        isStructured = false,
        content = content,
        modifier = modifier
            .fillMaxWidth()
            .requiredHeight(1.0.dp)
    )
}

@Composable
fun Divider5(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 51,
            red = 56,
            green = 26,
            blue = 26
        ),
        isStructured = false,
        content = content,
        modifier = modifier
            .fillMaxWidth()
            .requiredHeight(1.0.dp)
    )
}

@Composable
fun Class35KGCO2(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 253,
                        green = 201,
                        blue = 42
                    ),
                    fontSize = 16.0.sp
                )
            ) {
                append("3.5KG CO")
            }
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 253,
                        green = 201,
                        blue = 42
                    ),
                    fontFamily = roboto,
                    fontSize = 16.0.sp,
                    fontWeight = FontWeight(400.0.toInt())
                )
            ) {
                append("2")
            }
        },
        color = Color(
            alpha = 255,
            red = 81,
            green = 151,
            blue = 27
        ),
        height = 1.4285714721679688.em,
        textAlign = TextAlign.Right,
        modifier = modifier
    )
}

@Composable
fun Class199Kr(modifier: Modifier = Modifier) {
    RelayText(
        content = "-199 Kr",
        fontSize = 16.0.sp,
        color = Color(
            alpha = 255,
            red = 81,
            green = 43,
            blue = 43
        ),
        height = 1.5.em,
        textAlign = TextAlign.Right,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier
            .requiredWidth(55.0.dp)
            .requiredHeight(26.0.dp)
    )
}

@Composable
fun Text4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(52.0.dp)
            .requiredHeight(40.0.dp)
    )
}

@Composable
fun Health(modifier: Modifier = Modifier) {
    RelayText(
        content = "Health",
        color = Color(
            alpha = 153,
            red = 81,
            green = 43,
            blue = 43
        ),
        height = 1.4285714721679688.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier
            .requiredWidth(96.0.dp)
            .requiredHeight(25.0.dp)
    )
}

@Composable
fun Class20240526(modifier: Modifier = Modifier) {
    RelayText(
        content = "2024-05-24",
        color = Color(
            alpha = 153,
            red = 81,
            green = 43,
            blue = 43
        ),
        height = 1.4285714721679688.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier
            .requiredWidth(96.0.dp)
            .requiredHeight(25.0.dp)
    )
}

@Composable
fun XYZClinic(modifier: Modifier = Modifier) {
    RelayText(
        content = "XYZ Clinic",
        color = Color(
            alpha = 255,
            red = 81,
            green = 43,
            blue = 43
        ),
        height = 1.4285714721679688.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun Text5(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(52.0.dp)
            .requiredHeight(40.0.dp)
    )
}

@Composable
fun Ellipse3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.transactions_home_ellipse_3),
        modifier = modifier
            .requiredWidth(32.0.dp)
            .requiredHeight(32.0.dp)
    )
}

@Composable
fun Vector7(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.transactions_home_vector7),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 9.0.dp,
                    top = 7.0.dp,
                    end = 8.0.dp,
                    bottom = 7.0.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun AngleRight2(
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
fun Vector8(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.transactions_home_vector8),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 1.5.dp,
                    top = 3.75.dp,
                    end = 1.5.dp,
                    bottom = 2.2504959106445312.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Heartbeat(
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
fun List2(
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
            .fillMaxWidth()
            .requiredHeight(80.0.dp)
    )
}

@Composable
fun Divider6(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 51,
            red = 56,
            green = 26,
            blue = 26
        ),
        isStructured = false,
        content = content,
        modifier = modifier
            .fillMaxWidth()
            .requiredHeight(1.0.dp)
    )
}

@Composable
fun Divider7(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 51,
            red = 56,
            green = 26,
            blue = 26
        ),
        isStructured = false,
        content = content,
        modifier = modifier
            .fillMaxWidth()
            .requiredHeight(1.0.dp)
    )
}

@Composable
fun Class35KGCO3(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 253,
                        green = 201,
                        blue = 42
                    ),
                    fontSize = 16.0.sp
                )
            ) {
                append("3.5KG CO")
            }
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 253,
                        green = 201,
                        blue = 42
                    ),
                    fontFamily = roboto,
                    fontSize = 16.0.sp,
                    fontWeight = FontWeight(400.0.toInt())
                )
            ) {
                append("2")
            }
        },
        color = Color(
            alpha = 255,
            red = 81,
            green = 151,
            blue = 27
        ),
        height = 1.4285714721679688.em,
        textAlign = TextAlign.Right,
        modifier = modifier
    )
}

@Composable
fun Class199Kr1(modifier: Modifier = Modifier) {
    RelayText(
        content = "-199 Kr",
        fontSize = 16.0.sp,
        color = Color(
            alpha = 255,
            red = 81,
            green = 43,
            blue = 43
        ),
        height = 1.5.em,
        textAlign = TextAlign.Right,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier
            .requiredWidth(55.0.dp)
            .requiredHeight(26.0.dp)
    )
}

@Composable
fun Text6(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(52.0.dp)
            .requiredHeight(40.0.dp)
    )
}

@Composable
fun Health1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Health",
        color = Color(
            alpha = 153,
            red = 81,
            green = 43,
            blue = 43
        ),
        height = 1.4285714721679688.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier
            .requiredWidth(96.0.dp)
            .requiredHeight(25.0.dp)
    )
}

@Composable
fun Class20240527(modifier: Modifier = Modifier) {
    RelayText(
        content = "2024-05-24",
        color = Color(
            alpha = 153,
            red = 81,
            green = 43,
            blue = 43
        ),
        height = 1.4285714721679688.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier
            .requiredWidth(96.0.dp)
            .requiredHeight(25.0.dp)
    )
}

@Composable
fun XYZClinic1(modifier: Modifier = Modifier) {
    RelayText(
        content = "XYZ Clinic",
        color = Color(
            alpha = 255,
            red = 81,
            green = 43,
            blue = 43
        ),
        height = 1.4285714721679688.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun Text7(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(52.0.dp)
            .requiredHeight(40.0.dp)
    )
}

@Composable
fun Ellipse4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.transactions_home_ellipse_4),
        modifier = modifier
            .requiredWidth(32.0.dp)
            .requiredHeight(32.0.dp)
    )
}

@Composable
fun Vector9(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.transactions_home_vector9),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 9.0.dp,
                    top = 7.0.dp,
                    end = 8.0.dp,
                    bottom = 7.0.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun AngleRight3(
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
fun Vector10(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.transactions_home_vector10),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 1.5.dp,
                    top = 3.75.dp,
                    end = 1.5.dp,
                    bottom = 2.2504959106445312.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Heartbeat1(
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
fun List3(
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
            .fillMaxWidth()
            .requiredHeight(80.0.dp)
    )
}

@Composable
fun Icon3(
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
fun Label(modifier: Modifier = Modifier) {
    RelayText(
        content = "Home",
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
fun Icon4(
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
fun Label1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Track",
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
        vector = painterResource(R.drawable.transactions_home_rectangle),
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
fun MaterialYouBottomNavigationBar(
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
        content = content,
        modifier = modifier.fillMaxWidth()
    )
}

@Composable
fun Vector13(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.transactions_home_vector11),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 1.49957275390625.dp,
                    top = 4.5.dp,
                    end = 1.500009536743164.dp,
                    bottom = 5.999582290649414.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun TrendUp(
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
fun Vector14(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.transactions_home_vector12),
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
fun House(
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
        modifier = modifier.fillMaxSize()
    )
}
