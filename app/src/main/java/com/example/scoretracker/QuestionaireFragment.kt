package com.example.scoretracker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import androidx.fragment.app.Fragment
import com.example.scoretracker.databinding.FragmentQuestionaireBinding

class QuestionaireFragment : Fragment() {

    private var _binding : FragmentQuestionaireBinding? = null
    private val binding: FragmentQuestionaireBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentQuestionaireBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onCheckboxClicked(view: View) {
        if(view is CheckBox){
            val checked: Boolean = view.isChecked

            when(view.id){
                R.id.option1 -> {
                    if(checked){

                    } else {

                    }
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}