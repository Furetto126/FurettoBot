package com.furetto126.furettobot.listeners;

import com.furetto126.furettobot.FunniSounds.PlayerManager;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.AudioChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.managers.AudioManager;

import javax.annotation.Nonnull;

public class FunniSFXListener extends ListenerAdapter{

    public void onMessageReceived(@Nonnull MessageReceivedEvent e) {

        String message = e.getMessage().getContentRaw();
        AudioChannel audioChannel = e.getMember().getVoiceState().getChannel();
        AudioManager audioManager = e.getGuild().getAudioManager();

        if (e.getAuthor().isBot()) {
            return;
        }
        if(message.equalsIgnoreCase("!join")){

            if (!e.getMember().getVoiceState().inAudioChannel()) {
                e.getChannel().sendMessage("You must be in a voice channel to use this command!").queue();
                return;
            }
            if (!e.getGuild().getSelfMember().hasPermission(audioChannel, Permission.VOICE_CONNECT)) {
                e.getChannel().sendMessage("I don't have permission to join voice channels!").queue();
                return;
            }

            audioManager.openAudioConnection(audioChannel);
        }
        else if (message.equalsIgnoreCase("!leave")) {
            if (audioChannel == null) {
                e.getChannel().sendMessage("I am not in a voice channel!").queue();
                return;
            }
            audioManager.closeAudioConnection();
        }
        //if (audioChannel != null){
            switch (message) {
                case "!boom" -> {
                    PlayerManager.getInstance().loadAndPlay(e.getTextChannel(), "https://youtu.be/829pvBHyG6I");
                }
                case "!rightback" -> {
                    PlayerManager.getInstance().loadAndPlay(e.getTextChannel(), "https://youtu.be/1C9h0_cIvLg");
                }
                case "!fart" -> {
                    PlayerManager.getInstance().loadAndPlay(e.getTextChannel(), "https://youtu.be/MBmb5_TTT-w");
                }
                case "!alarm" -> {
                    if(e.getAuthor().getName().equalsIgnoreCase("M.Arslan")){
                        e.getChannel().sendMessage("no u").queue();
                        break;
                    }
                    PlayerManager.getInstance().loadAndPlay(e.getTextChannel(), "https://youtu.be/8-pOCeuXhDM");
                }
                case "!omagaud" -> {
                    PlayerManager.getInstance().loadAndPlay(e.getTextChannel(), "https://youtu.be/uZbluITLgyg");
                }
                case "!bruh" -> {
                    PlayerManager.getInstance().loadAndPlay(e.getTextChannel(), "https://youtu.be/2ZIpFytCSVc");
                }
                case "!sans" -> {
                    PlayerManager.getInstance().loadAndPlay(e.getTextChannel(), "https://youtu.be/ZICTaBZ-m8A");
                }
                case "!bell" -> {
                    PlayerManager.getInstance().loadAndPlay(e.getTextChannel(), "https://youtu.be/umqA5IMx_2I");
                }
                case "!ojeez" -> {
                    PlayerManager.getInstance().loadAndPlay(e.getTextChannel(), "https://youtu.be/5AzT5nQh8bk");
                }
                case "!bonk" -> {
                    PlayerManager.getInstance().loadAndPlay(e.getTextChannel(), "https://youtu.be/gwxTZaa3NgI");
                }
                case "!oof" -> {
                    PlayerManager.getInstance().loadAndPlay(e.getTextChannel(), "https://youtu.be/f49ELvryhao");
                }
                case "!classic" -> {
                    PlayerManager.getInstance().loadAndPlay(e.getTextChannel(), "https://youtu.be/-omIk4tmtoI");
                }
                case "!aaaugh" -> {
                    PlayerManager.getInstance().loadAndPlay(e.getTextChannel(), "https://youtu.be/JHyrXjoXlMo");
                }
                case "!explosion" -> {
                    PlayerManager.getInstance().loadAndPlay(e.getTextChannel(), "https://youtu.be/o84vJH19toI");
                }
                case "!ayo" -> {
                    PlayerManager.getInstance().loadAndPlay(e.getTextChannel(), "https://youtu.be/nCuSNh58uCA");
                }
                case "!yessir" -> {
                    PlayerManager.getInstance().loadAndPlay(e.getTextChannel(), "https://youtu.be/7Rhb-1TmJOo");
                }
                case "!e" -> {
                    PlayerManager.getInstance().loadAndPlay(e.getTextChannel(), "https://youtu.be/4TbLqs92VKA");
                }
                case "!heheheha" -> {
                    PlayerManager.getInstance().loadAndPlay(e.getTextChannel(), "https://youtu.be/FOzBhKTOoLQ");
                }
                case "!boomspam" -> {
                    PlayerManager.getInstance().loadAndPlay(e.getTextChannel(), "https://youtu.be/RDyYluQuZRc");
                }
                case "!amogus" -> {
                    PlayerManager.getInstance().loadAndPlay(e.getTextChannel(), "https://youtu.be/4KfC923EFsY");
                }
                case "!sus" -> {
                    PlayerManager.getInstance().loadAndPlay(e.getTextChannel(), "https://youtu.be/ekL881PJMjI");
                }
                case "!mogusdrip" -> {
                    PlayerManager.getInstance().loadAndPlay(e.getTextChannel(), "https://www.youtube.com/watch?v=P8boOf5gQKg");
                }
                case "!watdadawgdoin"-> {
                    PlayerManager.getInstance().loadAndPlay(e.getTextChannel(), "https://youtu.be/SdmfidIYS84");
                }
                case "!yippe"-> {
                    PlayerManager.getInstance().loadAndPlay(e.getTextChannel(), "https://youtu.be/s0E5Slqdo1M");
                }
                case "!huh"-> {
                    PlayerManager.getInstance().loadAndPlay(e.getTextChannel(), "https://youtu.be/4kEO7VjKRB8");
                }
                case "!imded" -> {
                    PlayerManager.getInstance().loadAndPlay(e.getTextChannel(), "https://youtu.be/MC8QG4x3wvo");
                }
                case "!joebiden" -> {
                    PlayerManager.getInstance().loadAndPlay(e.getTextChannel(), "https://youtu.be/-GpzFY9jL88");
                }
                case "!bettercallsaul" -> {
                    PlayerManager.getInstance().loadAndPlay(e.getTextChannel(), "https://youtu.be/VV6446zo0V4");
                }
                case "!applause" -> {
                    PlayerManager.getInstance().loadAndPlay(e.getTextChannel(), "https://youtu.be/0mfJn604GT4");
                }
                case "!goofy" -> {
                    PlayerManager.getInstance().loadAndPlay(e.getTextChannel(), "https://youtu.be/JAW9y7mosq0");
                }
                case "!bass" -> {
                    PlayerManager.getInstance().loadAndPlay(e.getTextChannel(), "https://youtu.be/qPPF1j6bVlQ");
                }
                case "!youtried" -> {
                    PlayerManager.getInstance().loadAndPlay(e.getTextChannel(), "https://youtu.be/yaYW55UqbCQ");
                }
                case "!baller" -> {
                    PlayerManager.getInstance().loadAndPlay(e.getTextChannel(), "https://youtu.be/SYnlIyFmBYI");
                }
                case "!dahell" -> {
                    PlayerManager.getInstance().loadAndPlay(e.getTextChannel(), "https://youtu.be/KDvJZTrq8V8");
                }
                case "!higher" -> {
                    PlayerManager.getInstance().loadAndPlay(e.getTextChannel(), "https://youtu.be/m2QcRjscUn4");
                }
            }
        }
    }
//}
