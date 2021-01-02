package com.company;

public class Main {

    public static void main(String[] args) {
	    var ui = new UIControl(true);
	    var tb = new TextBox();
	    show(ui);
    }

    public static void show(UIControl control) {
        if (control instanceof TextBox) {
            var textBox = (TextBox)control;
            textBox.setText("Hello World");
        }
        System.out.println(control);
    }
}
