package com.teetask.mycommunity.ui.setting;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.teetask.mycommunity.R;

public class Setting extends Fragment {

    private com.teetask.mycommunity.ui.setting.SettingViewModel mViewModel;

    public static Setting newInstance() {
        return new Setting();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.setting_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(com.teetask.mycommunity.ui.setting.SettingViewModel.class);
        // TODO: Use the ViewModel
    }

}
