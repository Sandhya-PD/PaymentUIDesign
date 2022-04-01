package com.example.paymentuidesign

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView


/**
 * A simple [Fragment] subclass.
 * Use the [CheckForCard.newInstance] factory method to
 * create an instance of this fragment.
 */
class CheckForCard : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_check_for_card,container,false)
    }
    // get reference to the string array that we just created

}