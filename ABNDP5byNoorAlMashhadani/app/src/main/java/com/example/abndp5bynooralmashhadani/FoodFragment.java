package com.example.abndp5bynooralmashhadani;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodFragment extends Fragment {

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.drawable.food_place_1_image, getString(R.string.food_place_1_name), getString(R.string.food_place_1_location), getString(R.string.food_place_1_info)));
        places.add(new Place(R.drawable.food_place_2_image, getString(R.string.food_place_2_name), getString(R.string.food_place_2_location), getString(R.string.food_place_2_info)));
        places.add(new Place(R.drawable.food_place_3_image, getString(R.string.food_place_3_name), getString(R.string.food_place_3_location), getString(R.string.food_place_3_info)));

        RecyclerView recyclerView = rootView.findViewById(R.id.recycler);
        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setAdapter(placeAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);

        return rootView;
    }
}