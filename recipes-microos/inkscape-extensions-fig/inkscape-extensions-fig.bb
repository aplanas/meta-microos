SUMMARY = "Fig import extensions for Inkscape"
DESCRIPTION = "Fig family (XFig, Figurine, JFig, WinFig,...) import extension for \
Inkscape. \
 \
Inkscape is a vector graphics editor."
LICENSE = "GPL-3.0-only"

PV = "1.2.2"

RPM_NAME = "inkscape-extensions-fig-1.2.2-3.1.aarch64.rpm"
RPM_HASH = "bc3cef6c4030324894a8be07fafc98c667b9dc1f579da2e5db59fa122f1d79d12bee538eec136311c4ff14626804da3e66092e3668f7dba15cbd985c6462263f"

RPROVIDES:${PN} += "inkscape-extensions-fig inkscape-extensions-fig(aarch-64)"
RDEPENDS:${PN} += "inkscape inkscape-extensions-extra transfig"

inherit rpm
