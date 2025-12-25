package uz.gita.myapplication.task2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import uz.gita.myapplication.R
import uz.gita.myapplication.databinding.PageTask2Binding

class Task2Page: Fragment(R.layout.page_task2) {
    lateinit var binding: PageTask2Binding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = PageTask2Binding.bind(view)

        val pos = arguments?.getInt("POSITION", 0) ?: 0

        when(pos){
            0 -> {
                binding.img.setImageResource(R.drawable.task2_1)
                binding.textTitle.text = "100% safety guarantee"
                binding.textDescription.text = "all your money will be treated in a safe way"
            }
            1 -> {
                binding.img.setImageResource(R.drawable.task2_2)
                binding.textTitle.text = "high retribution"
                binding.textDescription.text = "our product ensure that your invstment will get a high rate of return"
            }
            else -> {
                binding.img.setImageResource(R.drawable.task2_3)
                binding.textTitle.text = "expenses at any time"
                binding.textDescription.text = "whenever you need, you can free feel to take it any any time"
            }
        }
    }

}