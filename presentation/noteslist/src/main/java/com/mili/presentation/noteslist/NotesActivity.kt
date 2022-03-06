package com.mili.presentation.noteslist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.mili.base.ViewModelFactoryProvider
import com.mili.core.ComponentProvider
import com.mili.presentation.noteslist.di.DaggerNotesListComponent
import javax.inject.Inject

/**
 * no code added as it is a template
 */
class NotesActivity : AppCompatActivity() {
    @Inject
    lateinit var factory: ViewModelFactoryProvider
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notes)
        val coreComponent = ComponentProvider.getCoreComponent(application)
        val notesListComponent = DaggerNotesListComponent.factory().create(coreComponent)
        notesListComponent.inject(this)
        val notesViewModel = ViewModelProvider(this, factory)[NotesViewModel::class.java]
    }
}