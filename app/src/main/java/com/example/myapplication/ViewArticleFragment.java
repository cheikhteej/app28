package com.example.myapplication;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.myapplication.Article;
import com.example.myapplication.R;

import java.text.DateFormat;

public class ViewArticleFragment extends Fragment {
    private TextView titleTextView;
    private TextView contentTextView;
    private TextView dateTextView;

    public static ViewArticleFragment newInstance(Article article) {
        ViewArticleFragment fragment = new ViewArticleFragment();
        Bundle args = new Bundle();
        args.putParcelable("article", (Parcelable) article);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_view_article, container, false);
        titleTextView = view.findViewById(R.id.text_view_title);
        contentTextView = view.findViewById(R.id.text_view_content);
        dateTextView = view.findViewById(R.id.text_view_date);

        Bundle args = getArguments();
        if (args != null) {
            Article article = args.getParcelable("article");
            if (article != null) {
                displayArticle(article);
            }
        }

        return view;
    }

    private void displayArticle(Article article) {
        titleTextView.setText(article.getTitle());
        contentTextView.setText(article.getContent());
        String formattedDate = DateFormat.getDateInstance(DateFormat.SHORT).format(article.getDate());
        dateTextView.setText(formattedDate);
    }
}
