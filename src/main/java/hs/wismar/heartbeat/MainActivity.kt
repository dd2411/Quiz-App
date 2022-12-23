package hs.wismar.heartbeat

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.location.LocationManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.text.BoringLayout.make
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.location.LocationManagerCompat.isLocationEnabled

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart : Button = findViewById(R.id.btn_Start)
        val etMobileNumber : EditText = findViewById(R.id.et_MobileNumber)

        btnStart.setOnClickListener {

            if(etMobileNumber.text.isEmpty()){
                Toast.makeText(this,
                   "Please enter your Mobile Number", Toast.LENGTH_LONG).show()

            }else{
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.Mobile_Number, etMobileNumber.text.toString())
                startActivity(intent)
                finish()

            }

        }


    }

}



