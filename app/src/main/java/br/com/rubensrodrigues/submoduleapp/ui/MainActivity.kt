package br.com.rubensrodrigues.submoduleapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.rubensrodrigues.models.Person
import br.com.rubensrodrigues.submoduleapp.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val person = Person("Beltrano", 30)
    }
}
