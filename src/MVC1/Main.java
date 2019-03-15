/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC1;

import MVC1.controller.Controller;
import MVC1.controller.DefaultController;
import MVC1.controller.DoNothingConroller;
import MVC1.model.Model;
import MVC1.view.SwingView;
import MVC1.view.View;
import java.util.Objects;



/**
 *
 * @author user
 */
public class Main {
    private Model model;
    private View view;
    private Controller controller;
    
    private Main(Model model, View view, Controller controller) {
        this.model = model;
        this.view = view;
        this.controller = controller;
        init();
    }
    public static void main(String[] args) {
        Controller controller = makeController(args);
        Main main = new Main(new Model(), new SwingView(), controller);
        
        main.start();
    }
    static Controller makeController(String...args) {
        Controller controller = new DefaultController();
        for (String arg : args) {
            if (Objects.equals(arg, "-nothing")) {
                controller = new DoNothingConroller();
            }
        }
        return controller;
    }
    void  start() {
    controller.start();
}
 private void init() {
     view.setModel(model);
     view.setController(controller);
     controller.setView(view);
     controller.setModel(model);
 }
}

