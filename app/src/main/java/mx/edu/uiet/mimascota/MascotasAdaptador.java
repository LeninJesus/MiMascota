package mx.edu.uiet.mimascota;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Hikaru on 02/10/2016.
 */
public class MascotasAdaptador extends RecyclerView.Adapter<MascotasAdaptador.MascotasViewHolder> {
    ArrayList<Mascotas> mascotas;
public MascotasAdaptador(ArrayList<Mascotas> mascotas){
   this.mascotas = mascotas;
}

    @Override
    public MascotasViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_cardview_mascotas, parent,false);

        return new MascotasViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MascotasViewHolder mascotasViewHolder, int position) {
        final Mascotas mascota = mascotas.get(position);
        mascotasViewHolder.imvMiMascotaCV.setImageResource(mascota.getImg_mascota());
        mascotasViewHolder.NombreMascotaCV.setText(mascota.getNomnre_mascota());

        mascotasViewHolder.imgbHuesoBlancoLike.setOnClickListener(new View.OnClickListener(){
            public  void onClick (View view){

            }
        });


    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotasViewHolder extends RecyclerView.ViewHolder{
        private ImageView imvMiMascotaCV;
        private TextView NombreMascotaCV;
        private ImageButton imgbHuesoBlancoLike;
        public MascotasViewHolder(View itemView) {
            super(itemView);
            imvMiMascotaCV = (ImageView) itemView.findViewById(R.id.imvMiMascota);
            NombreMascotaCV = (TextView) itemView.findViewById(R.id.NombreMascota);
            imgbHuesoBlancoLike = (ImageButton) itemView.findViewById(R.id.imgbHuesoBlancoLike);

        }
    }
}
