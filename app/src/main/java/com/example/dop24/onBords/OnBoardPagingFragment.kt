package com.example.dop24.onBords

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import com.example.dop24.R
import com.example.dop24.databinding.FragmentOnBoardPagingBinding

class OnBoardPagingFragment : Fragment() {

    private lateinit var binding: FragmentOnBoardPagingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOnBoardPagingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
    }

    private fun initialize() = with(binding) {
        when (requireArguments().getInt(ARG_ONBOARD_POSITION)) {
            0 -> {
                imageView.setImageResource(R.drawable.img)
                textView.isVisible = false
            }
            1 -> {
                textView.text = "Вашем счету 1 сом"
                imageView.isVisible = false
                materialCardView.isVisible = false
            }
        }
    }

    companion object {
        const val ARG_ONBOARD_POSITION = "onBord"
    }
}