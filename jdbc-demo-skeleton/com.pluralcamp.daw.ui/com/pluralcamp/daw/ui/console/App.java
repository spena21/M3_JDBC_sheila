package com.pluralcamp.daw.ui.console;

//import com.pluralcamp.daw.persistence.daos.contracts.ColorDAO;
import com.pluralcamp.daw.persistence.daos.impl.jdbc.ColorDAOJDBCImpl;
//import com.pluralcamp.daw.persistence.daos.impl.jdbc.EventDAOJDBCImpl;

import java.util.List;

import com.pluralcamp.daw.entities.core.Color;//nose
import com.pluralcamp.daw.persistence.exceptions.DAOException;

//import javafx.scene.paint.Color;

public class App {
    public static void main(String[] args) {
        // Scanner tdin = new Scanner(System.in);

        ColorDAOJDBCImpl colorDAO = new ColorDAOJDBCImpl();
        // EventDAOJDBCImpl eventDAO = new EventDAOJDBCImpl();

        try {
            Color c = colorDAO.getColorById(5);
            if (c != null) {
                System.out.println(c.toString());
            }
        } catch (DAOException ex) {
            System.out.printf("Error:: %s %n", ex.getMessage());

        }
        // System.out.println("Clica una tecla per a continuar");

        try {
            List<Color> colors = colorDAO.getColors();
            for (Color c : colors) {
                System.out.println(c.toString());
            }
        } catch (DAOException ex) {
            System.out.printf("Error:: %s %n", ex.getMessage());

        }
        // System.out.println("Clica una tecla per a continuar");
    }
}
