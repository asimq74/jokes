package com.works.testapp.displayjoke;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.udacity.example.jokes.JokeSmith;

/**
 * A placeholder fragment containing a simple view.
 */
public class DisplayJokeActivityFragment extends Fragment {

    public DisplayJokeActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final String joke = getActivity().getIntent().getStringExtra(JokeSmith.JOKE_TEXT_EXTRA);
        final View view = inflater.inflate(R.layout.fragment_display_joke, container, true);
        TextView jokeTextView = (TextView) view.findViewById(R.id.jokeText);
        jokeTextView.setText(joke);
        return view;
    }

}
