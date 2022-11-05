package ru.anudx.module22ex4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.anudx.module22ex4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

    }
}