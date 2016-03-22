package wk.android.org.toolbardemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by wk on 2016/3/22.
 */
public class SampleFragment extends Fragment {

    private static final String ARG_POSITION = "position";

    private int position;

    public static SampleFragment newInstance(int position) {
        SampleFragment f = new SampleFragment();
        Bundle b = new Bundle();
        b.putInt(ARG_POSITION, position);
        f.setArguments(b);
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        position = getArguments().getInt(ARG_POSITION);
        View rootView = inflater.inflate(R.layout.page, container, false);

        TextView textView = (TextView) rootView.findViewById(R.id.text);

        switch (position) {
            case 0:
//                fab.setBackgroundColor(getResources().getColor(R.color.material_deep_teal_500));
//                progressBarCircular.setBackgroundColor(getResources().getColor(R.color.material_deep_teal_500));
                textView.setText(position+"");
                break;
            case 1:
                textView.setText(position + "");


                break;
            case 2:
                textView.setText(position + "");


                break;
            case 3:
                textView.setText(position+"");


                break;
            case 4:
                textView.setText(position+"");
                break;
        }

        return rootView;
    }
}
