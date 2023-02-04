package com.kamran.screenshotprevention

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kamran.screenshotprevention.ui.theme.ScreenshotPreventionTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScreenshotPreventionTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        Text(text = "Screenshot Prevention Demo", modifier = Modifier.padding(16.dp))
                        showCouponDialog()
                    }
                }
            }
        }
    }

    @Composable
    fun showCouponDialog() {
        var showCouponDialog by remember { mutableStateOf(false) }
        Button(
            onClick = {
                showCouponDialog = true
            },
            content = { Text("Show Coupon") }
        )
        if (showCouponDialog) {
            CouponDialog {
                showCouponDialog = false
            }
        }
    }
}

