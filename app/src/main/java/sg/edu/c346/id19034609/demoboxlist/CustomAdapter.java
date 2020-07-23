package sg.edu.c346.id19034609.demoboxlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Box> boxList;

    public CustomAdapter(Context context, int resource, ArrayList<Box> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        boxList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        ImageView ivBox = rowView.findViewById(R.id.imageViewBox);

        // Obtain the Android Version information based on the position
        Box currentBox = boxList.get(position);

        // Set values to the TextView to display the corresponding information
        if (currentBox.getColour() == "Blue") {
            ivBox.setImageResource(R.drawable.blue_box);
        }
        else if (currentBox.getColour() == "Orange") {
            ivBox.setImageResource(R.drawable.orange_box);
        }
        else if (currentBox.getColour() == "Brown") {
            ivBox.setImageResource(R.drawable.brown_box);
        }

        return rowView;
    }

}
