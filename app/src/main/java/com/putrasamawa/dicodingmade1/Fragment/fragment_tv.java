package com.putrasamawa.dicodingmade1.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.putrasamawa.dicodingmade1.Adapter.ExampleAdapter;
import com.putrasamawa.dicodingmade1.DetailActivity;
import com.putrasamawa.dicodingmade1.Item.Item;
import com.putrasamawa.dicodingmade1.R;

import java.util.ArrayList;

//* Satria Junanda *//

public class fragment_tv extends Fragment {
    private ArrayList<Item> list;
    private RecyclerView rey;
    private ExampleAdapter adapter;
    private GridLayoutManager layout;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment, container, false);
        rey = root.findViewById(R.id.recyclerView);

        createExampleList();
        buildRecyclerView();
        return root;
    }

    public void createExampleList() {
        list = new ArrayList<>();
        list.add(new Item(R.drawable.poster_naruto_shipudden, "Naruto Shippuden (2007-2017)",getString(R.string.naruto)));
        list.add(new Item(R.drawable.poster_dragon_ball, "Dragon Ball (1986-1996)", getString(R.string.dragonball)));
        list.add(new Item(R.drawable.poster_fairytail, "Fairy Tail (2009-2019)", getString(R.string.fairytail)));
        list.add(new Item(R.drawable.poster_the_simpson, "The Simpsons (1989)", getString(R.string.simson)));
        list.add(new Item(R.drawable.poster_family_guy, "Venom (1999)", getString(R.string.family)));
        list.add(new Item(R.drawable.poster_supergirl, "Supergirl (2015)", getString(R.string.supergirl)));
        list.add(new Item(R.drawable.poster_flash, "The Flash (2014)", getString(R.string.flash)));
        list.add(new Item(R.drawable.poster_arrow, "Arrow (2012)", getString(R.string.arrow)));
        list.add(new Item(R.drawable.poster_gotham, "Gotham (2014-2019)", getString(R.string.gotham)));
        list.add(new Item(R.drawable.poster_the_walking_dead, "The Walking Dead (2010)", getString(R.string.dead)));

    }

    public void buildRecyclerView() {
        rey.setHasFixedSize(true);
        layout = new GridLayoutManager(getContext(),2);
        adapter = new ExampleAdapter(list);

        rey.setLayoutManager(layout);
        rey.setAdapter(adapter);

        adapter.setOnItemClickListener(new ExampleAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Intent intent = new Intent(getActivity(), DetailActivity.class);
                intent.putExtra("Example Item", list.get(position));

                startActivity(intent);
            }
        });
    }
}

//* Satria Junanda *//