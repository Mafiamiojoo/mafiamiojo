
package com.mafiamiojo.overlay

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = Intent(this, OverlayService::class.java)
        startService(intent)

        val launchIntent = packageManager.getLaunchIntentForPackage("com.miniclip.eightballpool")
        launchIntent?.let {
            startActivity(it)
        }

        finish()
    }
}
