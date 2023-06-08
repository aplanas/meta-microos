SUMMARY = "Qt 6 connectivity libraries - Development files"
DESCRIPTION = "Development files for the Qt6 connectivity libraries."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-connectivity-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "67355b4d111ff0e46c9b8b7b105203e4d20c0c298ceed9523505df0fc00d5dc556b01ff314a9b82295f66c5bab4377781a9a30add1e59f0aa980619e75439da4"

RPROVIDES:${PN} += "cmake(Qt6Bluetooth) cmake(Qt6Nfc) pkgconfig(Qt6Bluetooth) pkgconfig(Qt6Nfc) qt6-connectivity-devel qt6-connectivity-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6DBus) cmake(Qt6Network) libQt6Bluetooth6 libQt6Nfc6 pkgconfig(Qt6Core) pkgconfig(Qt6DBus) pkgconfig(Qt6Network) qt6-connectivity"

inherit rpm
