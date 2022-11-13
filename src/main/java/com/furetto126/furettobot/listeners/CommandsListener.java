package com.furetto126.furettobot.listeners;

import com.furetto126.furettobot.FunniSounds.PlayerManager;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.AudioChannel;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.guild.GuildReadyEvent;
import net.dv8tion.jda.api.events.interaction.command.CommandAutoCompleteInteractionEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.interactions.commands.Command;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import net.dv8tion.jda.api.managers.AudioManager;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommandsListener extends ListenerAdapter {

    private String[] soundEffects = new String[]{"boom", "rightback", "fart", "alarm", "omagaud", "bruh", "sans", "bell", "bonk", "oof", "classic", "aaaugh", "explosion", "ayo", "yessir", "e", "heheheha", "boomspam", "amogus", "sus", "mogusdrip", "watdadawgdoin", "yippe", "huh", "imded", "joebiden", "bettercallsaul", "applause", "bass", "youtried", "baller", "dahell", "higher", "ping"};
    private String[] soundEffectsLinks = new String[]{"https://youtu.be/829pvBHyG6I", "https://youtu.be/1C9h0_cIvLg", "https://youtu.be/MBmb5_TTT-w", "https://youtu.be/8-pOCeuXhDM", "https://youtu.be/uZbluITLgyg", "https://youtu.be/2ZIpFytCSVc", "https://youtu.be/ZICTaBZ-m8A", "https://youtu.be/umqA5IMx_2I", "https://youtu.be/gwxTZaa3NgI", "https://youtu.be/f49ELvryhao", "https://youtu.be/-omIk4tmtoI", "https://youtu.be/JHyrXjoXlMo", "https://youtu.be/o84vJH19toI", "https://youtu.be/nCuSNh58uCA", "https://youtu.be/7Rhb-1TmJOo", "https://youtu.be/4TbLqs92VKA", "https://youtu.be/FOzBhKTOoLQ", "https://youtu.be/RDyYluQuZRc", "https://youtu.be/4KfC923EFsY", "https://youtu.be/ekL881PJMjI", "https://www.youtube.com/watch?v=P8boOf5gQKg", "https://youtu.be/SdmfidIYS84", "https://youtu.be/s0E5Slqdo1M", "https://youtu.be/4kEO7VjKRB8", "https://youtu.be/MC8QG4x3wvo", "https://youtu.be/-GpzFY9jL88", "https://youtu.be/VV6446zo0V4", "https://youtu.be/0mfJn604GT4", "https://youtu.be/qPPF1j6bVlQ", "https://youtu.be/yaYW55UqbCQ", "https://youtu.be/SYnlIyFmBYI", "https://youtu.be/KDvJZTrq8V8", "https://youtu.be/m2QcRjscUn4", "https://youtu.be/jiWj1zZlRjQ"};
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

    @Override
    public void onGuildReady(@NotNull GuildReadyEvent e){
        List<CommandData> commandData = new ArrayList<>();
        commandData.add(Commands.slash("join", "FurettoBot joins vc ASAP, like instant teleportation :O"));
        commandData.add(Commands.slash("leave", "Makes FurettoBot leave vc, why would you do that anyway?!"));
        commandData.add(Commands.slash("play", "Makes FurettoBot sing sfx (he praticed hard for this)")
                .addOption(OptionType.STRING, "effectname", "Choose the sound effect you want to play from our hand picked list sir", true, true));
        commandData.add(Commands.slash("playlink", "Makes FurettoBot play sounds from any link on his pianoguitarbassviolin™")
                .addOption(OptionType.STRING, "link", "Link to play", true, false));
        e.getGuild().updateCommands().addCommands(commandData).queue();
    }

    @Override
    public void onCommandAutoCompleteInteraction(CommandAutoCompleteInteractionEvent e){

        if (e.getName().equals("play") && e.getFocusedOption().getName().equals("effectname")){
            List<Command.Choice> options = Stream.of(soundEffects)
                    .filter(soundEffects -> soundEffects.startsWith(e.getFocusedOption().getValue()))
                    .map(soundEffects -> new Command.Choice(soundEffects, soundEffects))
                    .collect(Collectors.toList());
            e.replyChoices(options).queue();
        }
    }

    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent e){

        String command = e.getName();
        AudioChannel audioChannel = e.getMember().getVoiceState().getChannel();
        AudioManager audioManager = e.getGuild().getAudioManager();

        if (command.equalsIgnoreCase("join")) {
            if (!e.getMember().getVoiceState().inAudioChannel()) {
                e.reply("You must be in a voice channel to use this command! *bozo*").queue();
                return;
            }
            else if (!e.getGuild().getSelfMember().hasPermission(audioChannel, Permission.VOICE_CONNECT)) {
                e.reply("I don't have permissions to join voice channels! Ask an Admin to fix it or Furetto126 cuz he dumb").queue();
                return;
            }else {
                audioManager.openAudioConnection(audioChannel);
                e.reply("Joined! :D").queue();
            }
        }
        else if (command.equalsIgnoreCase("leave")) {
               if (e.getGuild().getSelfMember().getVoiceState().inAudioChannel()){
                   audioManager.closeAudioConnection();
               }else{
                   e.reply("I'm not in a voice channel! *Psst...do /join first :smirk:*").queue();
                   return;
            }
        }
        else if (command.equalsIgnoreCase("play")) {
            if (!e.getGuild().getSelfMember().getVoiceState().inAudioChannel()){
                e.reply("I'm not in a voice channel! * Psst...do /join first :smirk: *").queue();
            }else {
                int i = 0;
                boolean foundMatch = false;
                for (String sfxName : soundEffects) {
                    if (e.getOption("effectname").getAsString().equalsIgnoreCase(sfxName)){
                        foundMatch = true;
                        break;
                    }else {
                        i++;
                    }
                }
                if (foundMatch){
                    e.reply("Queued " + soundEffects[i]).setEphemeral(true).queue();
                    PlayerManager.getInstance().loadAndPlay(e.getTextChannel(), soundEffectsLinks[i]);
                }
            }
        }
        else if (command.equalsIgnoreCase("playlink")) {
            if (!e.getGuild().getSelfMember().getVoiceState().inAudioChannel()){
                e.reply("I'm not in a voice channel! * Psst...do /join first :smirk: *").queue();
            }else{
                e.deferReply();
                try {
                    URL url = new URL(e.getOption("link").getAsString());
                    URLConnection conn = url.openConnection();
                    conn.connect();
                    PlayerManager.getInstance().loadAndPlay(e.getTextChannel(), e.getOption("link").getAsString());
                    e.reply("Playing...").queue();
                } catch (MalformedURLException ex) {
                    e.reply("This is not a valid url bozo").setEphemeral(true).queue();
                } catch (IOException ex) {
                    e.reply("could not connect to this url wtf").setEphemeral(true).queue();
                }

            }
        }
    }
}
