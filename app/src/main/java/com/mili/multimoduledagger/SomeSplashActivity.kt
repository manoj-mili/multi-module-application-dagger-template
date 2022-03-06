package com.mili.multimoduledagger

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mili.presentation.noteslist.NotesActivity

@SuppressLint("CustomSplashScreen")
class SomeSplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    override fun onResume() {
        super.onResume()
        startNoteActivity()
    }

    private fun startNoteActivity() {
        val intent = Intent(this, NotesActivity::class.java)
        startActivity(intent)
    }
}