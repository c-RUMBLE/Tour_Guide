package com.example.android.tourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class HotelsFragment extends Fragment {

    ArrayList<DataSet> data = new ArrayList<>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDataSet();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.recycler_fragment,container,false);

        // Add the following lines to create RecyclerView
        // Add RecyclerView member
        RecyclerView recyclerView = view.findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(recyclerView.getContext(), DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(new ListAdapter(data, getActivity(), getContext()));

        return view;
    }

    private void initDataSet() {
        data.add(new DataSet(R.drawable.hotel_imperial_heights,
                "Hotel Imperial Heights",
                "Tower Chowk Rd, near Baidyanath Dham Station, B, Williams Town, Deoghar, Jharkhand 814112",
                "91234 61616",
                "Rated 4.3 based on 1298 Ratings."));
        data.add(new DataSet(R.drawable.hotel_vaishnavi_vlarks_inn,
                "Vaishnavi Clarks Inn",
                "Near, R.R. Baxi Road, Tower Chowk Rd, Shivganga Muhalla, Deoghar, Jharkhand 814112",
                "Rated 4.0 based on 1957 Ratings."));
        data.add(new DataSet(R.drawable.hotel_rameshwaram,
                "GenX Rameshwaram By 1589",
                "Court Road Behind Government Bus Stand, Williams Town, Deoghar, Jharkhand 814112",
                "77810 56666",
                "Rated 3.7 based on 948 Ratings."));
        data.add(new DataSet(R.drawable.hotel_baidyanath,
                "Hotel Baidyanath",
                "Near Jain Mandir, Shivnath, SB Roy Rd, Castairs Town, Deoghar, Jharkhand 814112",
                "92048 52030",
                "Rated 3.9 based on 571 Ratings."));
        data.add(new DataSet(R.drawable.hotel_mahadev_palace,
                "Hotel Mahadev Palace",
                "B. L. C. Road, Castairs Town, Deoghar, Jharkhand 814112",
                "92342 07708",
                "Rated 3.7 based on 923 Ratings."));
        data.add(new DataSet(R.drawable.hotel_shree_hari,
                "Hotel Shree Hari",
                "Mandir More, Dumka Rd, Jhoushagari, Deoghar, Jharkhand 814122",
                "73240 03011",
                "Rated 4.1 based on 107 Ratings."));
        data.add(new DataSet(R.drawable.hotel_maihar,
                "Hotel Maihar",
                "Daburgram, Jasidih Road, Deoghar, Jharkhand 814142",
                "Rated 4.2 based on 1392 Ratings."));
        data.add(new DataSet(R.drawable.hotel_rajkamal,
                "Hotel Rajkamal",
                "Baidyanathdham Railway Station Rd, Williams Town, Deoghar, Jharkhand 814112",
                "92343 97907",
                "Rated 3.8 based on 687 Ratings."));
        data.add(new DataSet(R.drawable.hotel_yashoda_international,
                "Hotel Yashoda International",
                "Baidyanathdham Station Road, Near Tower Chowk, Deoghar, Jharkhand 814112",
                "90512 11000",
                "Rated 3.4 based on 800 Ratings."));
        data.add(new DataSet(R.drawable.hotel_marine_blu,
                "Hotel Marine Blu",
                "Castairs Town, Bompas Town, Deoghar, Jharkhand 814112",
                "76450 86708",
                "Rated 4.3 based on 198 Ratings."));
    }
}
