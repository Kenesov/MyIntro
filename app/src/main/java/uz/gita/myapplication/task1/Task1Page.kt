package uz.gita.myapplication.task1

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import uz.gita.myapplication.R
import uz.gita.myapplication.databinding.PageTask1Binding

class Task1Page : Fragment(R.layout.page_task1) {
    lateinit var binding: PageTask1Binding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = PageTask1Binding.bind(view)

        val pos = arguments?.getInt("POSITION", 0) ?: 0

        when (pos) {
            0 -> {
                binding.img.setImageResource(R.drawable.task1_1)
                binding.title.setText(R.string.title)
                binding.subtitle.setText(R.string.subtitle)
                binding.desc.setText(R.string.desc)
                binding.bg.setBackgroundResource(R.color.screen_red)
            }

            1 -> {
                binding.img.setImageResource(R.drawable.task1_2)
                binding.title.setText(R.string.title)
                binding.subtitle.setText(R.string.subtitle)
                binding.desc.setText(R.string.desc)
                binding.bg.setBackgroundResource(R.color.screen_purple)
            }

            2 -> {
                binding.img.setImageResource(R.drawable.task1_3)
                binding.title.setText(R.string.title)
                binding.subtitle.setText(R.string.subtitle)
                binding.desc.setText(R.string.desc)
                binding.bg.setBackgroundResource(R.color.screen_blue)
            }
        }
    }

}