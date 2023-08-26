package org.demo.wpplugin.operations;

import org.pepsoft.worldpainter.Dimension;
import org.pepsoft.worldpainter.WorldPainterView;
import org.pepsoft.worldpainter.operations.AbstractGlobalOperation;

import javax.swing.*;
import java.awt.*;

public class DemoGlobalOperation extends AbstractGlobalOperation {
    public DemoGlobalOperation() {
        super(NAME, DESCRIPTION);
    }

    @Override
    public void invoke() {
        final Dimension dimension = view.getDimension();
        final Window parent = SwingUtilities.getWindowAncestor(view);
        final DemoGlobalOperationDialog dialog = new DemoGlobalOperationDialog(parent, dimension);
        dialog.setVisible(true);
    }

    @Override
    public void setView(WorldPainterView view) {
        this.view = view;
    }

    private WorldPainterView view;

    /**
     * Human-readable short name of the operation.
     */
    static final String NAME = "Demo Global Operation";

    /**
     * Human-readable description of the operation. This is used e.g. in the tooltip of the operation button.
     */
    static final String DESCRIPTION = "A demonstration of creating a custom global operation for WorldPainter";
}