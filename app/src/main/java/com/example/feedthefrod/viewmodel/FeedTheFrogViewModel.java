package com.example.feedthefrod.viewmodel;

import android.widget.TextView;

import com.example.feedthefrod.R;
import com.example.feedthefrod.model.ResetState;
import com.example.feedthefrod.model.State;

public class FeedTheFrogViewModel implements ViewModel {

    public ResetState reset;
    public State state;

    public FeedTheFrogViewModel() {

        reset = new ResetState();


    }

    @Override
    public void onCreate() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onDestroy() {

    }

}
