package com.example.motivationalspeech.fragments_packages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.motivationalspeech.R;
import com.example.motivationalspeech.adapter_package.AdapterLoveRelations;
import com.example.motivationalspeech.adapter_package.AdapterReality;

import com.example.motivationalspeech.modelpackage.LoveRelationsModel;
import com.example.motivationalspeech.modelpackage.RealityModel;

public class Love_Relations extends Fragment implements AdapterLoveRelations.RecycleItemClick {
    public Love_Relations() {
    }

   RecyclerView love_relations_recycle;
    AdapterLoveRelations love_relations_adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vLRelations = inflater.inflate(R.layout.love_relations,container,false);
      love_relations_recycle= (RecyclerView) vLRelations.findViewById(R.id.recycle_love_relations);
        love_relations_adapter = new AdapterLoveRelations( getActivity(), LoveRelationsModel.generate_all_loveRelations_model(),  this);
        GridLayoutManager gl_mex = new GridLayoutManager(getContext(),2);
       love_relations_recycle.setLayoutManager(gl_mex);
       love_relations_recycle.setItemViewCacheSize(20);
       love_relations_recycle.setHasFixedSize(true);
       love_relations_recycle.setAdapter(love_relations_adapter);
        return vLRelations;
    }


    @Override
    public void onItemClick(LoveRelationsModel loveRelationsModel) {
         Toast.makeText(getActivity(),loveRelationsModel.getLoveRelationsSpeech(),Toast.LENGTH_SHORT).show();
      //  Toast.makeText(getActivity(),loveRelationsModel.getLoveRelationsSpeaker(),Toast.LENGTH_SHORT).show();
    }
}
