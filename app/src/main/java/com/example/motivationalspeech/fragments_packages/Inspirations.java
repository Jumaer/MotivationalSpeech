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
import com.example.motivationalspeech.adapter_package.AdapterInspiration;
import com.example.motivationalspeech.adapter_package.AdapterLoveRelations;
import com.example.motivationalspeech.modelpackage.Inspiration_model;
import com.example.motivationalspeech.modelpackage.LoveRelationsModel;

public class Inspirations extends Fragment {
    public Inspirations() {
    }

    RecyclerView inspiration_recycle;
    AdapterInspiration adapterInspiration ;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vInspirations = inflater.inflate(R.layout.inspirations,container,false);
       inspiration_recycle= (RecyclerView) vInspirations.findViewById(R.id.recycle_inspirations);
        adapterInspiration = new AdapterInspiration( getActivity(), Inspiration_model.generateAllInspirations());
        GridLayoutManager gl_mex = new GridLayoutManager(getContext(),2);
      inspiration_recycle.setLayoutManager(gl_mex);
      inspiration_recycle.setHasFixedSize(true);
      inspiration_recycle.setItemViewCacheSize(20);
      inspiration_recycle.setAdapter(adapterInspiration);
        return vInspirations;
    }
}
