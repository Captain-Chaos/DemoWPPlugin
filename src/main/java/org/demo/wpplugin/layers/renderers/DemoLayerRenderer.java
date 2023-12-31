package org.demo.wpplugin.layers.renderers;

import org.pepsoft.worldpainter.ColourScheme;
import org.pepsoft.worldpainter.Dimension;
import org.pepsoft.worldpainter.layers.Layer;
import org.pepsoft.worldpainter.layers.renderers.*;

/**
 * The renderer is responsible for painting the layer in the editor view. There are various implementations provided,
 * or you can implement your own. Note that the renderer has to be of a type corresponding to the data size of the
 * layer (so it must implement {@link BitLayerRenderer}, {@link NibbleLayerRenderer} or {@link ByteLayerRenderer}.
 *
 * <p>The {@link Layer} by default finds the renderer by looking for a class in the {@code renderer} subpackage and with
 * the word {@code Renderer} appended to its own class name. In that case the renderer must have a default (public, no
 * arguments) constructor. You could also override the {@link Layer#getRenderer()} method if you want to do something
 * more complicated.
 *
 * <p>This demo uses the simplest provided implementation to create a very simple solid colour-based renderer. Another
 * provided implementation you could look at is {@link ColouredPatternRenderer}, which allows you to specify a simple
 * pattern.
 *
 * <p>There are also decorator interfaces the renderer can implement if it needs more information:
 * {@link DimensionAwareRenderer} to get access to the {@link Dimension} that is being rendered, and
 * {@link ColourSchemeRenderer} to get access to the current WorldPainter {@link ColourScheme}.
 */
@SuppressWarnings("unused") // Instantiated by the Layer class
public class DemoLayerRenderer extends TransparentColourRenderer {
    public DemoLayerRenderer() {
        super(0xFF0000); // Colour in 24-bit RGB format
    }
}