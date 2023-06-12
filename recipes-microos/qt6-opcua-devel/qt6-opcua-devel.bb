SUMMARY = "Qt 6 OpcUa library - Development files"
DESCRIPTION = "Development files for the Qt 6 OpcUa library."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-opcua-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "aba64c454ac44bce92d08b6094dcec130e7685d7e085a6d5bea532a5d0249f990fa6fcc1e8ec8b33843b925b45095f830d6b1b111658ec3bb86aff6ce6e1284a"

RPROVIDES:${PN} += "cmake(Qt6OpcUa) \
cmake(Qt6QOpen62541Plugin) \
pkgconfig(Qt6OpcUa) \
qt6-opcua-devel \
qt6-opcua-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Network) \
libQt6OpcUa6 \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Network)"

inherit rpm
