package com.example.zoo;

public interface Carnivore <T>{
     default void eatMeat(T meat){}

}
