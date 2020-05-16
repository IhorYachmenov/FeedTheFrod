package com.example.feedthefrod.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.feedthefrod.R;
import com.example.feedthefrod.databinding.FeedthefrogMainActivityBinding;
import com.example.feedthefrod.viewmodel.FeedTheFrogViewModel;

public class FeedTheFrogMainActivity extends AppCompatActivity {

    FeedTheFrogViewModel viewModel = new FeedTheFrogViewModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FeedthefrogMainActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.feedthefrog_main_activity);
        binding.setViewModel(viewModel);
        viewModel.onCreate();

        getSupportActionBar().hide();
    }

    @Override
    protected void onPause() {
        super.onPause();
        viewModel.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        viewModel.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        viewModel.onDestroy();
    }
}
