package com.example.motivationalspeech.fragments_packages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.motivationalspeech.R;
import com.example.motivationalspeech.adapter_package.AdapterReality;
import com.example.motivationalspeech.modelpackage.RealityModel;

public class Reality extends Fragment {
    public Reality(){

    }

    RecyclerView reality_recycle_display;
    AdapterReality adapterReality;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View vReality = inflater.inflate(R.layout.reality,container,false);
        reality_recycle_display= (RecyclerView) vReality.findViewById(R.id.recycle_reality);
        adapterReality = new AdapterReality( getActivity(), RealityModel.generate_all_reality_models());
        GridLayoutManager gl_mex = new GridLayoutManager(getContext(),2);
        reality_recycle_display.setLayoutManager(gl_mex);
        reality_recycle_display.setHasFixedSize(true);
        reality_recycle_display.setItemViewCacheSize(20);
        reality_recycle_display.setAdapter(adapterReality);
        return vReality;

    }
}
