package com.designpatterns.factory.senderFactory;

public class EmailInvitationSender implements InvitationSender {

    public void sendInvitation(Invitation invitation) {
        System.out.println("Invitation Sended via EMAIL to: " + invitation.getName() + " " + invitation.getSurname());
    }
}

