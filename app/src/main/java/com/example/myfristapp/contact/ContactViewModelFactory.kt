package com.example.myfristapp.contact

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.myfristapp.database.ContactDatabaseDao
import com.example.myfristapp.databinding.FragmentContactBinding

class ContactViewModelFactory (
    private val dataSource: ContactDatabaseDao,
    private val binding:FragmentContactBinding,
    private val application: Application
) : ViewModelProvider.Factory{

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ContactViewModel::class.java)) {
            return ContactViewModel(dataSource,binding, application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}