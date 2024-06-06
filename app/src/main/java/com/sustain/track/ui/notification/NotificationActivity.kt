package com.sustain.track.ui.notification

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.sustain.track.ui.notification.NotificationUtils.INTENT_FROM_NOTIFICATION_KEY
import com.sustain.track.ui.screens.TopBar
import com.sustain.track.ui.screens.track.NewTrackScreen
import com.sustain.track.ui.theme.SustainTrackTheme

class NotificationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val isLaunchedFromNotification =
                intent.getBooleanExtra(INTENT_FROM_NOTIFICATION_KEY, false)
            SustainTrackTheme {
                Scaffold(
                    topBar = { TopBar(title = "SustainTrack") },
                ) { innerPadding ->
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                    ) {
                        NewTrackScreen(isLaunchedFromNotification = isLaunchedFromNotification)
                    }
                }
            }
        }
    }
}
