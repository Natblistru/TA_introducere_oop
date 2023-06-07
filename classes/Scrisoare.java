package edu.step.classes;

public class Scrisoare {
    private String recipient;
    private String addressRecipient;
    private String sender;
    private String addressSender;
    private String subject;
    private String content;
    private boolean isSent;
    private boolean isReceived;
    private boolean isRead;
    private boolean isUrgent;

    public void trimite() {
        isSent = true;
        System.out.println(String.format("Scrisoarea a fost expediată la adresa %s", addressRecipient));
    }

    public void receptioneaza() {
        isReceived = true;
        System.out.println(String.format("Scrisoarea a fost receptionată de către %s", recipient));
    }

    public void marcheazaCitita() {
        isRead = true;
        System.out.println("Scrisoarea a fost marcată ca fiind citită.");
    }

    public void marcheazaUrgenta() {
        isUrgent = true;
        System.out.println("Scrisoarea a fost marcată ca fiind urgenta.");
    }

    public void arunca() {
        isReceived = false;
        System.out.println("Scrisoarea a fost aruncată la gunoi.");
    }
}
