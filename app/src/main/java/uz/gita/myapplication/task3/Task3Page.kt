package uz.gita.myapplication.task3

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import uz.gita.myapplication.R
import uz.gita.myapplication.databinding.PageTask3Binding

class Task3Page : Fragment(R.layout.page_task3) {
    lateinit var binding: PageTask3Binding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = PageTask3Binding.bind(view)

        val pos = arguments?.getInt("POSITION", 0) ?: 0

        when (pos) {
            0 -> {
                binding.img.setImageResource(R.drawable.task3_1)
                binding.title.setText(R.string.onboarding_title_1)
            }

            1 -> {
                binding.title.setText(R.string.onboarding_title_2)
                binding.img.setImageResource(R.drawable.task3_2)
            }

            2 -> {
                binding.title.setText(R.string.onboarding_title_3)
                binding.img.setImageResource(R.drawable.task3_3)
            }
        }
    }

}