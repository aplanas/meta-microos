SUMMARY = "Libyui - Header files for the Qt graph widget"
DESCRIPTION = "This package contains the header files for the Qt graph component \
for libyui."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.6.0"

RPM_NAME = "libyui-qt-graph-devel-4.6.0-1.1.aarch64.rpm"
RPM_HASH = "2509fcd69a4e6f99edc6e65f7f9718fc9a1665628557f82b16e5234380ec460afc3b666a4c39ef79c5f11131eeb6bf5c32528f2f3a5566ee8bb99f7171bc32fb"

RPROVIDES:${PN} += "libyui-qt-graph-devel libyui-qt-graph-devel(aarch-64)"
RDEPENDS:${PN} += "libyui-qt-devel libyui-qt-graph16"

inherit rpm
