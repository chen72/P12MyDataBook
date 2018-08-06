package sg.edu.rp.webservices.p12_mydatabook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomArrayAdapter extends ArrayAdapter {

    private ArrayList<String> al;
    private Context context;
    private TextView tv;
    private ImageView image;

    public CustomArrayAdapter(Context context, int resource, ArrayList<String> objects){
        super(context, resource, objects);
        // Store the food that is passed to this adapter
        al = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }
    // getView() is the method ListView will call to get the
    //  View object every time ListView needs a row
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // Get the TextView object
        tv = (TextView) rowView.findViewById(R.id.alTV);

        String currentString = al.get(position);

        // Get the ImageView object
        image = (ImageView)rowView.findViewById(R.id.alIV);

        if (currentString.equalsIgnoreCase("Bio")){
            image.setImageResource(android.R.drawable.ic_dialog_info);
            tv.setText(currentString);
        }

        else if (currentString.equalsIgnoreCase("Vaccination")){
            image.setImageResource(android.R.drawable.ic_menu_edit);
            tv.setText(currentString);
        }

        else if (currentString.equalsIgnoreCase("Anniversary")){
            image.setImageResource(android.R.drawable.ic_menu_my_calendar);
        }

        else
            image.setImageResource(android.R.drawable.star_big_on);
        tv.setText(currentString);
        // Return the nicely done up View to the ListView
        return rowView;
    }

}
