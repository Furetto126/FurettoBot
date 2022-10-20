package com.furetto126.furettobot.listeners;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class CommandsListener extends ListenerAdapter {

    public void onMessageReceived(@Nonnull MessageReceivedEvent e) {
        char prefix = '!';
        String messageSent = e.getMessage().getContentRaw();

        if (!e.isFromGuild()) {
            return;
        } else {
            if (messageSent.equalsIgnoreCase(prefix + "panic")) {
                e.getChannel().sendMessage("OH HELP PANIC HELP AHHHHHHH HELP HELP HELP FRICK AAAAAAAAAAAAA\nIM NOT READY FOR THIS HELP PANIC AAAAAAAAAAAAAAAAAAAAAAAAA HELP AAAAAAAAAA\nIM DYING HELP PANIC").queue();
            }
            if (messageSent.equalsIgnoreCase(prefix + "coinFlip")) {
                int min = 1;
                int max = 10;
                if ((int) (Math.random() * (max - min + 1) + min) <= 5) {
                    e.getChannel().sendMessage("coin flipped on head!").queue();
                } else {
                    e.getChannel().sendMessage("coin flipped on tails!").queue();
                }
            }
        }
        if (messageSent.equalsIgnoreCase("uwu")) {
            int min = 1;
            int max = 10;
            if ((int) (Math.random() * (max - min + 1) + min) <= 5) {
                e.getChannel().sendMessage("Cringe").queue();
            } else if ((int) (Math.random() * (max - min + 1) + min) > 5 && (int) (Math.random() * (max - min + 1) + min) != 10) {
                e.getChannel().sendMessage("smh").queue();
            } else {
                e.getChannel().sendMessage("owo").queue();
            }
        }
        if (messageSent.equalsIgnoreCase("sus")) {
            int min = 1;
            int max = 20;
            if ((int) (Math.random() * (max - min + 1) + min) == 1) {
                e.getChannel().sendMessage("It's over " + e.getAuthor().getName() + ". \nIt isn't funny anymore.").queue();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                e.getChannel().sendMessage("I did it once, but it became old").queue();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                e.getChannel().sendMessage(e.getAuthor().getName() + ", stop trying to be funny or what you think you are by sending \"sus\" over and over again.").queue();
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                e.getChannel().sendMessage("Just").queue();
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                e.getChannel().sendMessage("stop").queue();
            } else {
                e.getChannel().sendMessage("Amogus :O").queue();
            }
        }
        if (messageSent.equalsIgnoreCase("science")) {
            int min = 1;
            int max = 2;
            if ((int) (Math.random() * (max - min + 1) + min) == 1) {
                e.getChannel().sendMessage("In chemistry, notation which properly means 'power (in the mathematical sense, ie exponent) of hydrogen (symbol H)'; it is used to indicate the quantity that measures the acidity or basicity of an aqueous solution, expressed by the decimal cologarithm of the concentration (or, more properly, of the activity) of hydrogen ions. Therefore: pH = −log [H +]. This analytical relationship derives from the ponziometric technique (introduced by S.P.L. Sörensen in 1909) with which the first accurate measurements of the concentration of hydrogen ions were made, for which the measured value of the potential is a function of the logarithm of the concentrations. In pure water and neutral solutions, in which the concentration of hydrogen ions is equal to that of hydroxide ions, from the ionic product of water [H +] [OH -] = 10−14 we have that [H +] = 10− 7; consequently the pH is equal to 7, while in acid solutions, in which [H +]> 10−7, the pH is lower than 7 and in basic ones higher than 7. For example, in a solution of hydrochloric acid 10− 3 N, strong acid, completely dissociated, corresponds to a pH equal to 3. The pH of a solution can be approximated using indicators or, more precisely, using a type of potentiometer (pH-meter) normally with a scale graduated directly in values \u200B\u200Bof pH.").queue();
            } else {
                e.getChannel().sendMessage("The pH determines many characteristics of the structure and activity of macromolecules (enzymes, proteins, DNA) and directly influences respiration, kidney activity, erythrocyte function, etc. Vital activities are compatible only with minimal changes in pH of intra- and extracellular biological fluids (see fig.). These fluids possess particular systems, called buffer systems (➔ buffer), which operate by attenuating abrupt changes in pH due to metabolic or respiratory alterations, or direct contact with acids and bases. A clear example is the blood, whose pH value (in healthy individuals) is strictly maintained at 7.4 by various buffer systems; when this value is lower we say that the organism is in a state of acidosis, when it is higher we speak of alkalosis. The pH influences enzymatic reactions (➔ enzyme).").queue();
            }
        }
        if (messageSent.contains("amogus")) {
            e.getChannel().sendMessage("https://cdn.discordapp.com/attachments/965269865508274278/974389899153256498/IMG_20220512_202526.jpg").queue();
        }
    }
}
