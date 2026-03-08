package com.launcher.core;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class VersionAdapter extends RecyclerView.Adapter<VersionAdapter.ViewHolder> {
    private List<VersionInfo> versions;

    public VersionAdapter(List<VersionInfo> versions) { this.versions = versions; }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.text.setText(versions.get(position).getId());
    }

    @Override
    public int getItemCount() { return versions.size(); }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView text;
        ViewHolder(View v) { super(v); text = v.findViewById(android.R.id.text1); }
    }
}
