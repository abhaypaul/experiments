package com.example.hilttest;



import androidx.lifecycle.ViewModel;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class MyViewModel extends ViewModel {
//    @Inject
    public MyRepository myRepository;

    @Inject
    public MyViewModel(MyRepository myRepository) {
        this.myRepository=myRepository;
    }

    public void print()
    {
        myRepository.print();

    }
}
