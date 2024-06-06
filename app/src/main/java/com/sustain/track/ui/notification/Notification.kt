package com.sustain.track.ui.notification

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.core.app.NotificationCompat
import com.sustain.track.R

object NotificationUtils {

    private const val CHANNEL_ID = "SustainTrack_channel_id"
    const val INTENT_FROM_NOTIFICATION_KEY = "from_notification"

    fun showNotification(context: Context, title: String, content: String) {

        val activityActionIntent = Intent(context, NotificationActivity::class.java).apply {
            this.putExtra(INTENT_FROM_NOTIFICATION_KEY, true)
            flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
        }
        val pendingIntentFlag = PendingIntent.FLAG_IMMUTABLE
        val requestCode = 0
        val activityActionPendingIntent: PendingIntent = PendingIntent.getActivity(
            context,
            requestCode,
            activityActionIntent,
            pendingIntentFlag
        )

        val builder = NotificationCompat.Builder(context, CHANNEL_ID)
            .setContentTitle(title)
            .setContentText(content)
            .setSmallIcon(R.drawable.ic_car_gray)
            .setContentIntent(activityActionPendingIntent)

        val notificationManager =
            context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                CHANNEL_ID,
                "Transactions",
                NotificationManager.IMPORTANCE_DEFAULT
            )
            notificationManager.createNotificationChannel(channel)
        }

        notificationManager.notify(0, builder.build())
    }
}