package com.neppplus.loginkotlintext_20210313

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {

//            그 안에서
//            1. 아이디 / 비번에 적힌 값 => 변수 2개로 저장
            val inputId = idEdt.text.toString()
            val inputPw = pwEdt.text.toString()




            }


        }

    }
}