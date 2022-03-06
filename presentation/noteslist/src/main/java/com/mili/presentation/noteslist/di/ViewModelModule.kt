package com.mili.presentation.noteslist.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mili.base.ViewModelFactoryProvider
import com.mili.base.viewmodel.ViewModelKey
import com.mili.presentation.noteslist.NotesViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(viewModelFactoryProvider: ViewModelFactoryProvider):ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(NotesViewModel::class)
    abstract fun bindNotesViewModel(viewModel: NotesViewModel):ViewModel
}