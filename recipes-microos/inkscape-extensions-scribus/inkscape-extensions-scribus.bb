SUMMARY = "Scribus extensions for Inkscape"
DESCRIPTION = "The Scribus-based PDF export extension for Inkscape. \
 \
Inkscape is a vector graphics editor."
LICENSE = "GPL-3.0-only"

PV = "1.2.2"

RPM_NAME = "inkscape-extensions-scribus-1.2.2-2.3.aarch64.rpm"
RPM_HASH = "c8fa5acadebd3ca6705cc513a2bc860c354e013da70cf3e0a11d663c943de113d9f49fb9f6c9b7636d1cea5c8c25798648ea0d4f07feca5da7d5ecbd86123ce6"

RPROVIDES:${PN} += "inkscape-extensions-scribus inkscape-extensions-scribus(aarch-64)"
RDEPENDS:${PN} += "inkscape inkscape-extensions-extra scribus"

inherit rpm
