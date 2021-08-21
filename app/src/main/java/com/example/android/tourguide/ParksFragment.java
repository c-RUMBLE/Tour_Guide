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

public class ParksFragment extends Fragment {

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
        data.add(new DataSet(R.drawable.park_jalsar,
                "Jalsar Children Park",
                "Jalsar park, Shivganga Muhalla, Deoghar, Jharkhand 814112",
                "Rated 3.7 based on 1134 Ratings."));
        data.add(new DataSet(R.drawable.park_jalan,
                "Jalan Park",
                "Karnibad, Deoghar, Jharkhand 814114",
                "Rated 3.6 based on 73 Ratings."));
        data.add(new DataSet(R.drawable.park_nandan_pahar,
                "Nandan Pahar Park",
                "Nandan Pahar Rd, Near Satsang Chowk, Barmasia, Deoghar, Jharkhand 814112",
                "94313 96940",
                "Rated 4.1 based on 1918 Ratings."));
        data.add(new DataSet(R.drawable.park_hanuman_tikri,
                "Hanuman Tikri Park",
                "Kali Mandir Rd, Williams Town, Deoghar, Jharkhand 814112",
                "Rated 3.8 based on 19 Ratings."));
        data.add(new DataSet(R.drawable.park_saheb_pokhra,
                "Saheb Pokhra Park",
                "Rina Rd, Saheb Pokhara Rd, Williams Town, Deoghar, Jharkhand 814112",
                "Rated 3.9 based on 8 Ratings."));
        data.add(new DataSet(R.drawable.park_sakhua_jungle,
                "Sakhua Jungle Park",
                "Shahid Ashram Rd, Jhoushagari, Deoghar, Jharkhand 814122",
                "Rated 4.7 based on 6 Ratings."));
        data.add(new DataSet(R.drawable.park_atal_smriti,
                "Atal Smriti Park",
                "AS College Rd, Satsang Nagar, Deoghar, Jharkhand 814116",
                "Rated 4.6 based on 21 Ratings."));
        data.add(new DataSet(R.drawable.park_biodiversity,
                "Biodiversity Park",
                "Dgaria pahar, Deoghar, Jharkhand 814112",
                "Rated 3.9 based on 10 Ratings."));
    }
}
