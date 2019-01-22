package com.example.sb_cm.rjwwidget.third.tab;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sb_cm.rjwwidget.R;
import com.example.sb_cm.rjwwidget.widget.ball.BallView;
import com.example.sb_cm.rjwwidget.widget.ball.TaskModel;

import java.util.ArrayList;

/**
 * Desc:
 * <p>
 * Created by renjiawen on 2018/12/18.
 */
public class TabFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_tab, container, false);


        return root;
    }
}
