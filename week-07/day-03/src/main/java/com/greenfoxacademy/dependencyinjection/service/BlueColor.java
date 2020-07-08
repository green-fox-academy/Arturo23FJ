package com.greenfoxacademy.dependencyinjection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Qualifier("blueColor")
public class BlueColor implements MyColor{

    Printer printer;

    @Autowired
    public BlueColor(Printer printer){
        this.printer = printer;
    }

    @Override
    public void printColor() {
        printer.log("It is color in blue...");
    }
}
