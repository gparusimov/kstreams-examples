package ru.curs.windows;

import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.virtual.DefaultVirtualTerminal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class ScreenBuilder {

    @Bean
    public Screen getScreen() throws IOException {
        DefaultVirtualTerminal defaultVirtualTerminal = new DefaultVirtualTerminal();
        Screen r = new TerminalScreen(defaultVirtualTerminal);
        return r;
    }
}