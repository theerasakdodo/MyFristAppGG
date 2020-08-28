package com.example.myfristapp.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contact_table")
data class Contact (
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0L,
    @ColumnInfo(name = "FristName")
    var fristname: String = "unnamed",
    @ColumnInfo(name = "LastName")
    var lastname: String = "",
    @ColumnInfo(name = "Phone")
    var phone: String = ""

)