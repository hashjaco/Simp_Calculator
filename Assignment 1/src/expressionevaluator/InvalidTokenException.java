package expressionevaluator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hjaco
 */
public class InvalidTokenException extends Exception {
    public InvalidTokenException(String message){
        super(message);
    }
    public InvalidTokenException(String message, Throwable throwable){
        super(message,throwable);
    }
}
