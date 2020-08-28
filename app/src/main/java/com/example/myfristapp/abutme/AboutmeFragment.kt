package com.example.myfristapp.abutme

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.myfristapp.R
import com.example.myfristapp.contact.ContactViewModel
import com.example.myfristapp.contact.ContactViewModelFactory
import com.example.myfristapp.database.ContactDatabase
import com.example.myfristapp.databinding.FragmentAboutmeBinding
import com.example.myfristapp.databinding.FragmentContactBinding


class AboutmeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var binding = DataBindingUtil.inflate<FragmentAboutmeBinding>(
            inflater,
            R.layout.fragment_aboutme,
            container,
            false
        )
        setHasOptionsMenu(true)
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