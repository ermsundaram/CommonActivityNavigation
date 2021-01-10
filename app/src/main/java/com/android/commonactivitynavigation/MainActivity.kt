package com.android.commonactivitynavigation

import android.os.Bundle
import android.widget.Button
import com.buddi.life.BaseActivity

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button = findViewById<Button>(R.id.navigateBtn)
        button.setOnClickListener {
            var bundle = Bundle()
            bundle.putString("","")
            navigateActivity(SecondActivity::class,bundle)
        }
    }
}