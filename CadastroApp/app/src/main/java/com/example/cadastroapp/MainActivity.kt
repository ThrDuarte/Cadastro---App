package com.example.cadastroapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val edtEmail = findViewById<EditText>(R.id.edt_email)
        val edtNome = findViewById<EditText>(R.id.edt_nome)
        val edtIdade = findViewById<EditText>(R.id.edt_idade)
        val edtCpf = findViewById<EditText>(R.id.edt_cpf)
        val btnEnviar = findViewById<Button>(R.id.btnEnviar)
        val tvTxv = findViewById<TextView>(R.id.tv_txv) // Adicionando TextView para exibir os dados

        btnEnviar.setOnClickListener {
            // Obtendo os valores inseridos nos EditTexts
            val email = edtEmail.text.toString()
            val nome = edtNome.text.toString()
            val idade = edtIdade.text.toString()
            val cpf = edtCpf.text.toString()

            // Exibindo o resultado com Toast
            Toast.makeText(this, "E-mail: $email, Nome: $nome, Idade: $idade, CPF: $cpf", Toast.LENGTH_SHORT).show()

            // Exibindo os dados no TextView
            tvTxv.text = "E-mail: $email\nNome: $nome\nIdade: $idade\nCPF: $cpf"
        }
    }
}


