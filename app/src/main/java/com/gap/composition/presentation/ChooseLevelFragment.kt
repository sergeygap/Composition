package com.gap.composition.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.gap.composition.R
import com.gap.composition.databinding.FragmentChooseLevelFragmentBinding
import com.gap.composition.databinding.FragmentGameFinishedBinding
import java.lang.RuntimeException

class ChooseLevelFragment: Fragment() {
    private var _binding: FragmentChooseLevelFragmentBinding? = null
    private val binding: FragmentChooseLevelFragmentBinding
        get() = _binding ?: throw RuntimeException("FragmentChooseLevelFragmentBinding == null")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentChooseLevelFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}