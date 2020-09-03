package com.example.motivationalspeech.adapter_package;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.motivationalspeech.R;
import com.example.motivationalspeech.modelpackage.Inspiration_model;

import java.util.ArrayList;

public class AdapterInspiration extends RecyclerView.Adapter<AdapterInspiration.ViewHolderInspiration> {
    Context context;
    ArrayList<Inspiration_model>inspiration_models;

    public AdapterInspiration(Context context, ArrayList<Inspiration_model> inspiration_models) {
        this.context = context;
        this.inspiration_models = inspiration_models;
    }

    @NonNull
    @Override
    public ViewHolderInspiration onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.inspiration_layout_recyclerview,parent,false);
        return new ViewHolderInspiration(view);
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

        TextView inspirational_speech;
        TextView inspirational_speaker;
        public ViewHolderInspiration(@NonNull View itemView) {
            super(itemView);
            inspirational_speech = itemView.findViewById(R.id.Inspirational_speech);
            inspirational_speaker = itemView.findViewById(R.id.inspirational_speaker);
        }
    }
}
