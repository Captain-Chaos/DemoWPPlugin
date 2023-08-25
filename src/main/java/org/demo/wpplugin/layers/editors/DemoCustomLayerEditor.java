package org.demo.wpplugin.layers.editors;

import org.demo.wpplugin.layers.DemoCustomLayer;
import org.demo.wpplugin.layers.DemoCustomLayerSettings;
import org.pepsoft.worldpainter.Platform;
import org.pepsoft.worldpainter.layers.AbstractLayerEditor;
import org.pepsoft.worldpainter.layers.exporters.ExporterSettings;

public class DemoCustomLayerEditor extends AbstractLayerEditor<DemoCustomLayer> {
    public DemoCustomLayerEditor(Platform platform) {
        this.platform = platform;
    }

    @Override
    public DemoCustomLayer createLayer() {
        return new DemoCustomLayer();
    }

    @Override
    public void commit() {
        // Write the configuration currently selected by the user to the layer
    }

    @Override
    public void reset() {
        // Reset the UI to the values currently in the layer
    }

    @Override
    public ExporterSettings getSettings() {
        return new DemoCustomLayerSettings(layer);
    }

    @Override
    public boolean isCommitAvailable() {
        // Check whether the configuration currently selected by the user is valid and could be written to the layer
        return true;
    }

    private final Platform platform;
}