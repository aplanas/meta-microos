SUMMARY = "Libyui - Header files for the Qt graph widget"
DESCRIPTION = "This package contains the header files for the Qt graph component \
for libyui."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.5.2"

RPM_NAME = "libyui-qt-graph-devel-4.5.2-1.1.aarch64.rpm"
RPM_HASH = "31f9cb8045a7e032938653a1019162980b90a4c878def494cc744d9b4a1b8b7f8a91fc4f3217914c8dda8f25a90599b0f41a77153f656a3301433caa63b8a8bd"

RPROVIDES:${PN} += "libyui-qt-graph-devel libyui-qt-graph-devel(aarch-64)"
RDEPENDS:${PN} += "libyui-qt-devel libyui-qt-graph16"

inherit rpm
