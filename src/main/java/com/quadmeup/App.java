package com.quadmeup;

import java.io.File;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        MyCsvReader reader = new MyCsvReader();
        reader.read(new File("src/main/resources/data.csv"));
    }
}
