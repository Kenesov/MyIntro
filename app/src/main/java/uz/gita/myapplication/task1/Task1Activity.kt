package uz.gita.myapplication.task1

import android.content.res.ColorStateList
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import uz.gita.myapplication.R
import uz.gita.myapplication.databinding.ActivityTask1Binding
import uz.gita.myapplication.task1.PagerAdapter

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

        binding.viewPager.adapter = PagerAdapter(supportFragmentManager, lifecycle)
        binding.dotsIndicator.attachTo(binding.viewPager)

        binding.prev.isEnabled = false
        binding.prev.imageTintList = ColorStateList.valueOf(resources.getColor(R.color.disabled))
        binding.prev.setOnClickListener {
            if (binding.viewPager.currentItem > 0) {
                binding.viewPager.currentItem -= 1
            }else{
                binding.prev.imageTintList = ColorStateList.valueOf(resources.getColor(R.color.disabled))
                binding.prev.isEnabled = false
            }
        }

        binding.next.setOnClickListener {
            if (binding.viewPager.currentItem < 2) {
                binding.viewPager.currentItem += 1
                binding.prev.isEnabled = true
                binding.prev.imageTintList = ColorStateList.valueOf(resources.getColor(R.color.enabled))
            }
        }
    }
}