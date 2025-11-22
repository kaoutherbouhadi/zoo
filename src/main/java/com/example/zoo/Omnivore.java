package com.example.zoo;

public interface Omnivore <T>{
    default void eatPlantAndMeet(T food){};
}
