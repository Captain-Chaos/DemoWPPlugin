package org.demo.wpplugin;

import java.io.IOException;
import java.util.Properties;

/**
 * Utility class for making the Maven project version number available to code.
 */
public class Version {
    private Version() {
        // Prevent instantiation
    }

    public static final String VERSION;

    static {
        Properties versionProps = new Properties();
        try {
            versionProps.load(Version.class.getResourceAsStream("/org.demo.wpplugin.properties"));
            VERSION = versionProps.getProperty("org.demo.wpplugin.version");
        } catch (IOException e) {
            throw new RuntimeException("I/O error loading version number from classpath", e);
        }
    }
}
