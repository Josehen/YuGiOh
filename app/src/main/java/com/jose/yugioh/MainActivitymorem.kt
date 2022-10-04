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
        val buttonm6 = findViewById<ImageButton>(R.id.buttonm6)
        val buttonm7 = findViewById<ImageButton>(R.id.buttonm7)
        val buttonm8 = findViewById<ImageButton>(R.id.buttonm8)
        val buttonm9 = findViewById<ImageButton>(R.id.buttonm9)
        val buttonm10 = findViewById<ImageButton>(R.id.buttonm10)
        val buttonm11 = findViewById<ImageButton>(R.id.buttonm11)
        val buttonm12 = findViewById<ImageButton>(R.id.buttonm12)

        buttonm1.setOnClickListener{

            IrParaTelam1()
        }
        buttonm2.setOnClickListener{

            IrParaTelam2()
        }
        buttonm3.setOnClickListener{

            IrParaTelam3()
        }
        buttonm4.setOnClickListener{

            IrParaTelam4()
        }
        buttonm5.setOnClickListener{

            IrParaTelam5()
        }
        buttonm6.setOnClickListener{

            IrParaTelam6()
        }
        buttonm7.setOnClickListener{

            IrParaTelam7()
        }
        buttonm8.setOnClickListener{

            IrParaTelam8()
        }
        buttonm9.setOnClickListener{

            IrParaTelam9()
        }
        buttonm10.setOnClickListener{

            IrParaTelam10()
        }
        buttonm11.setOnClickListener{

            IrParaTelam11()
        }
        buttonm12.setOnClickListener{

            IrParaTelam12()
        }

    }
    private fun IrParaTelam1() {

        val mainActivity2 = Intent(this, MainActivitym1::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTelam2() {

        val mainActivity2 = Intent(this, MainActivitym2::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTelam3() {

        val mainActivity2 = Intent(this, MainActivitym3::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTelam4() {

        val mainActivity2 = Intent(this, MainActivitym4::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTelam5() {

        val mainActivity2 = Intent(this, MainActivitym5::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTelam6() {

        val mainActivity2 = Intent(this, MainActivitym6::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTelam7() {

        val mainActivity2 = Intent(this, MainActivitym7::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTelam8() {

        val mainActivity2 = Intent(this, MainActivitym8::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTelam9() {

        val mainActivity2 = Intent(this, MainActivitym9::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTelam10() {

        val mainActivity2 = Intent(this, MainActivitym10::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTelam11() {

        val mainActivity2 = Intent(this, MainActivitym11::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTelam12() {

        val mainActivity2 = Intent(this, MainActivitym12::class.java)
        startActivity(mainActivity2)
    }
}