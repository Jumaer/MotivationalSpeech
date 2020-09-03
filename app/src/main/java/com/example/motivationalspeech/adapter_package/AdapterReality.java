package com.example.motivationalspeech.adapter_package;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.motivationalspeech.R;

public class AdapterReality extends RecyclerView.Adapter<AdapterReality.ViewHolderReality> {
    Context context;
    @NonNull
    @Override
    public ViewHolderReality onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.reality_layout_recycleeview,parent,false);
        return new ViewHolderReality(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderReality holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolderReality extends RecyclerView.ViewHolder {
        public ViewHolderReality(@NonNull View itemView) {
            super(itemView);
        }
    }
}
