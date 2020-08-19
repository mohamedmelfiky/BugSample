package com.elfiky.testcoilepoxy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.elfiky.testcoilepoxy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmen_container, MainFragment())
            .addToBackStack(null)
            .commit()
    }
}