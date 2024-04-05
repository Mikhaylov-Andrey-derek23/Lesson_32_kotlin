package com.example.lesson_32

interface Contract {
    interface View{
//        fun changeCounterValue(counterValue:Int)
        fun showCount(count:Int)
    }

    interface Presenter {
        fun plusCount()
        fun minusCount()
    }
}