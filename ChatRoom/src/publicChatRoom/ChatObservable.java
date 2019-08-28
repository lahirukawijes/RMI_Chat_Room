package publicChatRoom;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lahiruka
 */
public class ChatObservable {
    private String message="";
    private ArrayList<ChatObserver> chatObserverList=new ArrayList<>();
    public void addChatObserver(ChatObserver chatObserver){
        chatObserverList.add(chatObserver);
    }
    public void removeChatObserver(ChatObserver chatObserver){
        chatObserverList.remove(chatObserver);
    }
    public void notifyChatObservers(){
        for (ChatObserver chatObserver : chatObserverList) {
            chatObserver.update(message);
        }
    }
    public void setMessage(String message){
        this.message=message;
        notifyChatObservers();
    }
}
