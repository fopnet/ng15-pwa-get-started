package br.mp.mprj;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import org.cef.browser.CefBrowser;
import org.panda_lang.pandomium.Pandomium;
import org.panda_lang.pandomium.wrapper.PandomiumClient;

public class App {

    public static void main(String[] args) {
        Pandomium pandomium = Pandomium.buildDefault();
        PandomiumClient client = pandomium.createClient();
        CefBrowser browser = client.loadURL("http://google.com");

        JFrame frame = new JFrame();
        frame.getContentPane().add(browser.getUIComponent(), BorderLayout.CENTER);

        frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setTitle("Pandomium");
        frame.setSize(1720, 840);
        frame.setVisible(true);

        // For background tasks:
        PandomiumClient offscreenClient = Pandomium.buildDefault().createOffscreenClient();
        offscreenClient.loadURL("http://google.com");
    }

}