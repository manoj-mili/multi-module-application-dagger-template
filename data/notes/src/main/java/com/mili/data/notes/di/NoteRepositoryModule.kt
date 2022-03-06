package com.mili.data.notes.di

import com.mili.data.notes.NoteAPI
import com.mili.data.notes.NotesDao
import com.mili.data.notes.NotesRepository
import com.mili.domain.notes.INotesRepository
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class NoteRepositoryModule {

    @Provides
    fun provideNoteAPI(retrofit: Retrofit): NoteAPI {
        return retrofit.create(NoteAPI::class.java)
    }

    @Provides
    fun provideRepository(notesDao: NotesDao, notesAPI: NoteAPI): INotesRepository {
        return NotesRepository(notesDao, notesAPI)
    }
}