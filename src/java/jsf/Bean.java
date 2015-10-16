/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsf;

import static com.sun.xml.ws.security.impl.policy.Constants.logger;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author marwen
 */
@Named(value = "bean")
@RequestScoped
public class Bean {

    private int nombre;

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNombresSuivants() {
        int nb = 5;
        List<Integer> t = new ArrayList<>(nb);
        for (int i = nombre; i < nombre + nb; i++) {
            t.add(i);
        }
        return t;
    }

    public String actionString(String base, String numEx, String query) {
        logger.info(base);
        logger.info(numEx);
        logger.info(query);

        String firstCase = base + "_" + numEx;
        String secondCase = base + "_" + numEx + query;

        while (query.equals("")) {
            logger.info(firstCase);
            return firstCase;

        }
        logger.info(secondCase);
        return secondCase;

    }
}
