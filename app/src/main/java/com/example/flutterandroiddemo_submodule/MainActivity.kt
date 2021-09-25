package com.example.flutterandroiddemo_submodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import io.flutter.embedding.android.FlutterActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun forward2Flutter(view: View) {
        /*startActivity(FlutterActivity
            .createDefaultIntent(this))*/
        startActivity(
            FlutterActivity
                .withNewEngine()
                .initialRoute("/page_2")
                .build(this))
    }
}