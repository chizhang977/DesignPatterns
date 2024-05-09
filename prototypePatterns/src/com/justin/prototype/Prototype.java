package com.justin.prototype;

public interface Prototype extends Cloneable{
    Prototype clone() throws CloneNotSupportedException;
}
