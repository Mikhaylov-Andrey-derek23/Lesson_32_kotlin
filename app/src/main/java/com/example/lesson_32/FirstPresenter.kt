package com.example.lesson_32

class FirstPresenter(private val view:Contract.View) : Contract.Presenter {

    private var count = 0


    override fun plusCount() {
        count += 1
        view.showCount(count)
    }

    override fun minusCount() {
        count -= 1
        view.showCount(count)
    }
}