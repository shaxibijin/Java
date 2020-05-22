package com.bijin.second_part.day03_myArgs.Test03;


public class JumppingOperator {

    public void userJumpping(Jumpping j){
        j.Jump();
    }

    public Jumpping getJumpping(){
        Jumpping j = new Cat();
        return j;
    }
}
