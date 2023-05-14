package com.example.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listaDeNomes = listOf(
            "Texto 1",
            "Texto 2",
            "Texto 3",
            "Texto 4",
            "Texto 5",
            "Texto 6",
            "Texto 7"
        )

        val colors = resources.getStringArray(R.array.colors_rainbows)
        val recycler = findViewById<RecyclerView>(R.id.rv_lista_de_versoes)
        recycler.adapter = DroidVesionAdapter(listaDeNomes, colors.asList())
    }
}