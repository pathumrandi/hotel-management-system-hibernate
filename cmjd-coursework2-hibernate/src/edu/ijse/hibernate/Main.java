/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.hibernate;

import edu.ijse.hibernate.entity.CustomerEntity;
import edu.ijse.hibernate.entity.embeded.CustomerName;
//import edu.ijse.hibernate.repository.CustomerRepository;
import edu.ijse.hibernate.util.SessionFactoryConfiguration;
import edu.ijse.hibernate.view.AdminView;
import edu.ijse.hibernate.view.CustomerView;
import edu.ijse.hibernate.view.HomeView;
import edu.ijse.hibernate.view.LoginView;
import edu.ijse.hibernate.view.RoomCategoryView;
import edu.ijse.hibernate.view.RoomView;
import edu.ijse.hibernate.view.SignUpView;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;


/**
 *
 * @author pathum
 */
public class Main {
    public static void main(String[] args) {
        //new CustomerView().setVisible(true);
        //new SignUpView().setVisible(true);
        //Session session = SessionFactoryConfiguration.getInstance().getSession();
        //new LoginView().setVisible(true);
        //new AdminView().setVisible(true);
        new HomeView().setVisible(true);
        //new RoomView().setVisible(true);
        //new RoomCategoryView().setVisible(true);
    }
}
