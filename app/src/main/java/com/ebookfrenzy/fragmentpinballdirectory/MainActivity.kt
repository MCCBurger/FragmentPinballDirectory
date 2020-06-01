package com.ebookfrenzy.fragmentpinballdirectory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val TMNT = TMNTFragment()
        val HotWheels = HotWheels()
        val wonka = WillyWonka()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, TMNT)
            addToBackStack(null)
            commit()
        }


        btnTMNT.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, TMNT)
                addToBackStack(null)
                commit()
            }
        }

        btnHotWheels.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, HotWheels)
                addToBackStack(null)
                commit()
            }
        }

        btnWillyWonka.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, wonka)
                addToBackStack(null)
                commit()
            }
        }

    }

}