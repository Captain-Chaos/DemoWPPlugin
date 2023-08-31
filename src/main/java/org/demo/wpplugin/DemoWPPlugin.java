package org.demo.wpplugin;

import org.demo.wpplugin.operations.DemoOperation;
import org.pepsoft.worldpainter.operations.Operation;
import org.pepsoft.worldpainter.plugins.AbstractPlugin;
import org.pepsoft.worldpainter.plugins.OperationProvider;

import java.util.List;

import static java.util.Collections.singletonList;
import static org.demo.wpplugin.Version.VERSION;

/**
 * The main plugin class. This version just demoes providing a new operation (tool). You can implement other interfaces,
 * or provide more plugin classes, to provide other functionality.
 *
 * <p><strong>Note:</strong> this class is referred to from the {@code org.pepsoft.worldpainter.plugins} file, so when
 * you rename or copy it, be sure to keep that file up-to-date.
 */
@SuppressWarnings("unused") // Instantiated by WorldPainter
public class DemoWPPlugin extends AbstractPlugin implements OperationProvider {
    /**
     * The plugin class must have a default (public, no arguments) constructor.
     */
    public DemoWPPlugin() {
        super(NAME, VERSION);
    }

    // OperationProvider

    @Override
    public List<Operation> getOperations() {
        return OPERATIONS;
    }

    /**
     * Short, human-readble name of the plugin.
     */
    static final String NAME = "Demo WP Plugin";

    private static final List<Operation> OPERATIONS = singletonList(new DemoOperation());
}
