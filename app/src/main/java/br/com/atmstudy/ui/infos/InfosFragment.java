package br.com.atmstudy.ui.infos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.atmstudy.R;
import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;


public class InfosFragment extends Fragment {

    public InfosFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String desc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua";
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_infos, container, false);

        Element version = new Element();
        version.setTitle("v. 1.1.0");
        return new AboutPage(getActivity())
                .setImage(R.drawable.logo)
                .setDescription(desc)
                .addGroup("Entre em contato")
                .addEmail("email@ficticio.com", "Envie um email")
                .addWebsite("www.404.com", "Acesse o site")

                .addGroup("Redes Sociais")
                .addFacebook("", "Facebook")
                .addInstagram("", "Instagram")
                .addGitHub("", "Github")
                .addYoutube("", "Youtube")
                .addPlayStore("", "Play Store")

                .addItem(version)
                .create();

    }
}