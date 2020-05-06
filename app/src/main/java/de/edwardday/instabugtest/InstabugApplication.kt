package de.edwardday.instabugtest

import android.app.Application
import com.instabug.library.Instabug
import com.instabug.library.invocation.InstabugInvocationEvent

class InstabugApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        val appToken = "APP TOKEN"

        Instabug.Builder(this, appToken)
            .setInvocationEvents(InstabugInvocationEvent.FLOATING_BUTTON)
            .build()
    }
}
