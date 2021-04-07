package com.example.yankees

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_squad.*

class SquadFragment : Fragment() {



    private lateinit var squad: Squad
    lateinit var button : Button



    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        squad = Squad()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //return inflater.inflate(R.layout.fragment_squad,container,false)
        val view = inflater.inflate(R.layout.fragment_squad, container, false)

        return view
    }


    override fun onStart() {
        super.onStart()

    }

}