package com.example.myapplication;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleListFragment extends Fragment {
    private RecyclerView recyclerView;
    private ArticleAdapter articleAdapter;
    private List<Article> articleList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_article_list, container, false);
        recyclerView = view.findViewById(R.id.recycler_view_articles);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        articleList = generateSampleArticles(); // Remplace cette ligne avec ton propre code pour récupérer la liste des articles
        setupRecyclerView();
    }

    private void setupRecyclerView() {
        articleAdapter = new ArticleAdapter(articleList);
        recyclerView.setAdapter(articleAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
    }

    // Méthode de génération d'exemples d'articles (pour tester)
    private List<Article> generateSampleArticles() {
        List<Article> articles = new ArrayList<>();
        articles.add(new Article("Titre 1", "Contenu de l'article 1", new Date()));
        articles.add(new Article("Titre 2", "Contenu de l'article 2", new Date()));
        articles.add(new Article("Titre 3", "Contenu de l'article 3", new Date()));
        return articles;
    }
}

