/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eclipse.jetty;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.jetty.websocket.api.annotations.WebSocket;

/**
 *
 * @author Ayman
 */
public class WebSocketDB {
    static WebSocketDB instance;
    private static Set<VisWebSocket> sockets = Collections.synchronizedSet(new HashSet<VisWebSocket>());
    
    /** Creates a new instance of WebSocketDB */
    private WebSocketDB() {
        instance = this;
    }
    
    static void registerNewSocket(VisWebSocket socket) {
        sockets.add(socket);
    }
    
    static void unRegisterSocket(WebSocket socket) {
        sockets.remove(socket);
    }
    
    public WebSocketDB getInstance() {
        if (instance == null)
            instance = new WebSocketDB();
        
        return instance;
    }
}
