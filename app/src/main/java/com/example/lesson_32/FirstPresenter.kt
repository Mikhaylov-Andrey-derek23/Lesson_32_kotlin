package com.example.lesson_32

class FirstPresenter(private val view:Contract.View, private val list: List<String>): Contract.Presenter {

    private var text:String = ""


    override fun searchImg(text:String) {
        if(text == "cat"){
            view.showImg(list.random())
        }
    }
}