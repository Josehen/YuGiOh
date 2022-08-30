package com.jose.yugioh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivitymorear : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activitymorear)
        supportActionBar!!.hide()

        val buttonar1 = findViewById<ImageButton>(R.id.buttonar1)
        val buttonar2 = findViewById<ImageButton>(R.id.buttonar2)
        val buttonar3 = findViewById<ImageButton>(R.id.buttonar3)
        val buttonar4 = findViewById<ImageButton>(R.id.buttonar4)
        val buttonar5 = findViewById<ImageButton>(R.id.buttonar5)

        buttonar1.setOnClickListener{

            IrParaTela11()
        }
        buttonar2.setOnClickListener{

            IrParaTela12()
        }
        buttonar3.setOnClickListener{

            IrParaTela13()
        }
        buttonar4.setOnClickListener{

            IrParaTela14()
        }
        buttonar5.setOnClickListener{

            IrParaTela15()
        }
    }
    private fun IrParaTela11() {

        val mainActivity2 = Intent(this, MainActivityar1::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela12() {

        val mainActivity2 = Intent(this, MainActivityar2::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela13() {

        val mainActivity2 = Intent(this, MainActivityar3::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela14() {

        val mainActivity2 = Intent(this, MainActivityar4::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela15() {

        val mainActivity2 = Intent(this, MainActivityar5::class.java)
        startActivity(mainActivity2)
    }
}