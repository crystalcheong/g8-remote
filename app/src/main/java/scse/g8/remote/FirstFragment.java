package scse.g8.remote;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import scse.g8.remote.databinding.FragmentFirstBinding;

import java.util.ArrayList;
import java.util.List;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;
    String randomInfo;

    TextView displaytv;

    // grid stuff
    private static MapArena map;
    private static int mapLeft; // only at robot generate button
    private static int mapTop;
    private static int rotation = 0;

    private static ConstraintLayout obstacle1Grp;
    private static ImageView obstacle1Box;
    private static ImageView obstacle1Face;
    private static TextView obstacle1Id;

    private static ConstraintLayout obstacle2Grp;
    private static ImageView obstacle2Box;
    private static ImageView obstacle2Face;
    private static TextView obstacle2Id;

    private static ConstraintLayout obstacle3Grp;
    private static ImageView obstacle3Box;
    private static ImageView obstacle3Face;
    private static TextView obstacle3Id;

    private static ConstraintLayout obstacle4Grp;
    private static ImageView obstacle4Box;
    private static ImageView obstacle4Face;
    private static TextView obstacle4Id;

    private static ConstraintLayout obstacle5Grp;
    private static ImageView obstacle5Box;
    private static ImageView obstacle5Face;
    private static TextView obstacle5Id;

    private static ConstraintLayout obstacle6Grp;
    private static ImageView obstacle6Box;
    private static ImageView obstacle6Face;
    private static TextView obstacle6Id;

    private static ConstraintLayout obstacle7Grp;
    private static ImageView obstacle7Box;
    private static ImageView obstacle7Face;
    private static TextView obstacle7Id;

    private static ConstraintLayout obstacle8Grp;
    private static ImageView obstacle8Box;
    private static ImageView obstacle8Face;
    private static TextView obstacle8Id;


    private static ImageView obstacleFaceCur;

    private static String obstacleFaceText;
    private static int obstacleFaceNumber;

    private static TextView outputNotifView; // for all the notifications!!
    private static TextView locationNotifView;
    private static TextView facingNotifView;

    private static String outputNotif;
    private static String locationNotif;
    private static String facingNotif;

    //private static Boolean connected;

    private static String instruction = "TARGET, 4, 10";

    private static ConstraintLayout popup;
    private static ConstraintLayout robot_popup;

    private static int robotColPopup = 1;
    private static int robotRowPopup = 1;
    private static String robotFacingPopup = "N";

    private static ImageView robot;
    float pastX, pastY;
    private static String longPress;

    private Runnable runnable;
    private Handler handler;

    TextView incomingMessages;
    StringBuilder messages;


    private static int[][] originalObstacleCoords = new int[8][2];

    private static int[][] currentObstacleCoords = new int[8][2]; // remember to expand this


    // this one is for constraint
    private List<ConstraintLayout> obstacleViews = new ArrayList<>(); // cant be static!! - COS ITS REGENRATED ALL THE TIME - change eventually.

    // for the face views
    private List<ImageView> obstacleFaceViews = new ArrayList<>();
    private List<TextView> obstacleTextViews = new ArrayList<>();
    private List<ImageView> obstacleBoxViews = new ArrayList<>();




    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        //binding = FragmentFirstBinding.inflate(inflater, container, false);
        //return binding.getRoot();
        System.out.println("oncreateView");

        View view = inflater.inflate(R.layout.fragment_first, container, false);
        //System.out.println(savedInstanceState == null);


        //incomingMessages = (TextView) view.findViewById(R.id.statusBluetoothTv);
        messages = new StringBuilder();
        LocalBroadcastManager.getInstance(FirstFragment.this.getActivity()).registerReceiver(mReceiver, new IntentFilter("incomingMessage"));

        return view;

    }

    BroadcastReceiver mReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String text = intent.getStringExtra("theMessage");

            messages.append(text + "\n");
            incomingMessages.setText(messages);
        }
    };

    @SuppressLint("ClickableViewAccessibility")
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        System.out.println("OnViewCreated");
    }

    public void onPause() {
        super.onPause();
        System.out.println("pause- save");
        System.out.println("END NEXT");
    }

    /** Sometimes map.getleft etc doesnt work here?
     *
     */
    public void onResume() {
        super.onResume();
        System.out.println("resume");


        System.out.println("end resume");
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
