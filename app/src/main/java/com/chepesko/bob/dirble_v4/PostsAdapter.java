package com.chepesko.bob.dirble_v4;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chepesko.bob.dirble_v4.Shems.Model;
import com.chepesko.bob.dirble_v4.Shems.Stream;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bob on 03.10.2017.
 */
public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.ViewHolder> {
    private List<Model> posts;
    public ArrayList<String> str=new ArrayList<>();



    public PostsAdapter(List<Model> posts) {
        this.posts = posts;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Model post = posts.get(position);
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
//            holder.post.setText(Html.fromHtml(post.getName(), Html.FROM_HTML_MODE_LEGACY));
//        } else {
//            holder.post.setText(Html.fromHtml(post.getName()));
//        }

        // System.out.println(post.getStreams());
        holder.post.setText(Html.fromHtml(post.getName()));
        holder.site.setText(post.getWebsite());
        //  holder.site.getText(post.getStreams());



    }
    @Override
    public int getItemCount() {
        if (posts == null)
            return 0;
        return posts.size();
    }



    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView post;
        TextView site;
        String StreamPosts;
        private final Context context;
        private List<Stream> streamList;
        String streamPosts;

        public ViewHolder(View itemView) {
            super(itemView);
            context = itemView.getContext();

            post = (TextView) itemView.findViewById(R.id.postitem_post);
            site = (TextView) itemView.findViewById(R.id.postitem_site);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            itemClick(position);
            System.out.println("ССЫЛКА В РЕЦЫКЛВБЮ:"+streamPosts);
            context.stopService(new Intent(context, RadioService.class));
            context.startService(new Intent(context,RadioService.class)
                    .putExtra("stream",streamPosts));
            //Intent i=new Intent(context,RadioService.class);
            //i.putExtra("stream",streamPosts);
            //context.startActivity(i);


        }

        private void itemClick(int position) {
           // System.out.println(position);
            streamList=posts.get(position).getStreams();
            streamPosts=streamList.get(0).getStream();
           // System.out.println(post.getText());
           // System.out.println(site.getText());



        }
    }}