package sheridan.abedisy.androidfinal.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import sheridan.abedisy.androidfinal.CustomizeYourDateActiviy;
import sheridan.abedisy.androidfinal.FindResturantActivity;
import sheridan.abedisy.androidfinal.MainActivity;
import sheridan.abedisy.androidfinal.MakeAMemoryActivity;
import sheridan.abedisy.androidfinal.R;

public class HomeFragment extends Fragment  {

    Button FindResturant;
    Button CustomizeDate;
    Button MakeMemory;
    CarouselView carouselView;
    int[] sampleImages = new int[]{R.drawable.sunset, R.drawable.frenchresturant, R.drawable.drinkpicture};

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        //final TextView textView = root.findViewById(R.id.text_home);
       /* homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/

        FindResturant = root.findViewById(R.id.btn);
        CustomizeDate = root.findViewById(R.id.customizeDate);
        MakeMemory = root.findViewById(R.id.MakeAMemory);

        carouselView = root.findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(sampleImages[position]);
            }
        });




       FindResturant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(),"Find Resturant!",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getContext(), FindResturantActivity.class);
                startActivity(intent);
            }
        });

       CustomizeDate.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(getContext(), CustomizeYourDateActiviy.class);
               startActivity(intent);
           }
       });

       MakeMemory.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(getContext(), MakeAMemoryActivity.class);
               startActivity(intent);
           }
       });




        return root;

    }
}