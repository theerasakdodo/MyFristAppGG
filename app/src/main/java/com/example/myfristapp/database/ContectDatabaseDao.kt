package com.example.myfristapp.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query


@Dao
interface ContectDatabaseDao {
    @Insert
    fun insert(contect: Contect)
    @Query("SELECT * from contect_table")
    fun get(): LiveData<List<Contect>>
}
