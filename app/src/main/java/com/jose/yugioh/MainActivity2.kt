package com.jose.yugioh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        supportActionBar!!.hide()

        val buttonm1 = findViewById<ImageButton>(R.id.buttonm1)
        val buttonm2 = findViewById<ImageButton>(R.id.buttonm2)
        val buttonm3 = findViewById<ImageButton>(R.id.buttonm3)
        val buttonm4 = findViewById<ImageButton>(R.id.buttonm4)
        val buttonm5 = findViewById<ImageButton>(R.id.buttonm5)
        val buttonma1 = findViewById<ImageButton>(R.id.buttonma1)
        val buttonma2 = findViewById<ImageButton>(R.id.buttonma2)
        val buttonma3 = findViewById<ImageButton>(R.id.buttonma3)
        val buttonma4 = findViewById<ImageButton>(R.id.buttonma4)
        val buttonma5 = findViewById<ImageButton>(R.id.buttonma5)
        val buttonar1 = findViewById<ImageButton>(R.id.buttonar1)
        val buttonar2 = findViewById<ImageButton>(R.id.buttonar2)
        val buttonar3 = findViewById<ImageButton>(R.id.buttonar3)
        val buttonar4 = findViewById<ImageButton>(R.id.buttonar4)
        val buttonar5 = findViewById<ImageButton>(R.id.buttonar5)
        val buttonm = findViewById<ImageButton>(R.id.buttonm)
        val buttonma = findViewById<ImageButton>(R.id.buttonma)
        val buttonar = findViewById<ImageButton>(R.id.buttonar)

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
        buttonm.setOnClickListener{

            IrParaTelamorem()
        }
        buttonma.setOnClickListener{

            IrParaTelamorema()
        }
        buttonar.setOnClickListener{

            IrParaTelamorear()
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
    private fun IrParaTelamorem() {

        val mainActivity2 = Intent(this, MainActivitymorem::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTelamorema() {

        val mainActivity2 = Intent(this, MainActivitymorema::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTelamorear() {

        val mainActivity2 = Intent(this, MainActivitymorear::class.java)
        startActivity(mainActivity2)
    }
}