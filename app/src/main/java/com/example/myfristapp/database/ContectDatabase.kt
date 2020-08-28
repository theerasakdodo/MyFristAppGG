package com.example.myfristapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Contect::class], version = 1, exportSchema = false)
abstract class ContectDatabase : RoomDatabase(){
    abstract val contectDatabaseDao:ContectDatabaseDao
    companion object{
        @Volatile
        private var INSTANCE: ContectDatabase? = null
        fun getInstance(context: Context): ContectDatabase{
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        ContectDatabase::class.java,
                        "contectdatabase"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}