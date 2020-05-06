package de.edwardday.instabugtest

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class LauncherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)
    }

    override fun onResume() {
        super.onResume()

        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
        }, 10_000)
    }
}
