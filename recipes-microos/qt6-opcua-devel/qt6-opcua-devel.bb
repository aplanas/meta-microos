SUMMARY = "Qt 6 OpcUa library - Development files"
DESCRIPTION = "Development files for the Qt 6 OpcUa library."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-opcua-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "996ff2ac73ed56882aaf35e2ff888d8fe81d1d7bdc7ee0872017582d2487b2994a063dd2464cc94c7011bf13146d7d572b9ec34437e33244710b4199e09341cc"

RPROVIDES:${PN} += "cmake(Qt6OpcUa) cmake(Qt6QOpen62541Plugin) pkgconfig(Qt6OpcUa) qt6-opcua-devel qt6-opcua-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Network) libQt6OpcUa6 pkgconfig(Qt6Core) pkgconfig(Qt6Network)"

inherit rpm
