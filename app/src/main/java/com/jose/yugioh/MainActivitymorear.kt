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
        val buttonar6 = findViewById<ImageButton>(R.id.buttonar6)
        val buttonar7 = findViewById<ImageButton>(R.id.buttonar7)
        val buttonar8 = findViewById<ImageButton>(R.id.buttonar8)
        val buttonar9 = findViewById<ImageButton>(R.id.buttonar9)
        val buttonar10 = findViewById<ImageButton>(R.id.buttonar10)
        val buttonar11 = findViewById<ImageButton>(R.id.buttonar11)
        val buttonar12 = findViewById<ImageButton>(R.id.buttonar12)

        buttonar1.setOnClickListener{

            IrParaTelaar1()
        }
        buttonar2.setOnClickListener{

            IrParaTelaar2()
        }
        buttonar3.setOnClickListener{

            IrParaTelaar3()
        }
        buttonar4.setOnClickListener{

            IrParaTelaar4()
        }
        buttonar5.setOnClickListener{

            IrParaTelaar5()
        }
        buttonar6.setOnClickListener{

            IrParaTelaar6()
        }
        buttonar7.setOnClickListener{

            IrParaTelaar7()
        }
        buttonar8.setOnClickListener{

            IrParaTelaar8()
        }
        buttonar9.setOnClickListener{

            IrParaTelaar9()
        }
        buttonar10.setOnClickListener{

            IrParaTelaar10()
        }
        buttonar11.setOnClickListener{

            IrParaTelaar11()
        }
        buttonar12.setOnClickListener{

            IrParaTelaar12()
        }


    }
    private fun IrParaTelaar1() {

        val mainActivity2 = Intent(this, MainActivityar1::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTelaar2() {

        val mainActivity2 = Intent(this, MainActivityar2::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTelaar3() {

        val mainActivity2 = Intent(this, MainActivityar3::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTelaar4() {

        val mainActivity2 = Intent(this, MainActivityar4::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTelaar5() {

        val mainActivity2 = Intent(this, MainActivityar5::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTelaar6() {

        val mainActivity2 = Intent(this, MainActivityar6::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTelaar7() {

        val mainActivity2 = Intent(this, MainActivityar7::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTelaar8() {

        val mainActivity2 = Intent(this, MainActivityar8::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTelaar9() {

        val mainActivity2 = Intent(this, MainActivityar9::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTelaar10() {

        val mainActivity2 = Intent(this, MainActivityar10::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTelaar11() {

        val mainActivity2 = Intent(this, MainActivityar11::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTelaar12() {

        val mainActivity2 = Intent(this, MainActivityar12::class.java)
        startActivity(mainActivity2)
    }

}
