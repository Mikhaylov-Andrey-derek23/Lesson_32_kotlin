package com.example.lesson_32

interface Contract {
    interface View{
//        fun changeCounterValue(counterValue:Int)
        fun showImg(text:String)
    }

    interface Presenter {
        fun searchImg(text:String)
    }
}