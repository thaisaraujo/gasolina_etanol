package com.example.gasolinaouetanol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_comparar.setOnClickListener{
            var precoGasolina:String = preco_gasolina.text.toString()
            var precoEtanol:String = preco_etanol.text.toString()

            if(precoGasolina.isNotEmpty() && precoEtanol.isNotEmpty()) {
                if (precoEtanol.toDouble() < precoGasolina.toDouble() * 0.7) {
                    img_resultado.setImageResource(R.drawable.abasteca_etanol)
                } else {
                    img_resultado.setImageResource(R.drawable.abasteca_gasolina)
                }
            }

        }
    }
}