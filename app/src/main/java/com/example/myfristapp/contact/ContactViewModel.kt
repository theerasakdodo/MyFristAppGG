package com.example.myfristapp.contact

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.myfristapp.database.ContactDatabaseDao
import com.example.myfristapp.databinding.FragmentContactBinding


class ContactViewModel(
    val contactdatabase: ContactDatabaseDao,
    private val binding:FragmentContactBinding,
    application: Application
) : AndroidViewModel(application) {
}