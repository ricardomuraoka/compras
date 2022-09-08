package main;


import main.login.*;
import main.menu.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Admin admin = new Admin();
        Menu menu = new Menu();
        if (Login.login() == true) {
        menu.menu(admin);
        } else {
            Cliente.cadastraCliente();
        }
    }
}
