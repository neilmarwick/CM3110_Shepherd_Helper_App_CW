package rgu.ac.uk.cm3110app20047522;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Sheep_RecyclerViewAdapter extends RecyclerView.Adapter<Sheep_RecyclerViewAdapter.MyViewHolder> {
    /*private final RecyclerViewInterface recyclerViewInterface;*/

    //context required for inflating the layout
    Context context;
    //the data we are passing in to the RecyclerView. It holds all the models
    ArrayList<SheepModel> sheepModels;

    //Gets values for the above variables
    public Sheep_RecyclerViewAdapter(Context context, ArrayList<SheepModel> sheepModels/*, RecyclerViewInterface recyclerViewInterface*/){
        this.context = context;
        this.sheepModels = sheepModels;
        /*this.recyclerViewInterface = recyclerViewInterface;*/
    }


    @NonNull
    @Override
    //This method inflates the layout (give a look to the rows)
    public Sheep_RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_view_row, parent, false);
        return new Sheep_RecyclerViewAdapter.MyViewHolder(view/*, recyclerViewInterface*/);
    }

    @Override
    public void onBindViewHolder(@NonNull Sheep_RecyclerViewAdapter.MyViewHolder holder, int position) {
        //this is where we assign values to each of our rows as they come back on the screen,
        //this is going to depend on the position of the RecyclerView.
        //giving values to the views that were created in recycler_view_row layout file
        holder.tagNumberTV.setText(sheepModels.get(position).getSheepTagNumber());
        holder.breedTV.setText(sheepModels.get(position).getSheepBreed());
        holder.genderTV.setText(sheepModels.get(position).getSheepGender());
       /* holder.imageView.setImageResource(sheepModels.get(position).getImage());*/
    }

    @Override
    public int getItemCount() {
        //this method returns the number of items we want to show in the RecyclerView (it's 10)
        return sheepModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        //gets all the views from recycler_view_row layout file and assigns them to variables
        /*ImageView imageView;*/
        //TV = TextView
        TextView tagNumberTV, breedTV, genderTV;

        public MyViewHolder(@NonNull View itemView/*, RecyclerViewInterface recyclerViewInterface*/) {
            super(itemView);

            /*imageView = itemView.findViewById(R.id.imageView);*/
            tagNumberTV = itemView.findViewById(R.id.textView);
            breedTV = itemView.findViewById(R.id.textView2);
            genderTV = itemView.findViewById(R.id.textView3);

           /* itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(recyclerViewInterface != null){
                        int pos = getAdapterPosition();

                        if(pos != RecyclerView.NO_POSITION){
                            recyclerViewInterface.whenSheepClicked(pos);
                        }
                    }
                }
            });*/
        }
    }
}
