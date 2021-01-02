package com.company;

public class UIControl {
    private boolean isEnabled = true;

    public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
        System.out.println("UIControl");
    }

    public void printSomething() {
        System.out.println("Print in UIControl");
    }
}
