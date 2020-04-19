package com.modcompany.mebook.ui.dashboard;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.modcompany.mebook.Model;
import com.modcompany.mebook.MyAdapter;
import com.modcompany.mebook.R;

import java.util.ArrayList;

import static com.modcompany.mebook.R.id.item_name;
import static com.modcompany.mebook.R.id.text;

public class DashboardFragment extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_dashboard);

        mRecyclerView = mRecyclerView.findViewById(R.id.lessons_list);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this, getMyList());
        mRecyclerView.setAdapter(myAdapter);
    }

    private ArrayList<Model> getMyList() {

        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();
        m.setTitle("What is ModEngine?");
        m.setDescription("What is ModEngine?...");
        m.setImg(R.drawable.ic_book_black_24dp);
        models.add(m);

        m = new Model();
        m.setTitle("Edit the sky");
        m.setDescription("Edit the sky...");
        m.setImg(R.drawable.ic_book_black_24dp);
        models.add(m);

        m = new Model();
        m.setTitle("Block");
        m.setDescription("Create block...");
        m.setImg(R.drawable.ic_book_black_24dp);
        models.add(m);

        return models;
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DashboardViewModel dashboardViewModel = ViewModelProviders.of(this).get(DashboardViewModel.class);
        /*final TextView textView = root.findViewById(R.id.text_dashboard);
        dashboardViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        return inflater.inflate(R.layout.fragment_dashboard, container, false);
    }
}
