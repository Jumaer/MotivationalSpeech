package com.example.motivationalspeech.adapter_package;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.motivationalspeech.R;
import com.example.motivationalspeech.modelpackage.RealityModel;

import java.util.ArrayList;

public class AdapterReality extends RecyclerView.Adapter<AdapterReality.ViewHolderReality> {

    Context context;
    ArrayList<RealityModel>realityModelsLst;
    Dialog my_reality_dialog;

    public AdapterReality(Context context, ArrayList<RealityModel> realityModelsLst) {
        this.context = context;
        this.realityModelsLst = realityModelsLst;
    }

    @NonNull
    @Override
    public ViewHolderReality onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.reality_layout_recyclerview,parent,false);
     final    ViewHolderReality vHolder = new ViewHolderReality(view);

     my_reality_dialog = new Dialog(context);
     my_reality_dialog.setContentView(R.layout.reality_data_display);


       vHolder.raw_container.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               TextView my_speaker_display =(TextView)my_reality_dialog.findViewById(R.id.display_reality_speaker);
               TextView my_speech_display = (TextView) my_reality_dialog.findViewById(R.id.display_reality_speech);
               my_speaker_display.setText(realityModelsLst.get(vHolder.getAdapterPosition()).getReality_speaker());
               my_speech_display.setText(realityModelsLst.get(vHolder.getAbsoluteAdapterPosition()).getReality_speech());
              my_reality_dialog.show();
           }
       });

        return  vHolder;
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

          RelativeLayout raw_container;
        TextView reality_speech;
        TextView reality_speaker;
        public ViewHolderReality(@NonNull View itemView) {


            super(itemView);

            raw_container = itemView.findViewById(R.id.raw_container);
            reality_speech= itemView.findViewById(R.id.reality_speech);
            reality_speaker = itemView.findViewById(R.id.reality_speaker);


        }
    }
}
