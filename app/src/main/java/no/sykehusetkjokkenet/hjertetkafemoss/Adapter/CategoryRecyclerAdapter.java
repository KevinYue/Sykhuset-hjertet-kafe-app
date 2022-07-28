package no.sykehusetkjokkenet.hjertetkafemoss.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import no.sykehusetkjokkenet.hjertetkafemoss.Fragment.HomeFragment;
import no.sykehusetkjokkenet.hjertetkafemoss.Model.Category;
import no.sykehusetkjokkenet.hjertetkafemoss.R;

public class CategoryRecyclerAdapter extends RecyclerView.Adapter<CategoryRecyclerAdapter.CategoryViewHolder> {

    private List<Category> data;
    private LayoutInflater inflater;
    private View.OnClickListener clickListener;

    public void setOnItemClickListener(View.OnClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public CategoryRecyclerAdapter(HomeFragment context, List<Category> data) {
        this.data = data;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Having a Log message for seeing onCreateViewHolder method is called
        Log.d("CategoryAdapter", "Creating View");

        // Inflates the category_list_item.xml to a view for us
        View view = inflater.inflate(R.layout.category_list_item, parent, false);

        // Create the viewholder with the corresponding view (list item)
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        /*Category currentObject = data.get(position);
        holder.setData(currentObject);*/
        // Log see bind method is called
        Log.d("CategoryAdapter", "Binding View $position");

        // Gets the movie data we ar going to use at the given position
        Category currentCategory = data.get(position);

        holder.setData(currentCategory);

        // Gives the movie data and clickListener to the ViewHolder
        // Makes it fill up the given position with the new data and add the clickListener to the view
        //holder.bind(currentCategory, onClickListener);
        if (clickListener != null) {
            holder.itemView.setOnClickListener(clickListener);
        }

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView categoryTitle;
        ImageView categoryImage;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            // Gets a reference to all the specific views we are going to use or fill with data
            categoryTitle = itemView.findViewById(R.id.categoryTextView2);
            categoryImage = itemView.findViewById(R.id.categoryImageView);
        }

        /*public void bind(Category currentCategory, View.OnClickListener onClickListener) {
            // Fills the views with the given data
            categoryImage.setImageResource(currentCategory.getPoster());
            categoryTitle.setText(currentCategory.getTitle());

            // Sets the onClickListener
            this.itemView.setOnClickListener(onClickListener);
        }*/

        public void setData(Category currentObject) {
            this.categoryTitle.setText(currentObject.getTitle());

            String categoryPosterUrl = currentObject.getPoster();

            // Testing the image and getting the image
            if (categoryPosterUrl != null && !categoryPosterUrl.equals("")) {
                Glide.with(categoryImage.getContext())
                        .load(categoryPosterUrl)
                        .into(categoryImage);
            }
            else
                categoryImage.setImageResource(R.drawable.foods);
        }
    }
}
