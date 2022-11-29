package com.java.study.lesson3.task3_document_worker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ProDocumentWorker proDocumentWorker = new ProDocumentWorker();
        ExpertDocumentWorker expertDocumentWorker = new ExpertDocumentWorker();
        DocumentWorker basicDocumentWorker = new DocumentWorker();

        System.out.println("Якщо у вас є ключ доступу введіть: Y");
        String yes = input.next();

        if (yes.equals("Y")){
            System.out.println("Введіть ключ доступу:");
            String key = input.next();
            if (proDocumentWorker.getKeyProVersion().equals(key)){
                proDocumentWorker.openDocument();
                proDocumentWorker.editDocument();
                proDocumentWorker.saveDocument();
            } else if (expertDocumentWorker.getKeyExpertVersion().equals(key)) {
                expertDocumentWorker.openDocument();
                expertDocumentWorker.editDocument();
                expertDocumentWorker.saveDocument();
            } else {
                System.out.println("Ви ввелі не вірний ключ доступу.");
            }
        } else {
            basicDocumentWorker.openDocument();
            basicDocumentWorker.editDocument();
            basicDocumentWorker.saveDocument();
        }
    }
}
