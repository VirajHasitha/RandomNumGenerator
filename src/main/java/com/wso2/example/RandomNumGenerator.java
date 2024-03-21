package com.wso2.example;

import org.apache.synapse.MessageContext;
import org.apache.synapse.mediators.AbstractMediator;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.util.Random;

public class RandomNumGenerator extends AbstractMediator {

    private static final Log log = LogFactory.getLog(RandomNumGenerator.class);

    public boolean mediate(MessageContext messageContext) {

        Random rand = new Random();
        int randInt = rand.nextInt(10000); // Generates a random number between 0 and 9999
        messageContext.setProperty("generatedRandomNumber", randInt);
        return true;
    }
}
