package Adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.fachrul.yac1.R;

import java.util.Objects;

/**
 * Created by FACHRUL on 4/22/2016.
 */
public class ViewPagerAdapter extends PagerAdapter{
    Context context;
    String[] No_anggota;
    String[] Nama;
    String[] Umur;
    int[] Foto;
    LayoutInflater inflater;

    public ViewPagerAdapter(Context context, String[] No_anggota, String[] Nama,
                            String[] Umur, int[] foto){
        this.context = context;
        this.No_anggota = No_anggota;
        this.Nama = Nama;
        this.Foto = foto;
        this.Umur = Umur;
    }
    @Override
    public int getCount(){return No_anggota.length;}

    @Override
    public boolean isViewFromObject(View view,Object object) {
        return view == ((LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){
        TextView no;
        TextView nama;
        TextView umur;
        ImageView imgflag;

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.item, container, false);


        no = (TextView) itemView.findViewById(R.id.No);
        nama = (TextView) itemView.findViewById(R.id.Nama);
        umur = (TextView) itemView.findViewById(R.id.Umur);

        no.setText(No_anggota[position]);
        nama.setText(Nama[position]);
        umur.setText(Umur[position]);

        imgflag = (ImageView) itemView.findViewById(R.id.flag);
        imgflag.setImageResource(Foto[position]);

        ((ViewPager) container).addView(itemView);

        return itemView;

    }

    public void destroyItem(ViewGroup container, int position, Object object){
        ((ViewPager) container).removeView((LinearLayout) object);
    }
}
