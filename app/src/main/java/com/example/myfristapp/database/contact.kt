package com.example.myfristapp.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contact_table")
data class Contact (
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0L,
    @ColumnInfo(name = "firstname")
    var firstname: String = "unnamed",
    @ColumnInfo(name = "lastname")
    var lastname: String = "unnamed",
    @ColumnInfo(name = "phone")
    var phone: String = ""
)
//