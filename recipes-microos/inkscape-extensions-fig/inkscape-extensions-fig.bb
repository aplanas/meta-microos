SUMMARY = "Fig import extensions for Inkscape"
DESCRIPTION = "Fig family (XFig, Figurine, JFig, WinFig,...) import extension for \
Inkscape. \
 \
Inkscape is a vector graphics editor."
LICENSE = "GPL-3.0-only"

PV = "1.2.2"

RPM_NAME = "inkscape-extensions-fig-1.2.2-2.3.aarch64.rpm"
RPM_HASH = "0f48a5bb466950cd9dc253df4f1e5bfb705e3617cfbcbe69c61de459ecfe5e25e14709602f04f12184e269a5fcff0f62bb47639edd466ceaba50107d18f28cc1"

RPROVIDES:${PN} += "inkscape-extensions-fig inkscape-extensions-fig(aarch-64)"
RDEPENDS:${PN} += "inkscape inkscape-extensions-extra transfig"

inherit rpm
