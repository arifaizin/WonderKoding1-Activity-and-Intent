package com.dicoding.picodiploma.barvolume

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_move.*

class MoveActivity : AppCompatActivity() {

    companion object{
        const val KEY_QUESTION = "question"
        const val KEY_ANSWER = "answer"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move)

        val dataQuestion = intent.getStringExtra(KEY_QUESTION)
        val dataAnswer = intent.getDoubleExtra(KEY_ANSWER, 0.0)

        Log.d("MoveActivity", dataQuestion+dataAnswer)

        tvQuestion.text = dataQuestion
        tvAnswer.text = dataAnswer.toString()

    }
}
