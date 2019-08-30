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

import Model.Events;

public class AdapterEvents extends PagerAdapter {
    private ArrayList<Events> Events;
    private LayoutInflater layoutInflater;
    private Context context;

    public AdapterEvents(ArrayList<Events> equipments, Context context) {
        this.Events = equipments;
        this.context = context;
    }

    @Override
    public int getCount() {
        return Events.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.event, container, false);
        ImageView imageView;
        TextView name, desc, price, date;
        imageView = view.findViewById(R.id.image);
        name = view.findViewById(R.id.titleevent);
        desc = view.findViewById(R.id.descriptionevent);
        price = view.findViewById(R.id.priceevent);
        date = view.findViewById(R.id.dateevent);
        imageView.setImageResource(Events.get(position).getId());
        name.setText(Events.get(position).getName());
        desc.setText(Events.get(position).getDescription());
        price.setText(Events.get(position).getPrice());
        date.setText(Events.get(position).getDate());
        container.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}


