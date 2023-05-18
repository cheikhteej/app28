package com.example.myapplication;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import java.util.Date;

public class AddArticleFragment extends Fragment {
    private EditText titleEditText;
    private EditText contentEditText;
    private Button saveButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_article, container, false);
        titleEditText = view.findViewById(R.id.edit_text_title);
        contentEditText = view.findViewById(R.id.edit_text_content);
        saveButton = view.findViewById(R.id.button_save);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveArticle();
            }
        });
        return view;
    }

    private void saveArticle() {
        String title = titleEditText.getText().toString();
        String content = contentEditText.getText().toString();
        Date date = new Date(); // Utilise la date actuelle
        Article article = new Article(title, content, date);

        // Effectue les actions nécessaires pour sauvegarder l'article (par exemple, enregistrement dans une base de données)

        // Après avoir enregistré l'article, tu peux effectuer une action supplémentaire si nécessaire, comme revenir à la liste des articles ou afficher l'article nouvellement créé
    }
}

