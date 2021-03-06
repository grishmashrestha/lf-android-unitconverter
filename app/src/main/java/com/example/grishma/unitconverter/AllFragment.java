package com.example.grishma.unitconverter;

import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.grishma.unitconverter.model.AllMenuModel;


/**
 * A simple {@link Fragment} subclass.
 */
public class AllFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_all, container, false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);

        AllMenuModel[] allMenuModels = setAttribute(getActivity().getResources().getStringArray(R.array.all_menu_tabs_array));
        mLayoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new AllFragmentAdapter(allMenuModels);
        mRecyclerView.setAdapter(mAdapter);

        return view;
    }

    private AllMenuModel[] setAttribute(String[] array) {
        AllMenuModel[] allMenu = new AllMenuModel[array.length];
        for (int i = 0; i < array.length; i++) {
            @DrawableRes int imagePath = getImagePath(array[i]);
            AllMenuModel singleAllMenu = new AllMenuModel(array[i], imagePath);
            allMenu[i] = singleAllMenu;
        }
        return allMenu;
    }

    private @DrawableRes int getImagePath(String AllMenus) {
        switch (AllMenus) {
            case "Temperature":
                return R.drawable.thermometer;
            case "Weight":
                return R.drawable.weight;
            case "Length":
                return R.drawable.ruler;
            default:
                return R.drawable.timer;
        }
    }
}
