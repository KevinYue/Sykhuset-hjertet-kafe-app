package no.sykehusetkjokkenet.hjertetkafemoss.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.List;

import no.sykehusetkjokkenet.hjertetkafemoss.Adapter.CategoryRecyclerAdapter;
import no.sykehusetkjokkenet.hjertetkafemoss.Model.Category;
import no.sykehusetkjokkenet.hjertetkafemoss.R;

public class HomeFragment extends Fragment {
    private static final String TAG = HomeFragment.class.getSimpleName();

    private List<Category> categoryList;
    private List<String> categoryUidList;

    private RecyclerView categoryRecyclerView;
    private CategoryRecyclerAdapter categoryAdapter;

    private FirebaseFirestore firestoreDb;
    private CollectionReference categoryCollectionReference;



    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        categoryList = new ArrayList<>();
        categoryUidList = new ArrayList<>();

        firestoreDb = FirebaseFirestore.getInstance();

        categoryCollectionReference = firestoreDb.collection("categories");
        //categoryList = Category.getCategories();

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //categoryRecyclerView = view.findViewById(R.id.categoryRecyclerView);

        setUpRecyclerView(view);

        /*categoryRecyclerView.setAdapter(new CategoryRecyclerAdapter(view.getContext(), categoryList, view1 -> {
            // Gets the position of the item that's clicked
            int position = categoryRecyclerView.getChildAdapterPosition(view1);

            // Gets the category based on which item got clicked
            Category clickedCategory = categoryList.get(position);

            // Creates the navigation directions action, including the uid
            NavDirections action = actionHomeDestToCategoryDetailFragment(clickedCategory.getUid());

            // Calls the navigation action, and lead us to the CategoryDetailFragment
            Navigation.findNavController(view1).navigate(action);

            // Create a Toast text with the category clicked
            Toast.makeText(view1.getContext(), clickedCategory.getTitle() + " clicked", Toast.LENGTH_LONG).show();
        }));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);

        categoryRecyclerView.setLayoutManager(linearLayoutManager);*/

    }

    private void setUpRecyclerView(View view) {
        categoryRecyclerView = categoryRecyclerView.findViewById(R.id.categoryRecyclerView);

        // Pointing to the list
        //categoryAdapter = new CategoryRecyclerAdapter(this, categoryList);

        categoryRecyclerView.setAdapter(new CategoryRecyclerAdapter(view.getContext(), categoryList, new View.OnClickListener() {
            int position = categoryRecyclerView.getChildAdapterPosition(categoryRecyclerView);

            Category clickedCategory = categoryList.get(position);

            NavDirections action = CategoryFragmentDirections.action
        }));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);

        categoryRecyclerView.setLayoutManager(linearLayoutManager);
    }

    private void addData() {
        ArrayList<Category> categories = new ArrayList<>();

        categories.add(new Category(1, ""));

    }
}