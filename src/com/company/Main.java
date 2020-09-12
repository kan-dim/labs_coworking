package com.company;

import client.Client;
import client.ClientType;
import client.Language;
import excursion.Excursion;
import excursion.ExcursionService;
import guide.Guide;
import guide.GuideService;
import service.ClientService;
import service.checkInput;

public class Main {

    public static void main(String[] args) {
        new Client("aaaaaaaaa", ClientType.COMPANY, Language.ENGLISH);
        new Client("ffffffff", ClientType.FREELANCER, Language.SPANISH);

        ClientService.printAllClients();

        new Guide("Даааня", true);
        new Guide("Димааа", false);

        GuideService.printAllGuides();

        new Excursion(120, 120);
        new Excursion(25, 12, 2020, 120, 120);

        ExcursionService.printAllExcursion();

        ClientService.removeClientById(checkInput.getNumber(ClientService.getAmount()));

        new Client("rrrrrrrr", ClientType.FREELANCER, Language.SPANISH);

        ClientService.printAllClients();


        System.out.println(ClientService.getClientById(checkInput.getNumber(ClientService.getAmount())));


    }
}