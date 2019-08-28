package View;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.cdlapp.R;

import java.util.ArrayList;

import Model.Equipment;


public class AdpterEquipment extends PagerAdapter {
    private ArrayList<Equipment> Equipments;
    private LayoutInflater layoutInflater;
    private Context context;

    public AdpterEquipment(ArrayList<Equipment> equipments, Context context) {
        this.Equipments = equipments;
        this.context = context;
    }

    @Override
    public int getCount() {
        return Equipments.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item, container, false);
        ImageView imageView;
        TextView title, desc, price;
        imageView = view.findViewById(R.id.image);
        title = view.findViewById(R.id.title);
        desc = view.findViewById(R.id.description);
        price = view.findViewById(R.id.price);
        imageView.setImageResource(Equipments.get(position).getRefrence());
        title.setText(Equipments.get(position).getTitle());
        desc.setText(Equipments.get(position).getDescription());
        price.setText(Equipments.get(position).getPrice());

        container.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
