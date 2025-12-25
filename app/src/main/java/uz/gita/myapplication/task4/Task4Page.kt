package uz.gita.myapplication.task4

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import uz.gita.myapplication.R
import uz.gita.myapplication.databinding.PageTask4Binding

class Task4Page : Fragment(R.layout.page_task4) {
    lateinit var binding: PageTask4Binding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = PageTask4Binding.bind(view)

        val pos = arguments?.getInt("POSITION", 0) ?: 0

        when (pos) {
            0 -> {
                binding.img.setImageResource(R.drawable.task4_1)
                binding.title.setText(R.string.title_chatbot)
                binding.subtitle.setText(R.string.desc_chatbot)
            }

            1 -> {
                binding.img.setImageResource(R.drawable.task4_2)
                binding.title.setText(R.string.title_overview)
                binding.subtitle.setText(R.string.desc_overview)
            }

            2 -> {
                binding.img.setImageResource(R.drawable.task4_3)
                binding.title.setText(R.string.title_online_learning)
                binding.subtitle.setText(R.string.desc_online_learning)
            }
        }
    }

}