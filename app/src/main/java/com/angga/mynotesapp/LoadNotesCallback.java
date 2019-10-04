package com.angga.mynotesapp;

import com.angga.mynotesapp.entity.Note;

import java.util.ArrayList;

public interface LoadNotesCallback {
    void preExecute();

    void postExecute(ArrayList<Note> notes);
}

