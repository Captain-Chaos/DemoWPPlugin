package org.demo.wpplugin;

import org.demo.wpplugin.layers.DemoLayer;
import org.pepsoft.worldpainter.layers.Layer;
import org.pepsoft.worldpainter.plugins.AbstractPlugin;
import org.pepsoft.worldpainter.plugins.LayerProvider;

import java.util.List;

import static java.util.Collections.singletonList;
import static org.demo.wpplugin.Version.VERSION;

/**
 * The main plugin class. This version just demoes providing a new simple layer. You can implement other interfaces, or
 * provide more plugin classes, to provide other functionality.
 *
 * <p><strong>Note:</strong> this class is referred to from the {@code org.pepsoft.worldpainter.plugins} file, so when
 * you rename or copy it, be sure to keep that file up-to-date.
 */
@SuppressWarnings("unused") // Instantiated by WorldPainter
public class DemoWPPlugin extends AbstractPlugin implements LayerProvider {
    /**
     * The plugin class must have a default (public, no arguments) constructor.
     */
    public DemoWPPlugin() {
        super(NAME, VERSION);
    }

    // LayerProvider

    /**
     * Get the list of custom {@link Layer}s provided by this plugin.
     */
    @Override
    public List<Layer> getLayers() {
        return LAYERS;
    }

    /**
     * Short, human-readble name of the plugin.
     */
    static final String NAME = "Demo WP Plugin";

    private static final List<Layer> LAYERS = singletonList(DemoLayer.INSTANCE);
}
