package sheridan.abedisy.androidfinal.ui.notifications;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import sheridan.abedisy.androidfinal.R;

public class NotificationsFragment extends Fragment {


    private NotificationsViewModel notificationsViewModel;

    TextView textView4;
    TextView textView5;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                ViewModelProviders.of(this).get(NotificationsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_notifications, container, false);
        final TextView textView = root.findViewById(R.id.text_notifications);

        textView.setText("About us");

        textView4 = root.findViewById(R.id.textView4);
        textView5 = root.findViewById(R.id.textView5);


        textView4.setText("This App is made to help couples no mattter what their relationship status is find a place to eat and have a good time. ");
        textView5.setText("In this application we have used: \n * Fragments \n * Multi-media (Camera) \n * Location Based Services");







        return root;
    }


}