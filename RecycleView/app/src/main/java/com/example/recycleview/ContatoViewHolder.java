package com.example.recycleview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class ContatoViewHolder extends RecyclerView.ViewHolder {

    TextView nomeTextView;
    TextView telefoneTextView;

    public ContatoViewHolder(@NonNull View itemView) {
        super(itemView);

        nomeTextView = (TextView)
                itemView.findViewById(R.id.textViewNome);

        telefoneTextView = (TextView)
                itemView.findViewById(R.id.textViewTelefone);



    }
}