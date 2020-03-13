package com.example.roomsampleapp

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "word_table") //SQLiteテーブル
//すべてのエンティティにはPキーが必要。＠ColumnInfoで列の名前を作成
class Word(@PrimaryKey @ColumnInfo(name = "word") val word: String)


//キーの自動生成
//@Entity(tableName = "word_table")
//public class Word{
//
//    @PrimaryKey(autoGenerate = true)
//    private int id;
//
//    @NonNull
//    private String word;
//    //..other fields, getters, setters
//}