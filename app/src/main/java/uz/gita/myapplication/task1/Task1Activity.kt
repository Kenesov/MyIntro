package uz.gita.myapplication.task1

import android.content.res.ColorStateList
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2
import uz.gita.myapplication.R
import uz.gita.myapplication.databinding.ActivityTask1Binding

class Task1Activity : AppCompatActivity() {

    lateinit var binding: ActivityTask1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityTask1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.viewPager.adapter = Pager1Adapter(supportFragmentManager, lifecycle)
        binding.dotsIndicator.attachTo(binding.viewPager)
        binding.viewPager.registerOnPageChangeCallback(
            object : ViewPager2.OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    updateButtons()
                }
            }
        )


        binding.prev.isEnabled = false
        binding.prev.imageTintList = ColorStateList.valueOf(resources.getColor(R.color.disabled))
        updateButtons()

        binding.prev.setOnClickListener {
            binding.viewPager.currentItem -= 1
        }

        binding.next.setOnClickListener {
            binding.viewPager.currentItem += 1
        }

    }
    private fun updateButtons(){
        val isFirst = binding.viewPager.currentItem == 0
        val isLast = binding.viewPager.currentItem == 2

        binding.prev.isEnabled = !isFirst
        binding.prev.imageTintList = ColorStateList.valueOf(
            resources.getColor(if (isFirst) R.color.disabled else R.color.enabled)
        )

        binding.next.isEnabled = !isLast
        binding.next.imageTintList = ColorStateList.valueOf(
            resources.getColor(if (isLast) R.color.disabled else R.color.enabled)
        )
    }
}