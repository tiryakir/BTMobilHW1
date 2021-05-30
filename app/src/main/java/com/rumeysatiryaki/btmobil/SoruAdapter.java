package com.rumeysatiryaki.btmobil;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SoruAdapter extends RecyclerView.Adapter<SoruAdapter.MyViewHolder> {
    Context context;
    List<Sorular> sorulars;
    
    public SoruAdapter(Context context, List<Sorular> sorulars){
        this.context = context;
        this.sorulars = sorulars;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView TextSoruMetni2;
        TextView TextA;
        TextView TextB;
        TextView TextC;
        TextView TextD;
        TextView Zorluk;
        TextView CorrectAns;
        ToggleButton btn_sec;
        
    }
    public MyViewHolder(View itemView){
        super(itemView);
        
        TextSoruMetni2 = itemView.findViewById(R.id.TextSoruMetni2);
        TextA = itemView.findViewById(R.id.TextA);
        TextB = itemView.findViewById(R.id.TextB);
        TextC = itemView.findViewById(R.id.TextC);
        TextD = itemView.findViewById(R.id.TextD);
        Zorluk = itemView.findViewById(R.id.Zorluk);
        CorrectAns = itemView.findViewById(R.id.CorrectAns);
        btn_sec = itemView.findViewById(R.id.btn_sec);

    }
    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position){
        holder.TextSoruMetni2.setText(sorulars.get(position).getTextSoruMetni2());
        holder.TextA.setText(sorulars.get().getTextA());
        holder.TextB.setText(sorulars.get().getTextB());
        holder.TextC.setText(sorulars.get().getTextC());
        holder.TextD.setText(sorulars.get().getTextD());
        holder.CorrectAns.setText(sorulars.get().getCorrectAns());
        holder.Zorluk.setText(sorulars.get().getZorluk());
        holder.btn_sec.setOnClickListener((v) ->{
            boolean on = ((ToggleButton) v).isChecked();
            if(on) {
                holder.btn_sec.setText("soruyu sil");
            }else
                holder.btn_sec.(sorulars.get(position.getbtn_sec));
        }

        }





}
