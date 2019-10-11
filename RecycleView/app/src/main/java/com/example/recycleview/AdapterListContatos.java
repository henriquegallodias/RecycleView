package com.example.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class AdapterListContatos  extends RecyclerView.Adapter {

    private final List<Contatos> ContatosRecebidosNoConstrutor;
    private final Context contextRecebidoNoConstrutor;

    public AdapterListContatos(List<Contatos> listaDeAlunos, Context context) {
        this.ContatosRecebidosNoConstrutor = listaDeAlunos;
        this.contextRecebidoNoConstrutor = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view =
                LayoutInflater.from(contextRecebidoNoConstrutor).
                        inflate(R.layout.rvlist, parent, false);

        ContatoViewHolder CViewHolder = new ContatoViewHolder(view);

        return CViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {

        ContatoViewHolder CViewHolder = (ContatoViewHolder) viewHolder;
        Contatos contatos = this.ContatosRecebidosNoConstrutor.get(position) ;

        CViewHolder.nomeTextView.setText(contatos.getNome());
        CViewHolder.telefoneTextView.setText(contatos.getTelefone().toString());
    }

    @Override
    public int getItemCount() {
        return this.ContatosRecebidosNoConstrutor.size();
    }
}