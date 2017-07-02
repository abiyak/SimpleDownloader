package SimpleDownloader;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class GuiEngine implements ActionListener{

    private URL url;
    private FileOutputStream fOut;
    private InputStream in;
    private BufferedReader bOutStream;
    private Gui gui;
    private String strURL;


    public GuiEngine(Gui gui) {
        this.gui = gui;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        strURL = gui.getUrl();
        System.out.println(strURL = gui.getUrl());
        try {

            url = new URL(strURL);
            URLConnection urlConnection = url.openConnection();
            fOut = new FileOutputStream("/home/andrey/FileDownload.mp3");
            in = urlConnection.getInputStream();
            bOutStream = new BufferedReader(new InputStreamReader(in));

            int data;

            while ((data = in.read()) != -1){
                fOut.write(data);
            }

        }catch(Exception e){
            System.out.println("Что-то пошло не так");
            e.printStackTrace();
        }
        finally {
            System.out.println("The file " + strURL +  " has been downloaded successfully as home directory.");

                try {
                    bOutStream.close();
                    fOut.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

        }
    }

}
