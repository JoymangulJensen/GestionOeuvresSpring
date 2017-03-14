package com.epul.oeuvres.controle;

import com.epul.oeuvres.dao.ProprietaireDAO;
import com.epul.oeuvres.metier.Proprietaire;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.annotation.WebServlet;

@Controller
@RequestMapping("proprietaire/")
public class ProprietaireController {

    private final ProprietaireDAO proprietaireDAO;

    public ProprietaireController() {
        this.proprietaireDAO = new ProprietaireDAO();
    }

    public void listeAction() {
    }

    public void editAction() {
    }

    public void addAction() {
    }

    public void deleteAction() {
    }
}
