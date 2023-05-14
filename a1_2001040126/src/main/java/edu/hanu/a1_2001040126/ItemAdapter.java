package edu.hanu.a1_2001040126;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder>{
        private List<Item> items;
        private Context context;
        public ItemAdapter(Context context, List<Item> list) {
                this.context = context;
                this.items = list;
                soundMap = new HashMap<>();
//                intSound();
        }

        @NonNull
        @Override
        public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                LayoutInflater inflater = LayoutInflater.from(context);
                View itemView = inflater.inflate(R.layout.item_layout,parent,false);
                //return ViewHolder
                return new ItemViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
                Item item = items.get(position);
                ((ItemViewHolder)holder).onBind(item);
        }

        @Override
        public int getItemCount() {
                return items.size();
        }
        private HashMap<Integer, Integer> soundMap;
        private MediaPlayer mediaPlayer;

        //create view holder extend view holder
        public  class ItemViewHolder extends RecyclerView.ViewHolder {

                private ImageView imageAlphabet;
                private int sound;
                public ItemViewHolder(@NonNull View itemView) {
                        super(itemView);
                        imageAlphabet = itemView.findViewById(R.id.imgItem);
                        imageAlphabet.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                        Animation animation = AnimationUtils.loadAnimation(itemView.getContext(), R.anim.item_animation);
                                        itemView.startAnimation(animation);
                                        if (mediaPlayer != null && mediaPlayer.isPlaying()){
                                                mediaPlayer.stop();
                                                mediaPlayer.release();
                                        }
                                        mediaPlayer = MediaPlayer.create(context,sound);
                                        mediaPlayer.start();
                                }
                        });
                }
                public void onBind(Item item){
                        sound = item.getSound();
                        imageAlphabet.setImageResource(item.getInmage());
                }


        }


}
