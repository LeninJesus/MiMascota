package mx.edu.uiet.mimascota;

/**
 * Created by Hikaru on 02/10/2016.
 */
public class Mascotas {
    private String nomnre_mascota;
    private int img_mascota;

    public Mascotas (int img_mascota, String nomnre_mascota){
        this.img_mascota= img_mascota;
        this.nomnre_mascota = nomnre_mascota;

    }

    public int getImg_mascota() {
        return img_mascota;
    }

    public void setImg_mascota(int img_mascota) {
        this.img_mascota = img_mascota;
    }

    public String getNomnre_mascota() {
        return nomnre_mascota;
    }

    public void setNomnre_mascota(String nomnre_mascota) {
        this.nomnre_mascota = nomnre_mascota;
    }
}
