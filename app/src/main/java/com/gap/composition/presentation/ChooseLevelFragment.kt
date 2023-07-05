package com.gap.composition.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.gap.composition.R
import com.gap.composition.databinding.FragmentChooseLevelFragmentBinding
import com.gap.composition.domain.entity.Level

class ChooseLevelFragment : Fragment() {


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
        with(binding) {
            buttonClick(buttonLevelTest, Level.TEST)
            buttonClick(buttonLevelEasy, Level.EASY)
            buttonClick(buttonLevelNormal, Level.NORMAL)
            buttonClick(buttonLevelHard, Level.HARD)
        }
    }

    private fun buttonClick(button: Button, level: Level) {
        button.setOnClickListener {
            launchGameFragment(level)
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


    private fun launchGameFragment(level: Level) {

        findNavController().navigate(ChooseLevelFragmentDirections.actionChooseLevelFragmentToGameFragment(level))
    }

    companion object {
        const val NAME = "ChooseLevelFragment"

        fun newInstance(): ChooseLevelFragment {
            return ChooseLevelFragment()
        }
    }
}