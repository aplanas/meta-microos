SUMMARY = "GIMP extensions for Inkscape"
DESCRIPTION = "The GIMP import and export extensions for Inkscape. \
 \
Inkscape is a vector graphics editor."
LICENSE = "GPL-3.0-only"

PV = "1.2.2"

RPM_NAME = "inkscape-extensions-gimp-1.2.2-2.3.aarch64.rpm"
RPM_HASH = "78e14f2c01472aaa41eb20fb5fe1e052eee1a7c106fa0842f37fe84a44fb9e138aa19571fe61102e5de9d1cc2d36526615a1e23f701471c4623805c0a2fbdcb9"

RPROVIDES:${PN} += "inkscape-extensions-gimp inkscape-extensions-gimp(aarch-64)"
RDEPENDS:${PN} += "gimp inkscape inkscape-extensions-extra"

inherit rpm
