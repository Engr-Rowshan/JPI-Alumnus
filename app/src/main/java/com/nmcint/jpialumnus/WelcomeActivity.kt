package com.nmcint.jpialumnus

import android.content.Context
import android.content.Intent
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_welcome)
        val context: Context = applicationContext

        try {
            val pInfo: PackageInfo = context.packageManager.getPackageInfo(packageName, 0)
            val version = pInfo.versionName
            val txtVersion: TextView = findViewById(R.id.txtAppVersion)
            txtVersion.text = version
        } catch (e: PackageManager.NameNotFoundException) {
            e.printStackTrace()
        }
    }

    fun openRegisterActivity() {
        val registerIntent : Intent = Intent(this, RegisterActivity::class.java)
        startActivity(registerIntent)
    }

    override fun onResume() {
        super.onResume()
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
    }

    fun openRegisterActivity(view: View) {
        openRegisterActivity()
    }
}