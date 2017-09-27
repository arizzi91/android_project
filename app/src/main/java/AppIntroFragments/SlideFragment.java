package AppIntroFragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.angelo.myapplication.R;

/**
 * Created by angelo on 27/09/17.
 */

public class SlideFragment  extends android.support.v4.app.Fragment{
    private static final String LAYOUT_ID="layout_id";
    private static final String TITLE_SLIDE="title_slide";
    TextView textView;
    private int layoutID;
    private String titleSlide;

    public static SlideFragment newInstance(int layoutID,String titleSlide){
        SlideFragment slideFragment= new SlideFragment();
        Bundle arg= new Bundle();
        arg.putInt(LAYOUT_ID,layoutID);
        arg.putString(TITLE_SLIDE,titleSlide);
        slideFragment.setArguments(arg);
        return slideFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(getArguments() != null && getArguments().containsKey(LAYOUT_ID) && getArguments().containsKey(TITLE_SLIDE)){
            layoutID=getArguments().getInt(LAYOUT_ID);
            titleSlide=getArguments().getString(TITLE_SLIDE);
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view= inflater.inflate(layoutID,container,false);
        textView=view.findViewById(R.id.text);
        textView.setText(titleSlide);
        return view;
    }
}
