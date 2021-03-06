package com.example.pinz.finaltest

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app1.*

class app1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.app1)

        // Example of a call to a native method


        var y = 0
        var x = 0

        btok.setOnClickListener() {

            if (x == 0) {
                y = y + 1
                num.setText("" + y)
            }
            if (y == 5) {
                val intent = Intent(this, Mainpage2::class.java)
                startActivity(intent)
            }

        }
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {

        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
    }
}
