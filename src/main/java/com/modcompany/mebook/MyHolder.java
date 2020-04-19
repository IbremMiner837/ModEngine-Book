package com.modcompany.mebook;

import android.*;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder {

    ImageView mImageView;
    TextView mTitle, mDes;

    MyHolder(@NonNull View itemView) {
        super(itemView);

        this.mImageView = itemView.findViewById(R.id.icon0);
        this.mTitle = itemView.findViewById(R.id.item_name);
        this.mDes = itemView.findViewById(R.id.item_description);
;
    }

}
