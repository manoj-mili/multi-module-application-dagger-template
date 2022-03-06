package com.mili.data.notes

import com.mili.domain.notes.INotesRepository
import javax.inject.Inject

/**
 * no code added as it is a template
 */
class NotesRepository @Inject constructor(
    private val dao: NotesDao,
    private val notesAPI: NoteAPI
) : INotesRepository {

}