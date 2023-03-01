package com.important.my.notes.generics;

public class Box<T> {

    /**
     * The type parameters naming conventions are important to learn generics thoroughly.
     * The common type parameters are as follows:
     * T – Type
     * E – Element
     * K – Key
     * N – Number
     * V – Value
     */
    private T typeData;

    public void setTypeData(T typeData) {
        this.typeData = typeData;
    }

    public T getTypeData() {
        return typeData;
    }

    @Override
    public String toString() {
        return "Box{" +
                "typeData=" + typeData +
                '}';
    }
}
