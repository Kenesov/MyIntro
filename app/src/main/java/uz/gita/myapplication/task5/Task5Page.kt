package uz.gita.myapplication.task5

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import uz.gita.myapplication.R
import uz.gita.myapplication.databinding.PageTask5Binding

class Task5Page : Fragment(R.layout.page_task5) {
    lateinit var binding: PageTask5Binding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = PageTask5Binding.bind(view)

        val pos = arguments?.getInt("POSITION", 0) ?: 0

        when (pos) {
            0 -> {
                binding.img.setImageResource(R.drawable.task5_1)
                binding.title.setText(R.string.onboarding_title_11)
                binding.subtitle.setText(R.string.onboarding_desc_11)
            }

            1 -> {
                binding.img.setImageResource(R.drawable.task5_2)
                binding.title.setText("Fast delivery to your place")
                binding.subtitle.setText("Fast delivery to your home, office and whever you are")

            }

            2 -> {
                binding.img.setImageResource(R.drawable.task5_3)
                binding.title.setText(R.string.onboarding_title_31)
                binding.subtitle.setText(R.string.onboarding_desc_31)
            }
        }
    }

}