package com.example.roomsampleapp

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


    @Dao
    interface WordDao {

        @Query("SELECT * from word_table ORDER BY word ASC") //昇順でソートされた単語を返す
        fun getAlphabetizedWords(): LiveData<List<Word>>//Room generates all necessary code to update the LiveData when the database is updated.

        //The selected on conflict strategy ignores a new word if it's exactly the same as one already in the list.
        @Insert(onConflict = OnConflictStrategy.IGNORE)
        suspend fun insert(word: Word)

        @Query("DELETE FROM word_table")
        suspend fun deleteAll() //全削除
    }
