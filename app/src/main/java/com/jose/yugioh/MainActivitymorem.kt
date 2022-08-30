package com.jose.yugioh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivitymorem : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activitymorem)
        supportActionBar!!.hide()
        val buttonm1 = findViewById<ImageButton>(R.id.buttonm1)
        val buttonm2 = findViewById<ImageButton>(R.id.buttonm2)
        val buttonm3 = findViewById<ImageButton>(R.id.buttonm3)
        val buttonm4 = findViewById<ImageButton>(R.id.buttonm4)
        val buttonm5 = findViewById<ImageButton>(R.id.buttonm5)

        buttonm1.setOnClickListener{

            IrParaTela1()
        }
        buttonm2.setOnClickListener{

            IrParaTela2()
        }
        buttonm3.setOnClickListener{

            IrParaTela3()
        }
        buttonm4.setOnClickListener{

            IrParaTela4()
        }
        buttonm5.setOnClickListener{

            IrParaTela5()
        }
    }
    private fun IrParaTela1() {

        val mainActivity2 = Intent(this, MainActivitym1::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela2() {

        val mainActivity2 = Intent(this, MainActivitym2::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela3() {

        val mainActivity2 = Intent(this, MainActivitym3::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela4() {

        val mainActivity2 = Intent(this, MainActivitym4::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela5() {

        val mainActivity2 = Intent(this, MainActivitym5::class.java)
        startActivity(mainActivity2)
    }
}