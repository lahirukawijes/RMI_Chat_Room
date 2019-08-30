/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicChatRoom;

/**
 *
 * @author Lahiruka
 */
public class StartClient {
    public static void main(String[] args) {
        ChatObservable chatObservable=new ChatObservable();
        chatObservable.addChatObserver(new ChatRoom(chatObservable, "Dushani"));
        chatObservable.addChatObserver(new ChatRoom(chatObservable, "Kasuni"));
        chatObservable.addChatObserver(new ChatRoom(chatObservable, "Sahan"));
    }
}
