package org.psi.ms.swing;

import org.psi.ms.xml.MzDataWriter;

import javax.swing.*;
import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * User: lbower
 * Date: Sep 17, 2003
 * Time: 4:31:57 PM
 * To change this template use Options | File Templates.
 */
public class OutputTypePanel extends JPanel {

    //MzDataWriter.OutputType.

    JRadioButton oBase64Button;
    JRadioButton oXMLButton;

    public OutputTypePanel() {
        prepareFields();
        layoutPanel();
    }

    private void layoutPanel() {
        this.setLayout(new FlowLayout(FlowLayout.LEFT));

        this.add(oBase64Button);
        this.add(oXMLButton);

    }

    private void prepareFields() {
        oBase64Button = new JRadioButton("Base 64");
        oXMLButton = new JRadioButton("XML");
        oBase64Button.setFont(MainPanel.FONT);
        oXMLButton.setFont(MainPanel.FONT);
        oBase64Button.setSize(oBase64Button.getPreferredSize().width,10);
        oXMLButton.setSize(oXMLButton.getPreferredSize().width,10);

        ButtonGroup oGroup = new ButtonGroup();
        oGroup.add(oBase64Button);
        oGroup.add(oXMLButton);

        oBase64Button.setSelected(true);
    }

    MzDataWriter.OutputType getOutputType() {
        if (oBase64Button.isSelected()) {
            return MzDataWriter.OutputType.BASE64;
        } else {
            return MzDataWriter.OutputType.XML;
        }
    }

    public static void main(String[] args) {
        JFrame oFrame = new JFrame();
        oFrame.getContentPane().add(new OutputTypePanel());
        oFrame.setSize(300, 300);
        oFrame.setVisible(true);

    }
}
