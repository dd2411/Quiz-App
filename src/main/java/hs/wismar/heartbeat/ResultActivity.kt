package hs.wismar.heartbeat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.net.CookiePolicy

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName: TextView = findViewById(R.id.tv_name)
        val btnFinish: Button = findViewById(R.id.btn_Finish)

        tvName.text = intent.getStringExtra(Constants.Mobile_Number)

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)

        btnFinish.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))

        }



    }
}