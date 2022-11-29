package com.java.study.lesson3.task3_document_worker;

public class ExpertDocumentWorker extends ProDocumentWorker{
    private String keyExpertVersion = "87654321";

    public String getKeyExpertVersion() {
        return keyExpertVersion;
    }
    @Override
    public void saveDocument(){
        System.out.println("Документ збережений в новому форматі.");
    }
}
