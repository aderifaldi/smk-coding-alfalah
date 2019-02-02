package id.smkcoding.siswa;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import java.util.ArrayList;

public class NilaiAdapter extends RecyclerView.Adapter<NilaiAdapter.MyViewHolder> {

    private ArrayList<Nilai> data;
    private LayoutInflater inflater;
    private Context context;
    private AdapterView.OnItemClickListener onItemClickListener;
    private Point screenSize;

    public NilaiAdapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.data = new ArrayList<>();
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public ArrayList<Nilai> getData() {
        return data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = (LayoutInflater) parent.getContext().getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.nilai_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        final Nilai item = data.get(position);
        holder.position = position;

        holder.txtNamaPelajaran.setText(item.getNamaPelajaran());
        holder.txtNilai.setText("" + item.getNilai());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        int position;

        private TextView txtNamaPelajaran, txtNilai;

        public MyViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            txtNamaPelajaran = itemView.findViewById(R.id.txtNamaPelajaran);
            txtNilai = itemView.findViewById(R.id.txtNilai);
        }

        @Override
        public void onClick(View v) {
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(null, v, position, 0);
            }
        }
    }
}
