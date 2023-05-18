package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.myapplication.AddArticleFragment;
import com.example.myapplication.Article;
import com.example.myapplication.ArticleListFragment;
import com.example.myapplication.R;
import com.example.myapplication.ViewArticleFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Appel de la méthode pour afficher le fragment de la liste des articles
        displayArticleListFragment();
    }

    private void displayArticleListFragment() {
        Fragment articleListFragment = new ArticleListFragment();
        replaceFragment(articleListFragment);
    }

    public void displayAddArticleFragment() {
        Fragment addArticleFragment = new AddArticleFragment();
        replaceFragment(addArticleFragment);
    }

    public void displayViewArticleFragment(Article article) {
        Fragment viewArticleFragment = ViewArticleFragment.newInstance(article);
        replaceFragment(viewArticleFragment);
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
