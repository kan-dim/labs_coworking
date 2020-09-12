package com.company;

import client.Client;
import client.ClientType;
import client.Language;
import excursion.Excursion;
import guide.Guide;
import manager.Manager;
import room.Room;

public class Main {

    public static void main(String[] args) {
        new Client("Андрей", ClientType.COMPANY, Language.ENGLISH);
        new Client("Наваско", ClientType.FREELANCER, Language.PORTUGUESE);
        new Client("Аргунтин", ClientType.FREELANCER, Language.SPANISH);
        new Client("Александр", ClientType.FREELANCER, Language.RUSSIAN);


        new Guide("Екатерина Петровна", true);
        new Guide("Василий Грызунов", false);
        new Guide("Василия Волкова", false);
        new Guide("Анастасия Кучугурова", true);

        new Manager("Руслан", true);
        new Manager("Евгений", false);


        new Excursion(180, 13);
        new Excursion(1, 10, 2025, 60, 15);

        Room room = new Room("KanDim Coworking", "Хрещатик 10", 500, 8, 20, 35);


        Menu.doUserChoice(room);

    }


}