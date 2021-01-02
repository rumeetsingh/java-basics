package com.company;

public class TextBox extends UIControl {

    private String text = "";

    public void setText(String text) {
        this.text = text;
    }

    public TextBox() {
        super(true);
        System.out.println("TextBox");
    }

    @Override
    public String toString() {
        return text;
    }

    @Override
    public void printSomething() {
        System.out.println("Print in TextBox");
    }
}
