package org.demo.wpplugin.operations;

import org.pepsoft.worldpainter.Dimension;
import org.pepsoft.worldpainter.WorldPainterDialog;

import javax.swing.*;
import java.awt.*;

import static java.awt.BorderLayout.CENTER;

public class DemoGlobalOperationDialog extends WorldPainterDialog {
    public DemoGlobalOperationDialog(Window parent, Dimension dimension) {
        super(parent);
        setTitle("Demo Global Operation");
        getContentPane().add(new JLabel("Dimension name: " + dimension.getName()), CENTER);
        scaleToUI();
        pack();
        setLocationRelativeTo(parent);
    }
}