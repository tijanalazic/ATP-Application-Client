package validator.components;

import domain.Player;
import domain.Stadium;
import domain.Tournament;
import java.time.LocalDate;
import validator.IValidator;
import validator.ValidatorException;

public class RegularValidator implements IValidator {

    @Override
    public void validate(String value) throws ValidatorException {
        if (value == null || value.isEmpty()) {
            throw new ValidatorException("All fields are mandatory!");
        }
    }
    
    @Override
    public void validateLogin(String firstname, String lastname, String password) throws ValidatorException {
        if (firstname == null || firstname.isEmpty()) {
            throw new ValidatorException("Fill in the field for firstname!");
        }
        if (lastname == null || lastname.isEmpty()) {
            throw new ValidatorException("Fill in the field for lastname!");
        }
        if (password == null || password.isEmpty()) {
            throw new ValidatorException("Fill in the field for passsword!");
        }
        if (!(firstname.matches("[a-zA-Z]+"))&&!(firstname.matches(" "))) {
            throw new ValidatorException("The firstname entry field must contain only letters!");
        }
        if (!(lastname.matches("[a-zA-Z]+"))&&!(lastname.matches(" "))) {
            throw new ValidatorException("The lastname entry field must contain only letters!");
        }
    }

    @Override
    public void validateATPList(String name, String numberOfPlayers) throws ValidatorException {
        if (name == null || name.isEmpty()) {
            throw new ValidatorException("Fill in the field for name!");
        }
        if(numberOfPlayers == null || numberOfPlayers.isEmpty()) {
            throw new ValidatorException("Fill in the field for number of players!");
        }
        if (!(name.matches("[a-zA-Z]+")) && !name.contains(" ")) {
            throw new ValidatorException("The name entry field must contain only letters!");
        }
        if(numberOfPlayers.matches("[a-zA-Z]+")) {
            throw new ValidatorException("Number of seats must contain only numbers!");
        }
        if(numberOfPlayers.charAt(0) == '-') {
            throw new ValidatorException("Number of seats must be greater than 0!");
        }
    }

    @Override
    public void validateStadium(String name, String numberOfSeats, String city) throws ValidatorException {
        if (name == null || name.isEmpty()) {
            throw new ValidatorException("Fill in the field for name!");
        }
        if(name.matches("[0-9]")) {
            throw new ValidatorException("Name of the stadium must contain only letters!");
        }
        if (numberOfSeats == null || numberOfSeats.isEmpty()) {
            throw new ValidatorException("Fill in the field for number of seats!");
        }
        if (city == null || city.isEmpty()) {
            throw new ValidatorException("Fill in the field for city!");
        }
        if(numberOfSeats.matches("[a-zA-Z]+")) {
            throw new ValidatorException("Number of seats must contain only numbers!");
        }
        if(numberOfSeats.charAt(0) == '-') {
            throw new ValidatorException("Number of seats must be greater than 0!");
        }
    }

    @Override
    public void validateMatch(Tournament tournament, Player player1, Player player2, Stadium stadium) throws ValidatorException {
        if(tournament == null) {
            throw new ValidatorException("Tournament cannot be null, please choose a tournament!");
        }
        if(player1 == null) {
            throw new ValidatorException("Player one cannot be null, please choose player one!");
        }
        if(player2 == null) {
            throw new ValidatorException("Player two cannot be null, please choose player 2!");
        }
        if(stadium == null) {
            throw new ValidatorException("Stadium cannot be null, please choose a stadium!");
        }
    }

    @Override
    public void validateTournament(String name, String city, String beginningDate, String endingDate, String numberOfPlayers) throws ValidatorException {
        if (name == null || name.isEmpty()) {
            throw new ValidatorException("Fill in the field for name of the tournament!");
        }
        if (city == null || city.isEmpty()) {
            throw new ValidatorException("Fill in the field for city!");
        }
        if (numberOfPlayers == null || numberOfPlayers.isEmpty()) {
            throw new ValidatorException("Fill in the field for number of players!");
        }
        if (!(name.matches("[a-zA-Z]+")) && !name.contains(" ")) {
            throw new ValidatorException("The name entry field must contain only letters!");
        }
        if(beginningDate == null || beginningDate.isEmpty()) {
            throw new ValidatorException("The start date of the tournament cannot be empty!");
        }
        if(endingDate == null || endingDate.isEmpty()) {
            throw new ValidatorException("The end date of the tournament cannot be empty!");
        }
        if (numberOfPlayers.matches("[a-zA-Z]+")) {
            throw new ValidatorException("The number of players entry field must contain only numbers!");
        }
        if(numberOfPlayers.charAt(0) == '-') {
            throw new ValidatorException("The number of players must be greater than 0!");
        }
    }

