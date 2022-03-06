package com.mili.presentation.noteslist.di

import com.mili.core.CoreComponent
import com.mili.presentation.noteslist.NotesActivity
import dagger.Component

@NotesListUIScope
@Component(
    modules = [ViewModelModule::class],
    dependencies = [CoreComponent::class]
)
interface NotesListComponent {

    @Component.Factory
    interface Factory {
        fun create(
            component: CoreComponent
        ): NotesListComponent
    }

    fun inject(activity: NotesActivity)

}