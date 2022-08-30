package com.jose.yugioh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivitymorema : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activitymorema)
        supportActionBar!!.hide()
        val buttonma1 = findViewById<ImageButton>(R.id.buttonma1)
        val buttonma2 = findViewById<ImageButton>(R.id.buttonma2)
        val buttonma3 = findViewById<ImageButton>(R.id.buttonma3)
        val buttonma4 = findViewById<ImageButton>(R.id.buttonma4)
        val buttonma5 = findViewById<ImageButton>(R.id.buttonma5)

        buttonma1.setOnClickListener{

            IrParaTela6()
        }
        buttonma2.setOnClickListener{

            IrParaTela7()
        }
        buttonma3.setOnClickListener{

            IrParaTela8()
        }
        buttonma4.setOnClickListener{

            IrParaTela9()
        }
        buttonma5.setOnClickListener{

            IrParaTela10()
        }
    }
    private fun IrParaTela6() {

        val mainActivity2 = Intent(this, MainActivityma1::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela7() {

        val mainActivity2 = Intent(this, MainActivityma2::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela8() {

        val mainActivity2 = Intent(this, MainActivityma3::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela9() {

        val mainActivity2 = Intent(this, MainActivityma4::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela10() {

        val mainActivity2 = Intent(this, MainActivityma5::class.java)
        startActivity(mainActivity2)
    }
}