    @Override
    public void validatePlayer(String firstName, String lastName, String state, String points, String height, String weight) throws ValidatorException {
        if (firstName == null || firstName.isEmpty()) {
            throw new ValidatorException("Fill in the field for firstname!");
        }
        if (lastName == null || lastName.isEmpty()) {
            throw new ValidatorException("Fill in the field for lastname!");
        }
        if (state == null || state.isEmpty()) {
            throw new ValidatorException("Fill in the field for state!");
        }
        if (points == null || points.isEmpty()) {
            throw new ValidatorException("Fill in the field for points!");
        }
        if (height == null || height.isEmpty()) {
            throw new ValidatorException("Fill in the field for height!");
        }
        if (weight == null || weight.isEmpty()) {
            throw new ValidatorException("Fill in the field for weight!");
        }
        if (!(firstName.matches("[a-zA-Z]+"))&&!(firstName.matches(" "))) {
            throw new ValidatorException("The firstname entry field must contain only letters!");
        }
        if (!(lastName.matches("[a-zA-Z]+"))&&!(lastName.matches(" "))) {
            throw new ValidatorException("The lastname entry field must contain only letters!");
        }
        if (!(state.matches("[a-zA-Z]+"))&&!(state.matches(" "))) {
            throw new ValidatorException("The state entry field must contain only letters!");
        }
        if(points.matches("[a-zA-Z]+")) {
            throw new ValidatorException("The points entry field must contain only numbers!");
        }
        if(points.charAt(0) == '-') {
            throw new ValidatorException("Points have to be greater than 0!");
        }
        if(height.matches("[a-zA-Z]+")) {
            throw new ValidatorException("The height entry field must contain only numbers!");
        }
        if(height.charAt(0) == '-') {
            throw new ValidatorException("Height has to be greater than 0!");
        }
        if(weight.matches("[a-zA-Z]+")) {
            throw new ValidatorException("The weight entry field must contain only numbers!");
        }
        if(weight.charAt(0) == '-') {
            throw new ValidatorException("Weight has to be greater than 0!");
        }
    }

    @Override
    public void validatePlayersStatistics(String aces, String doubleFaults, String winners, String netPointsWon, String unforcedErrors) throws ValidatorException {
        if (aces == null || aces.isEmpty()) {
            throw new ValidatorException("Fill in the field for number of aces!");
        }
        if(aces.matches("[a-zA-Z]+")) {
            throw new ValidatorException("Number of aces can contain only numbers!!");
        }
        if(aces.charAt(0) == '-') {
            throw new ValidatorException("Number of aces must be greater or equal to 0!");
        }
        if (doubleFaults == null || doubleFaults.isEmpty()) {
            throw new ValidatorException("Fill in the field for double faults!");
        }
        if(doubleFaults.matches("[a-zA-Z]+")) {
            throw new ValidatorException("Number of double faults can contain only numbers!!");
        }
        if(doubleFaults.charAt(0) == '-') {
            throw new ValidatorException("Number of double faults must be greater or equal to 0!");
        }
        if (winners == null || winners.isEmpty()) {
            throw new ValidatorException("Fill in the field for number of winners!");
        }
        if(winners.matches("[a-zA-Z]+")) {
            throw new ValidatorException("Number of winners can contain only numbers!!");
        }
        if(winners.charAt(0) == '-') {
            throw new ValidatorException("Number of winners must be greater or equal to 0!");
        }
        if (netPointsWon == null || netPointsWon.isEmpty()) {
            throw new ValidatorException("Fill in the field for number of net points won!");
        }
        if(netPointsWon.matches("[a-zA-Z]+")) {
            throw new ValidatorException("Number of net points won can contain only numbers!!");
        }
        if(netPointsWon.charAt(0) == '-') {
            throw new ValidatorException("Number of net points won must be greater or equal to 0!");
        }
        if (unforcedErrors == null || unforcedErrors.isEmpty()) {
            throw new ValidatorException("Fill in the field for number of net points won!");
        }
        if(unforcedErrors.matches("[a-zA-Z]+")) {
            throw new ValidatorException("Number of net points won can contain only numbers!!");
        }
        if(unforcedErrors.charAt(0) == '-') {
            throw new ValidatorException("Number of net points won must be greater or equal to 0!");
        }
    }

}
