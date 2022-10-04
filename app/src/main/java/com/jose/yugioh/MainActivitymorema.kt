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
        val buttonma6 = findViewById<ImageButton>(R.id.buttonma6)
        val buttonma7 = findViewById<ImageButton>(R.id.buttonma7)
        val buttonma8 = findViewById<ImageButton>(R.id.buttonma8)
        val buttonma9 = findViewById<ImageButton>(R.id.buttonma9)
        val buttonma10 = findViewById<ImageButton>(R.id.buttonma10)
        val buttonma11 = findViewById<ImageButton>(R.id.buttonma11)
        val buttonma12 = findViewById<ImageButton>(R.id.buttonma12)

        buttonma1.setOnClickListener{

            IrParaTelama1()
        }
        buttonma2.setOnClickListener{

            IrParaTelama2()
        }
        buttonma3.setOnClickListener{

            IrParaTelama3()
        }
        buttonma4.setOnClickListener{

            IrParaTelama4()
        }
        buttonma5.setOnClickListener{

            IrParaTelama5()
        }
        buttonma6.setOnClickListener{

            IrParaTelama6()
        }
        buttonma7.setOnClickListener{

            IrParaTelama7()
        }
        buttonma8.setOnClickListener{

            IrParaTelama8()
        }
        buttonma9.setOnClickListener{

            IrParaTelama9()
        }
        buttonma10.setOnClickListener{

            IrParaTelama10()
        }
        buttonma11.setOnClickListener{

            IrParaTelama11()
        }
        buttonma12.setOnClickListener{

            IrParaTelama12()
        }

    }
    private fun IrParaTelama1() {

        val mainActivity2 = Intent(this, MainActivityma1::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTelama2() {

        val mainActivity2 = Intent(this, MainActivityma2::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTelama3() {

        val mainActivity2 = Intent(this, MainActivityma3::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTelama4() {

        val mainActivity2 = Intent(this, MainActivityma4::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTelama5() {

        val mainActivity2 = Intent(this, MainActivityma5::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTelama6() {

        val mainActivity2 = Intent(this, MainActivityma6::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTelama7() {

        val mainActivity2 = Intent(this, MainActivityma7::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTelama8() {

        val mainActivity2 = Intent(this, MainActivityma8::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTelama9() {

        val mainActivity2 = Intent(this, MainActivityma9::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTelama10() {

        val mainActivity2 = Intent(this, MainActivityma10::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTelama11() {

        val mainActivity2 = Intent(this, MainActivityma11::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTelama12() {

        val mainActivity2 = Intent(this, MainActivityma12::class.java)
        startActivity(mainActivity2)
    }
}