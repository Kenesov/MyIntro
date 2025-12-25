package uz.gita.myapplication.task6

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import uz.gita.myapplication.R
import uz.gita.myapplication.databinding.PageTask6Binding

class Task6Page : Fragment(R.layout.page_task6) {
    lateinit var binding: PageTask6Binding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = PageTask6Binding.bind(view)

        val pos = arguments?.getInt("POSITION", 0) ?: 0

        when (pos) {
            0 -> {
                binding.img.setImageResource(R.drawable.task6_1)
                binding.title.setText(R.string.onboarding_title_order)
                binding.subtitle.setText(R.string.onboarding_desc_order)
                binding.title2.visibility= View.GONE
                binding.subtitle2.visibility= View.GONE
                binding.title.visibility= View.VISIBLE
                binding.subtitle.visibility= View.VISIBLE
            }

            1 -> {
                binding.img.setImageResource(R.drawable.task6_2)
                binding.title2.setText(R.string.onboarding_title_safe)
                binding.subtitle2.setText(R.string.onboarding_desc_safe)
                binding.title.visibility= View.GONE
                binding.subtitle.visibility= View.GONE
                binding.title2.visibility= View.VISIBLE
                binding.subtitle2.visibility= View.VISIBLE
            }

            2 -> {
                binding.img.setImageResource(R.drawable.task6_3)
                binding.title.setText(R.string.onboarding_title_quick)
                binding.subtitle.setText(R.string.onboarding_desc_quick)
                binding.title2.visibility= View.GONE
                binding.subtitle2.visibility= View.GONE
                binding.title.visibility= View.VISIBLE
                binding.subtitle.visibility= View.VISIBLE
            }
        }

        binding.title
    }

}