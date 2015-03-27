/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.shafin.corpusgrabber.helper;

import java.awt.Component;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author SHAFIN
 */
public class FilerChooserHelper {
    
    public String getFilePathNameFromChooser(Component component){
        // display file dialog, so user can choose file or directory to open
        JFileChooser fileChose = new JFileChooser();
        fileChose.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        int result = fileChose.showOpenDialog(component);

        // if user clicked Cancel button on dialog, return
        if (result == JFileChooser.CANCEL_OPTION)
        {
            return null;
        }

        File fileName = fileChose.getSelectedFile(); // get File

        // display error if invalid
        if ((fileName == null) || (fileName.getName().equals("")))
        {
            JOptionPane.showMessageDialog(component, "Invalid Name",
                    "Invalid Name", JOptionPane.ERROR_MESSAGE);
        }
       return fileName.toString();

        //this.selectedPath.setText(pathName);
    }
}
