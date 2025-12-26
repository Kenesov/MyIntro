package uz.gita.myapplication.task6

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isVisible
import androidx.viewpager2.widget.ViewPager2
import uz.gita.myapplication.R
import uz.gita.myapplication.databinding.ActivityTask6Binding

class Task6Activity : AppCompatActivity() {

    lateinit var binding: ActivityTask6Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityTask6Binding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.viewPager.adapter = Pager6Adapter(supportFragmentManager, lifecycle)
        binding.dotsIndicator.attachTo(binding.viewPager)

        binding.viewPager.isUserInputEnabled = true

        binding.tvSkip.setOnClickListener {
            val lastIndex = binding.viewPager.adapter!!.itemCount - 1
            binding.viewPager.setCurrentItem(lastIndex, true)
        }


        binding.btnBack.setOnClickListener {
            val current = binding.viewPager.currentItem
            if (current > 0) {
                binding.viewPager.setCurrentItem(current - 1, true)
            }
        }


        binding.btnNext.setOnClickListener {
            val current = binding.viewPager.currentItem
            val lastIndex = binding.viewPager.adapter!!.itemCount - 1

            if (current < lastIndex) {
                binding.viewPager.setCurrentItem(current + 1, true)
            } else {
                Toast.makeText(this, "Start clicked", Toast.LENGTH_SHORT).show()
            }
        }


        binding.viewPager.registerOnPageChangeCallback(callBack)
    }

    private val callBack = object : ViewPager2.OnPageChangeCallback() {
        override fun onPageScrollStateChanged(state: Int) {
            super.onPageScrollStateChanged(state)
        }

        override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
            super.onPageScrolled(position, positionOffset, positionOffsetPixels)
        }

        override fun onPageSelected(position: Int) {
            super.onPageSelected(position)
            val lastIndex = binding.viewPager.adapter!!.itemCount - 1
            binding.btnBack.isVisible = position != 0
            binding.btnNext.text = if (position == 2) "Start" else "Next"
        }

    }
}