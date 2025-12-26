package uz.gita.myapplication.task3

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class Pager3Adapter(fm: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fm,lifecycle){
    override fun createFragment(position: Int): Fragment {
        val bundle = Bundle()

        bundle.putInt("POSITION", position)

        val fm = Task3Page()
        fm.arguments = bundle

        return fm
    }

    override fun getItemCount(): Int = 3

}