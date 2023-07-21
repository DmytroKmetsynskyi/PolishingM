package com.fernfog.iconify.fonts;

import com.fernfog.iconify.Icon;
import com.fernfog.iconify.IconFontDescriptor;

public class FontAwesomeModule implements IconFontDescriptor {

    @Override
    public String ttfFileName() {
        return "iconify/android-iconify-fontawesome.ttf";
    }

    @Override
    public Icon[] characters() {
        return FontAwesomeIcons.values();
    }
}
