package com.example.myfristapp.contact

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.myfristapp.R
import com.example.myfristapp.database.ContactDatabase
import com.example.myfristapp.databinding.FragmentContactBinding



class ContactFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var binding = DataBindingUtil.inflate<FragmentContactBinding>(
            inflater,
            R.layout.fragment_contact,
            container,
            false
        )

        setHasOptionsMenu(true)

        val application = requireNotNull(this.activity).application
        val dataSource = ContactDatabase.getInstance(application).contactDatabaseDao
        val viewModelFactory = ContactViewModelFactory(dataSource, binding, application)
        val contactViewModel =
            ViewModelProvider(
                this, viewModelFactory
            ).get(ContactViewModel::class.java)
        binding.contactViewModel = contactViewModel
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.option_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(
            item,
            view!!.findNavController()
        ) || super.onOptionsItemSelected(item)
    }
}