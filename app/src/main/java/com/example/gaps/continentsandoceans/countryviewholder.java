package com.example.gaps.continentsandoceans;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public final class countryviewholder extends RecyclerView.ViewHolder {
    private ImageView imageView ;
    private  TextView name;
    private  TextView cname;
    countryviewholder(View itemView) {
        super(itemView);
        this.imageView = imageView;
        this.name = name;
        this.cname = cname;
    }
    public void setCname(String d) {
        cname.setText(d);
    }
    public void setImage(String image, Context context) {
        Glide.with(context).load(image).into(imageView);


    }
    public void setName(String n) {
        name.setText(n);
    }



}