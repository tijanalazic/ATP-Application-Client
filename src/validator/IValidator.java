/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package validator;

import domain.Player;
import domain.Stadium;
import domain.Tournament;
import java.time.LocalDate;

/**
 *
 * @author DELL
 */
public interface IValidator {
    
    public void validate(String value) throws ValidatorException;
    
    public void validateATPList(String name, String numberOfPlayers) throws ValidatorException;
    
    public void validateLogin(String firstName, String lastname, String password) throws ValidatorException;
    
    public void validateStadium(String name, String numberOfSeats, String city) throws ValidatorException;
    
    public void validatePlayer(String firstName, String lastName, String state, String points, String height, String weight) throws ValidatorException;
    
    public void validateTournament(String name, String city, String beginningDate, String endingDate, String numberOfPlayers) throws ValidatorException;
    
    public void validateMatch(Tournament tournament, Player player1, Player player2, Stadium stadium) throws ValidatorException;
    
    public void validatePlayersStatistics(String aces, String doubleFaults, String winners, String netPointsWon, String unforcedErrors) throws ValidatorException;
    
}
