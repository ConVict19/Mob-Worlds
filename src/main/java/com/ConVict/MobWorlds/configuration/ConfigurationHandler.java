package com.ConVict.MobWorlds.configuration;


import net.minecraftforge.common.config.Configuration;
import java.io.File;

public class ConfigurationHandler{

    public static void init(File configFile)
    {
        //Create the config object from the given configuration file
        Configuration configuration = new Configuration(configFile);

        try
        {
            //Load
            configuration.load();

            //Read any values

        }
        catch (Exception e)
        {
            //1log the exception
        }
        finally
        {
            //Save the file
            configuration.save();
        }
    }
}
