package no.sykehusetkjokkenet.hjertetkafemoss.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import no.sykehusetkjokkenet.hjertetkafemoss.Adapter.CategoryRecyclerAdapter;
import no.sykehusetkjokkenet.hjertetkafemoss.Model.Category;
import no.sykehusetkjokkenet.hjertetkafemoss.R;

public class HomeFragment extends Fragment {
    private ArrayList<Category> categoryList;
    private RecyclerView categoryRecyclerView;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        categoryList = Category.getCategories();

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        categoryRecyclerView = view.findViewById(R.id.categoryRecyclerView);

        categoryRecyclerView.setAdapter(new CategoryRecyclerAdapter(view.getContext(), categoryList, new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                // Gets the position of the item that's clicked
                int position = categoryRecyclerView.getChildAdapterPosition(view);

                // Gets the category based on which item got clicked
                Category clickedCategory = categoryList.get(position);

                // Creates the navigation directions action, including the uid

                // Calls the navigation action, and lead us to the CategoryDetailFragment
                Navigation.findNavController(view).navigate((NavDirections) clickedCategory);

                // Create a Toast text with the category clicked
                Toast.makeText(view.getContext(), clickedCategory.getTitle() + " clicked", Toast.LENGTH_LONG).show();
            }
        }));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);

        //categoryRecyclerView = view.findViewById(R.id.categoryRecyclerView);
        categoryRecyclerView.setLayoutManager(linearLayoutManager);

    }
}