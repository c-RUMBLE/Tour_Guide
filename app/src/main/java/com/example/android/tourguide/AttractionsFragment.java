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

public class AttractionsFragment extends Fragment {

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

        data.add(new DataSet(R.drawable.att_baba_baidyanath_dham,
                "Baba Baidyanath Dham",
                "Shivganga Muhalla, Deoghar, Jharkhand 814112",
                "62067 86114",
                "Rated 4.7 based on 34607 Ratings."));
        data.add(new DataSet(R.drawable.att_shiv_ganga,
                "Shiv Ganga",
                "Shiv Ganga Rd, Bilasi Town, Deoghar, Jharkhand 814122",
                "Rated 4.5 based on 279 Ratings."));
        data.add(new DataSet(R.drawable.att_baba_basukinath_dham,
                "Baba Basukinath Dham",
                "Basukinath Mandir Rd, Basukinath, Jharkhand 814118",
                "97090 62573",
                "Rated 4.7 based on 1465 Ratings."));
        data.add(new DataSet(R.drawable.att_naulakha_temple,
                "Naulakha Temple",
                "Karnibad, Deoghar, Jharkhand 814112",
                "Rated 4.4 based on 2163 Ratings."));
        data.add(new DataSet(R.drawable.att_navdurga_temple,
                "Navdurga Temple",
                "Bompas Town, Deoghar, Jharkhand 814114",
                "Rated 4.3 based on 92 Ratings."));
        data.add(new DataSet(R.drawable.att_tapovan,
                "Tapovan",
                "Chihardhandhiya, Jharkhand 814112",
                "Rated 4.3 based on 3345 Ratings."));
        data.add(new DataSet(R.drawable.att_trikut,
                "Trikuti Hill",
                "Jharkhand 814157",
                "Rated 4.4 based on 1287 Ratings."));
        data.add(new DataSet(R.drawable.att_satsang_ashram,
                "Satsang Ashram",
                "Rina Mandal Rd, Satsang Nagar, Deoghar, Jharkhand 814112",
                "Rated 4.6 based on 424 Ratings."));
    }
}
