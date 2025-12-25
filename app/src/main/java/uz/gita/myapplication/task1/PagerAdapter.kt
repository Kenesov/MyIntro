package uz.gita.myapplication.task1

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import uz.gita.myapplication.task1.Task1Page

class PagerAdapter(fm: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fm,lifecycle){
    override fun createFragment(position: Int): Fragment {
        val bundle = Bundle()

        bundle.putInt("POSITION", position)

        val fm = Task1Page()
        fm.arguments = bundle

        return fm
    }

    override fun getItemCount(): Int = 3

}