package com.example.motivationalspeech.adapter_package;

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
    private RecycleItemClick recycleItemClick ;

    public AdapterLoveRelations(Context context, ArrayList<LoveRelationsModel> relationsModelsLst, RecycleItemClick recycleItemClick) {
        this.context = context;
        this.loveRelationsModelsLst = relationsModelsLst;
        this.recycleItemClick = recycleItemClick;
    }

    @NonNull
    @Override
    public ViewHolderLoveRelations onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.love_layout_recyclerview,parent,false);
        return new ViewHolderLoveRelations(view);
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
        RelativeLayout relative_love_relation_container;

        public ViewHolderLoveRelations(@NonNull View itemView) {
            super(itemView);

            love_relations_speech = itemView.findViewById(R.id.love_relations_speech);
            love_relations_speaker = itemView.findViewById(R.id.love_relations_speaker);
            relative_love_relation_container = itemView.findViewById(R.id.relative_love_relation_container);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    recycleItemClick.onItemClick(loveRelationsModelsLst.get(getAdapterPosition()));
                }
            });


        }
    }

    public interface RecycleItemClick {
        void onItemClick(LoveRelationsModel loveRelationsModel);

    }

}
