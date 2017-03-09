package com.epul.oeuvres.controle;

import com.epul.oeuvres.dao.*;
import com.epul.oeuvres.metier.Adherent;
import com.epul.oeuvres.metier.Oeuvrevente;
import com.epul.oeuvres.metier.Proprietaire;
import com.epul.oeuvres.metier.Reservation;
import com.epul.oeuvres.utilitaires.FlashMessage;
import com.epul.oeuvres.utilitaires.FlashMessageStatut;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.annotation.WebServlet;
import java.util.Calendar;
import java.util.List;

import static java.lang.Integer.parseInt;

/**
 * Created by Gaetan on 25/02/2017.
 */
@RequestMapping("oeuvrevente")
public class OeuvreventeController {

    private OeuvreventeDAO oeuvreventeDAO;

    public OeuvreventeController() {
        super();
        this.oeuvreventeDAO = new OeuvreventeDAO();
    }

    public void listeAction() {

    }

    public void addAction() {
    }

    public void editerAction() {
    }

    public void detailAction() {
    }

}
