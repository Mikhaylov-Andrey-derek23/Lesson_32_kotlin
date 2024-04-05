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
        presenter =FirstPresenter(this, listOf(
            "https://www.treehugger.com/thmb/8L8-EYJXcD0RVbu-ydspAiH_LIM=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/GettyImages-1194409229-59d8d02e2c544734b799de766628c0c2.jpg",
            "https://www.sydney.edu.au/content/dam/corporate/images/news-and-opinion/news/2019/october/cat-eyes.jpg",
            "https://i.pinimg.com/originals/a6/4b/00/a64b00d0efe34985d5b1edd93bbaf366.jpg"

        ))
        setOnClickListener()

    }

    private fun setOnClickListener(){
        bidding?.btnShowImg?.setOnClickListener {
            presenter?.searchImg(bidding?.editText?.text.toString())
        }
    }

    override fun showImg(url: String) {
        Glide.with(requireContext()).load(url).into(bidding!!.Img)
    }
}