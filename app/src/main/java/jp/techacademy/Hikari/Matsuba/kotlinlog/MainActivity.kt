package jp.techacademy.Hikari.Matsuba.kotlinlog

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.util.Log


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("平井", 23)
        human.say()
        human.think()

    }

}

