package com.kamran.screenshotprevention


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.DialogProperties
import androidx.compose.ui.window.SecureFlagPolicy

@Composable
fun CouponDialog(onDismiss: () -> Unit) {
    AlertDialog(
        onDismissRequest = onDismiss,
        text = {
            Image(
                painter = painterResource(id = R.drawable.qr_code),
                contentDescription = "QR Code",
                modifier = Modifier.padding(16.dp)
            )
        },
        buttons = {
            Button(
                modifier = Modifier.fillMaxWidth().padding(16.dp),
                onClick = onDismiss,
                content = { Text("Close") }
            )
        },
        properties = DialogProperties(
            securePolicy = SecureFlagPolicy.SecureOn,
        )
    )
}