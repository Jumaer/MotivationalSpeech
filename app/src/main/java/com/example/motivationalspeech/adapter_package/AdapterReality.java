package com.example.motivationalspeech.adapter_package;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.motivationalspeech.R;
import com.example.motivationalspeech.modelpackage.RealityModel;

import java.util.ArrayList;

public class AdapterReality extends RecyclerView.Adapter<AdapterReality.ViewHolderReality> {

    Context context;
    ArrayList<RealityModel>realityModelsLst;

    public AdapterReality(Context context, ArrayList<RealityModel> realityModelsLst) {
        this.context = context;
        this.realityModelsLst = realityModelsLst;
    }

    @NonNull
    @Override
    public ViewHolderReality onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.reality_layout_recyclerview,parent,false);
        return new ViewHolderReality(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderReality holder, int position) {
        RealityModel realityModel = realityModelsLst.get(position);
        holder.reality_speech.setText(realityModel.getReality_speech());
        holder.reality_speaker.setText(realityModel.getReality_speaker());


    }

    @Override
    public int getItemCount() {
        return realityModelsLst.size();
    }

    public class ViewHolderReality extends RecyclerView.ViewHolder {

        TextView reality_speech;
        TextView reality_speaker;
        public ViewHolderReality(@NonNull View itemView) {


            super(itemView);
            reality_speech= itemView.findViewById(R.id.reality_speech);
            reality_speaker = itemView.findViewById(R.id.reality_speaker);


        }
    }
}
