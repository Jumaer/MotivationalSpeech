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
import com.example.motivationalspeech.modelpackage.Inspiration_model;

import java.util.ArrayList;

public class AdapterInspiration extends RecyclerView.Adapter<AdapterInspiration.ViewHolderInspiration> {
    Context context;
    ArrayList<Inspiration_model>inspiration_models;
    Dialog my_reality_dialog3;

    public AdapterInspiration(Context context, ArrayList<Inspiration_model> inspiration_models) {
        this.context = context;
        this.inspiration_models = inspiration_models;
    }

    @NonNull
    @Override
    public ViewHolderInspiration onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.inspiration_layout_recyclerview,parent,false);
       final ViewHolderInspiration vHolder3 = new ViewHolderInspiration(view);
        my_reality_dialog3 = new Dialog(context);
        my_reality_dialog3.setContentView(R.layout.inspirations_data_display);
        vHolder3.raw_container3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView my_speaker_display3 =(TextView)my_reality_dialog3.findViewById(R.id.display_inspiration_speaker);
                TextView my_speech_display3 =(TextView)my_reality_dialog3.findViewById(R.id.display_inspiration_speech);
                my_speaker_display3.setText(inspiration_models.get(vHolder3.getAdapterPosition()).getInspirational_speaker());
                my_speech_display3.setText(inspiration_models.get(vHolder3.getAdapterPosition()).getInspirational_speech());
                my_reality_dialog3.show();
            }
        });

        return  vHolder3;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderInspiration holder, int position) {
  Inspiration_model inspiration_model = inspiration_models.get(position);
  holder.inspirational_speech.setText(inspiration_model.getInspirational_speech());
  holder.inspirational_speaker.setText(inspiration_model.getInspirational_speaker());

    }

    @Override
    public int getItemCount() {
        return inspiration_models.size();
    }

    public class ViewHolderInspiration extends RecyclerView.ViewHolder {
        RelativeLayout raw_container3;
        TextView inspirational_speech;
        TextView inspirational_speaker;
        public ViewHolderInspiration(@NonNull View itemView) {
            super(itemView);
            raw_container3 = itemView.findViewById(R.id.raw_container3);
            inspirational_speech = itemView.findViewById(R.id.Inspirational_speech);
            inspirational_speaker = itemView.findViewById(R.id.inspirational_speaker);
        }
    }
}
