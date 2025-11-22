package com.example.zoo;

public interface Herbivore <T> {
    default void eatPlant (T plant){}
}
