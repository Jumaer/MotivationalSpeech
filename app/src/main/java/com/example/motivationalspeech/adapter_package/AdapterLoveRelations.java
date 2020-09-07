package com.example.motivationalspeech.adapter_package;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.motivationalspeech.R;

import com.example.motivationalspeech.modelpackage.LoveRelationsModel;

import java.util.ArrayList;

public class AdapterLoveRelations extends RecyclerView.Adapter<AdapterLoveRelations.ViewHolderLoveRelations> {

    Context context;
    ArrayList<LoveRelationsModel> loveRelationsModelsLst;
    Dialog my_reality_dialog2;


    public AdapterLoveRelations(Context context, ArrayList<LoveRelationsModel> relationsModelsLst) {
        this.context = context;
        this.loveRelationsModelsLst = relationsModelsLst;

    }

    @NonNull
    @Override
    public ViewHolderLoveRelations onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.love_layout_recyclerview,parent,false);
        final ViewHolderLoveRelations vHolder = new ViewHolderLoveRelations(view);
        my_reality_dialog2 = new Dialog(context);
        my_reality_dialog2.setContentView(R.layout.love_data_display);



        vHolder.raw_container2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView my_speaker_display2 =(TextView)my_reality_dialog2.findViewById(R.id.display_love_speaker);
                TextView my_speech_display2  = (TextView) my_reality_dialog2.findViewById(R.id.display_love_speech);
                my_speaker_display2.setText(loveRelationsModelsLst.get(vHolder.getAdapterPosition()).getLoveRelationsSpeaker());
                my_speech_display2.setText(loveRelationsModelsLst.get(vHolder.getAbsoluteAdapterPosition()).getLoveRelationsSpeech());
                my_reality_dialog2.show();
            }
        });
        return vHolder;
    }



    @Override
    public void onBindViewHolder(@NonNull ViewHolderLoveRelations holder, int position) {
        LoveRelationsModel loveRelationsModel = loveRelationsModelsLst.get(position);
       holder.love_relations_speech.setText(loveRelationsModel.getLoveRelationsSpeech());
       holder.love_relations_speaker.setText(loveRelationsModel.getLoveRelationsSpeaker());

    }

    @Override
    public int getItemCount() {
        return loveRelationsModelsLst.size();
    }

    public class ViewHolderLoveRelations extends RecyclerView.ViewHolder {

        TextView love_relations_speech;
        TextView love_relations_speaker;
        RelativeLayout raw_container2;

        public ViewHolderLoveRelations(@NonNull View itemView) {
            super(itemView);

            love_relations_speech = itemView.findViewById(R.id.love_relations_speech);
            love_relations_speaker = itemView.findViewById(R.id.love_relations_speaker);
            raw_container2 = itemView.findViewById(R.id.raw_container2);




        }
    }



}
