package com.mili.core

import android.app.Application
import com.mili.data.notes.NotesDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class DataBaseModule {

    @Singleton
    @Provides
    fun provideAppDatabase(application: Application): AppDatabase {
        return AppDatabase.getDatabase(application)
    }

    @Provides
    fun provideCountryDao(database: AppDatabase): NotesDao {
        return database.notesDao()
    }
}