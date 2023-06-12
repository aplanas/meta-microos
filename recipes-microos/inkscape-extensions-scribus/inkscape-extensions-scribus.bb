SUMMARY = "Scribus extensions for Inkscape"
DESCRIPTION = "The Scribus-based PDF export extension for Inkscape. \
 \
Inkscape is a vector graphics editor."
LICENSE = "GPL-3.0-only"

PV = "1.2.2"

RPM_NAME = "inkscape-extensions-scribus-1.2.2-3.1.aarch64.rpm"
RPM_HASH = "85c7c9388310047638e367a5c9a821f7e8b0e8a19409876c8ce208905748541876c46d78de9e51d3c43bf4bd91122c3aa6edba768b4840eb5f638a5ccade2941"

RPROVIDES:${PN} += "inkscape-extensions-scribus inkscape-extensions-scribus(aarch-64)"
RDEPENDS:${PN} += "inkscape inkscape-extensions-extra scribus"

inherit rpm
