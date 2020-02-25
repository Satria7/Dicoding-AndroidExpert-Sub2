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

public class fragment_movie extends Fragment {
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
        list.add(new Item(R.drawable.poster_avengerinfinity, "Avenger Infinity War (2018)",getString(R.string.endgame)));
        list.add(new Item(R.drawable.poster_aquaman, "Aquaman (2018)", getString(R.string.aquaman)));
        list.add(new Item(R.drawable.poster_bumblebee, "Bumblebee (2018)", getString(R.string.bumblebee)));
        list.add(new Item(R.drawable.poster_robinhood, "Robin Hood (2018)", getString(R.string.robinhood)));
        list.add(new Item(R.drawable.poster_venom, "Venom (2018)", getString(R.string.venom)));
        list.add(new Item(R.drawable.poster_spiderman, "Spider Man Into Spider-Verse (2019)", getString(R.string.spiderman)));
        list.add(new Item(R.drawable.poster_dragon, "How to Train Your Dragon (2019)", getString(R.string.dragon)));
        list.add(new Item(R.drawable.poster_glass, "Glass (2018)", getString(R.string.glass)));
        list.add(new Item(R.drawable.poster_hunterkiller, "Hunter Killer (2018)", getString(R.string.hunter)));
        list.add(new Item(R.drawable.poster_birdbox, "Bird Box (2019)", getString(R.string.bird)));

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