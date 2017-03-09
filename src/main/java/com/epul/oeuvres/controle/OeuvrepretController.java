package com.epul.oeuvres.controle;

import ch.qos.logback.classic.boolex.GEventEvaluator;
import com.epul.oeuvres.dao.*;
import com.epul.oeuvres.metier.*;
import com.epul.oeuvres.utilitaires.FlashMessage;
import com.epul.oeuvres.utilitaires.FlashMessageStatut;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

import static java.lang.Integer.parseInt;

/**
 * Created by Matthieu on 25/02/2017.
 *
 */
@RequestMapping("oeuvrepret")
public class OeuvrepretController  {

    private OeuvrepretDAO oeuvrepretDAO;

    public OeuvrepretController() {
        super();
        this.oeuvrepretDAO = new OeuvrepretDAO();
    }

    @RequestMapping(value = "liste", method = RequestMethod.GET)
    public ModelAndView liste(HttpServletRequest request, HttpServletResponse response) {
        List<Oeuvrepret> oeuvreprets = this.oeuvrepretDAO.findAll();;
        request.setAttribute("oeuvreprets", oeuvreprets);
        return new ModelAndView("oeuvrepret/liste");
    }

    public void detailAction() {
    }

    public void deleteAction() {
    }

    public void editerAction() {
    }

    public void addAction() {

    }
}
