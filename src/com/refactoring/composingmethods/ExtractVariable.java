package com.refactoring.composingmethods;

public class ExtractVariable {
    String platform;
    String browser;
    int resize;

    /////// Problem ///////

    /**
     * You have an expression that’s hard to understand.
     */
    void renderBannerV1() {
        if (
            (platform.toUpperCase().contains("MAC")) &&
            (browser.toUpperCase().contains("IE")) &&
            wasInitialized() && resize > 0
        ) {
            // do something
        }
    }

    /////// Solution ///////

    /**
     * Place the result of the expression or its parts in separate variables that are self-explanatory.
     */
    void renderBannerV2() {
        final boolean isMacOs = platform.toUpperCase().contains("MAC");
        final boolean isIE = browser.toUpperCase().contains("IE");
        final boolean wasResized = resize > 0;

        if (isMacOs && isIE && wasInitialized() && wasResized) {
            // do something
        }
    }

    /////////////////////

    boolean wasInitialized() {
        return true;
    }
}
