package com.dicoding.picodiploma.barvolume

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_move.*

class MoveActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move)

        val dataQuestion = intent.getStringExtra("KEY_QUESTION")
        val dataAnswer = intent.getDoubleExtra("KEY_ANSWER", 0.0)

        tvQuestion.text = dataQuestion
        tvAnswer.text = dataAnswer.toString()

    }
}
