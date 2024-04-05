package com.example.lesson_32

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.lesson_32.databinding.FragmentFirstBinding


class FirstFragment : Fragment(), Contract.View {
    private var bidding: FragmentFirstBinding? = null
    private var presenter: Contract.Presenter? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bidding = FragmentFirstBinding.inflate(inflater, container, false)
        return bidding?.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        presenter = FirstPresenter(this)
        setOnClickListener()

    }

    private fun setOnClickListener(){
        bidding?.btnPlus?.setOnClickListener {
            presenter?.plusCount()
        }
        bidding?.btnMinus?.setOnClickListener {
            presenter?.minusCount()
        }
    }

    override fun showCount(count: Int) {
        bidding?.tvCount?.text = count.toString()
    }
}