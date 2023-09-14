/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import communication.Operation;
import communication.Receiver;
import communication.Request;
import communication.Response;
import communication.Sender;
import domain.ATPList;
import domain.Match;
import domain.Player;
import domain.PlayerStatistics;
import domain.Stadium;
import domain.Tournament;
import domain.User;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class Communication {
    
    Socket socket;
    Sender sender;
    Receiver receiver;
    private static Communication instance;
    private User currentUser = null;

    public Communication() {
        try {
            socket = new Socket("127.0.0.1", 9000);
            sender = new Sender(socket);
            receiver = new Receiver(socket);
        } catch (IOException ex) {
            Logger.getLogger(Communication.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Communication getInstance() {
        if (instance == null) {
            instance = new Communication();
        }
        return instance;
    }
    
    public User login(String firstName, String lastName, String password) throws Exception {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setPassword(password);
        Request request = new Request(Operation.LOGIN, user);
        System.out.println("Saljem login request: " + request.getObject());
        sender.send(request);
        Response response = (Response) receiver.receive();
        System.out.println("Ovo je moj login response: " + response.getResult());
        if (response.getException() == null) {
            return (User) response.getResult();
        } else {
            throw response.getException();
        }
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }
    
    public ATPList createATPList(ATPList atplist) throws Exception {
        Request request = new Request(Operation.CREATE, atplist);
        System.out.println("Saljem create ATPList request: " + request.getObject());
        sender.send(request);
        Response response = (Response) receiver.receive();
        System.out.println("Ovo je moj create ATPList response: " + response.getResult());
        if (response.getException() == null) {
            return (ATPList) response.getResult();
        } else {
            throw response.getException();
        }
    }
    
    public Player createPlayer(Player player) throws Exception {
        Request request = new Request(Operation.CREATE, player);
        System.out.println("Saljem createPlayer request: " + request.getObject());
        sender.send(request);
        Response response = (Response) receiver.receive();
        System.out.println("Moj createPlayer response: " + response.getResult());
        if (response.getException() == null) {
            return (Player) response.getResult();
        } else {
            throw response.getException();
        }
    }

    public Tournament createTournament(Tournament tournament) throws Exception {
        Request request = new Request(Operation.CREATE, tournament);
        System.out.println("Saljem create Tournament request: " + request.getObject());
        sender.send(request);
        Response response = (Response) receiver.receive();
        System.out.println("Ovo je moj create Tournament response: " + response.getResult());
        if (response.getException() == null) {
            return (Tournament) response.getResult();
        } else {
            throw response.getException();
        }
    }

    public Stadium createStadium(Stadium stadium) throws Exception {
        Request request = new Request(Operation.CREATE, stadium);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if (response.getException() == null) {
            return (Stadium) response.getResult();
        } else {
            throw response.getException();
        }
    }
    
    public Match createMatch(Match match) throws Exception {
        Request request = new Request(Operation.CREATE, match);
        System.out.println("Saljem create Match request: " + request.getObject());
        sender.send(request);
        Response response = (Response) receiver.receive();
        System.out.println("Saljem create Match request: " + response.getResult());
        if (response.getException() == null) {
            return (Match) response.getResult();
        } else {
            throw response.getException();
        }
    }
    
     public PlayerStatistics createPlayersStatistics(PlayerStatistics ps) throws Exception {
         Request request = new Request(Operation.CREATE, ps);
        System.out.println("Saljem create PlayerStatistics request: " + request.getObject());
        sender.send(request);
        Response response = (Response) receiver.receive();
        System.out.println("Create PlayerStatistics response: " + response.getResult());
        if (response.getException() == null) {
            return (PlayerStatistics) response.getResult();
        } else {
            throw response.getException();
        }
     }
    
    public List<ATPList> getAllATPLists() throws Exception {
        Request request = new Request(Operation.GET, new ATPList());
        sender.send(request);
        Response response = (Response) receiver.receive();
        System.out.println("GET atplist: " + response.getResult());
        if (response.getException() == null) {
            return (List<ATPList>) response.getResult();
        } else {
            throw response.getException();
        }      
    }
    
    public List<Tournament> getAllTournaments() throws Exception {
        Request request = new Request(Operation.GET, new Tournament());
        sender.send(request);
        Response response = (Response) receiver.receive();
        System.out.println("GET tournament: " + response.getResult());
        if (response.getException() == null) {
            return (List<Tournament>) response.getResult();
        } else {
            throw response.getException();
        }      
    }
    
    public List<Player> getAllPlayers() throws Exception {
        Request request = new Request(Operation.GET, new Player());
        System.out.println("Saljem getAllPlayers request: " + request.getObject());
        sender.send(request);
        Response response = (Response) receiver.receive();
        System.out.println("getAllPlayers respons: " + response.getResult());
        if(response.getException() == null) {
            return (List<Player>) response.getResult();
        } else {
            throw response.getException();
        }
    }

    public List<Stadium> getAllStadiums() throws Exception {
        Request request = new Request(Operation.GET, new Stadium());
        sender.send(request);
        Response response = (Response) receiver.receive();
        System.out.println("GET stadium: " + response.getResult());
        if(response.getException() == null) {
            return (List<Stadium>) response.getResult();
        } else {
            throw response.getException();
        }
    }
    
    public List<Match> getAllMatches() throws Exception {
        Request request = new Request(Operation.GET, new Match());
        sender.send(request);
        Response response = (Response) receiver.receive();
        System.out.println("GET match: " + response.getResult());
        if(response.getException() == null) {
            return (List<Match>) response.getResult();
        } else {
            throw response.getException();
        }
    }
    
    public List<PlayerStatistics> getPlayerStatistics(Match match) throws Exception {
        PlayerStatistics ps = new PlayerStatistics();
        ps.setMatch(match);
        Request request = new Request(Operation.GET, ps);
        System.out.println("Request za statistiku igraca na utakmici" + request.getObject());
        sender.send(request);
        Response response = (Response) receiver.receive();
        System.out.println("Response za get statistiku: " + response.getResult());
        if (response.getException() == null) {
            return (List<PlayerStatistics>) response.getResult();
        } else {
            throw response.getException();
        }
    }

    public ATPList saveATPList(ATPList atpList) throws Exception {
        Request request = new Request(Operation.SAVE, atpList);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if(response.getException() == null) {
            return (ATPList) response.getResult();
        } else {
            throw response.getException();
        }
    }

    public Stadium saveStadium(Stadium stadium) throws Exception {
        Request request = new Request(Operation.SAVE, stadium);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if(response.getException() == null) {
            return (Stadium) response.getResult();
        } else {
            throw response.getException();
        }
    }

    public Tournament saveTournament(Tournament tournament) throws Exception {
        Request request = new Request(Operation.SAVE, tournament);
        System.out.println("Saljem save Tournament request: " + request.getObject());
        sender.send(request);
        Response response = (Response) receiver.receive();
        System.out.println("Ovo je moj save Tournament response: " + response.getResult());
        if(response.getException() == null) {
            return (Tournament) response.getResult();
        } else {
            throw response.getException();
        }
    }
    
    public Match saveMatch(Match match) throws Exception {
        Request request = new Request(Operation.SAVE, match);
        System.out.println("Saljem save Tournament request: " + request.getObject());
        sender.send(request);
        Response response = (Response) receiver.receive();
        System.out.println("Ovo je moj save Tournament response: " + response.getResult());
        if(response.getException() == null) {
            return (Match) response.getResult();
        } else {
            throw response.getException();
        }
    }
    
    public PlayerStatistics updatePlayerStatistics(PlayerStatistics playerStatistics) throws Exception{
        Request request = new Request(Operation.SAVE, playerStatistics);
        System.out.println("Saljem save PS request: " + request.getObject());
        sender.send(request);
        Response response = (Response) receiver.receive();
        System.out.println("Ovo je moj save PS response: " + response.getResult());
        if(response.getException() == null) {
            return (PlayerStatistics) response.getResult();
        } else {
            throw response.getException();
        }
    }
    
    public Player updatePlayer(Player player) throws Exception {
        Request request = new Request(Operation.SAVE, player);
        System.out.println("Sljem request za updatePlayer: " + request.getObject());
        sender.send(request);
        Response response = (Response) receiver.receive();
        System.out.println("Response za updatePlayer: " + response.getResult());
        if (response.getException() == null) {
            return (Player) response.getResult();
        } else {
            throw response.getException();
        }
    }

    public void deleteTournament(Tournament tournament) throws Exception {
        Request request = new Request(Operation.DELETE, tournament);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if (response.getException() != null) {
            throw response.getException();
        }
    }
    
    public void deleteStadium(Stadium stadium) throws Exception {
        Request request = new Request(Operation.DELETE, stadium);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if (response.getException() != null) {
            throw response.getException();
        }
    }

    public void deletePlayer(Player player) throws Exception {
        Request request = new Request(Operation.DELETE, player);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if (response.getException() != null) {
            throw response.getException();
        }
    }

    public void deleteATPList(ATPList atpList) throws Exception {
        Request request = new Request(Operation.DELETE, atpList);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if (response.getException() != null) {
            throw response.getException();
        }
    }

    public void deleteMatch(Match match) throws Exception {
        Request request = new Request(Operation.DELETE, match);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if (response.getException() != null) {
            throw response.getException();
        }
    }
    
    public void deletePlayersStatistics(PlayerStatistics ps) throws Exception {
        Request request = new Request(Operation.DELETE, ps);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if (response.getException() != null) {
            throw response.getException();
        }
    }

}
