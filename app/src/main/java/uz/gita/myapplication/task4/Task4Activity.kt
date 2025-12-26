package uz.gita.myapplication.task4

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isVisible
import androidx.viewpager2.widget.ViewPager2
import uz.gita.myapplication.R
import uz.gita.myapplication.databinding.ActivityTask4Binding

class Task4Activity : AppCompatActivity() {

    lateinit var binding: ActivityTask4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityTask4Binding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.viewPager.adapter = Pager4Adapter(supportFragmentManager, lifecycle)
        binding.dotsIndicator.attachTo(binding.viewPager)

        binding.tvSkip.setOnClickListener {
            val lastIndex = binding.viewPager.adapter!!.itemCount - 1
            binding.viewPager.currentItem = lastIndex
        }

        binding.tvNext.setOnClickListener {
            if (binding.viewPager.currentItem + 1 < 3) {
                binding.viewPager.currentItem += 1
            } else {
                binding.tvLets.visibility = View.VISIBLE
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

            binding.tvLets.isVisible = position == 2
            binding.dotsIndicator.isVisible = position != 2
            binding.tvSkip.isVisible = position != 2
            binding.tvNext.isVisible = position != 2
        }
    }
}