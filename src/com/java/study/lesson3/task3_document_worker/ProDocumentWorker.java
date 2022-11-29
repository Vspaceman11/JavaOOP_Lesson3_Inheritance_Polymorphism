package com.java.study.lesson3.task3_document_worker;

public class ProDocumentWorker extends DocumentWorker{
    private String keyProVersion = "12345678";

    public String getKeyProVersion() {
        return keyProVersion;
    }
    @Override
    public void openDocument(){
        System.out.println("Документ відкритий.");
    }
    @Override
    public void editDocument(){
        System.out.println("Документ відредаговано.");
    }
    @Override
    public void saveDocument(){
        System.out.println("Документ збережено у старому форматі, збереження в інших форматах доступне у версії Експерт.");
    }
}
