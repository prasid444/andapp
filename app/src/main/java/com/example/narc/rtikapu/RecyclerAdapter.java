package com.example.narc.rtikapu;

/**
 * Created by Ankit on 8/15/2017.
 */
import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private String[] titles = {"उद्घाटन कार्यक्रम ",
            "भारि वर्षा  ",
            "सुचना !!! ",
            "सुचना !!! ",
            "सुचना !!! ",
            "सुचना !!! ",
            "सुचना !!! ",
            "सुचना !!! "};

    private String[] details = {"नेपालको प्रधानमन्त्री द्वारा भर्खरै नया पूलको उत्घाटन   ",
            "बर्षा को कारण काठमाडौँ मा पेट्रोल को समस्या   ", "यहाँ समाचारको भाग हुने छ  यहाँ समाचारको भाग हुने छ  यहाँ समाचारको भाग हुने छ  ",
            "यहाँ समाचारको भाग हुने छ  यहाँ समाचारको भाग हुने छ  यहाँ समाचारको भाग हुने छ  ", "यहाँ समाचारको भाग हुने छ  यहाँ समाचारको भाग हुने छ  यहाँ समाचारको भाग हुने छ  ",
            "यहाँ समाचारको भाग हुने छ  यहाँ समाचारको भाग हुने छ  यहाँ समाचारको भाग हुने छ  ", "यहाँ समाचारको भाग हुने छ  यहाँ समाचारको भाग हुने छ  यहाँ समाचारको भाग हुने छ  ",
            "यहाँ समाचारको भाग हुने छ  यहाँ समाचारको भाग हुने छ  यहाँ समाचारको भाग हुने छ  "};

    private int[] images = { R.drawable.raincloudicon,
            R.drawable.raincloudicon,
            R.drawable.raincloudicon,
            R.drawable.raincloudicon,
            R.drawable.raincloudicon,
            R.drawable.raincloudicon,
            R.drawable.raincloudicon,
            R.drawable.raincloudicon };
    private String successcolor= "#2dae7d";
    class ViewHolder extends RecyclerView.ViewHolder{

        public int currentItem;
        public ImageView itemImage;
        public TextView itemTitle;
        public TextView itemDetail;
        public CardView cardView;

        public ViewHolder(View itemView) {
            super(itemView);
            itemImage = (ImageView)itemView.findViewById(R.id.item_image);
            itemTitle = (TextView)itemView.findViewById(R.id.item_title);
            itemDetail =
                    (TextView)itemView.findViewById(R.id.item_detail);
            cardView=(CardView)itemView.findViewById(R.id.card_view);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    int position = getAdapterPosition();

//                    Snackbar.make(v, "Click detected on news " + position,
//                            Snackbar.LENGTH_LONG)
//                            .setAction("Action", null).show();
                    Intent i= new Intent(v.getContext(),NewsView.class);
                    v.getContext().startActivity(i);

                    //v.startActivity(i);
                }
            });
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.card_layout, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        if(i<2){
            viewHolder.cardView.setCardBackgroundColor(0xFF2dae7d);
        }
        else {

        }
        viewHolder.itemTitle.setText(titles[i]);
        viewHolder.itemDetail.setText(details[i]);
        viewHolder.itemImage.setImageResource(images[i]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}