package com.mili.data.notes

import retrofit2.http.GET

interface NoteAPI {

    @GET("/notes")
    suspend fun getRemoteNotes():NotesResponse


}