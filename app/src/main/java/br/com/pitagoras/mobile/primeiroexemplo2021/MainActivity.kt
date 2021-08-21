package br.com.pitagoras.mobile.primeiroexemplo2021

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            cliqueDoBotao()
        }
    }

    private fun cliqueDoBotao() {
        Toast.makeText(this, getString(R.string.msg_texto), Toast.LENGTH_SHORT).show()

        val textview = findViewById<TextView>(R.id.textView)
        textview.text = "O botão foi acionado"
    }
}