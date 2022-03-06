package com.mili.core

import android.app.Application
import com.mili.data.notes.di.NoteRepositoryModule
import com.mili.domain.notes.INotesRepository
import dagger.BindsInstance
import dagger.Component
import retrofit2.Retrofit
import javax.inject.Singleton

@Singleton
@Component(
    modules = [DataBaseModule::class, NetworkModule::class, NoteRepositoryModule::class]
)
interface CoreComponent {

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance app: Application,
        ): CoreComponent
    }

    val notesRepository: INotesRepository

    val retrofit: Retrofit
}