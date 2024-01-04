package org.example;

public class TrueFalse extends Question{
    private Boolean isCorrect;

    public TrueFalse(String aquestion, Boolean aCorrect){
        super(aquestion);
        isCorrect = aCorrect;
    }

}
