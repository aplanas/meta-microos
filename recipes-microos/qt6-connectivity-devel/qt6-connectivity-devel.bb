SUMMARY = "Qt 6 connectivity libraries - Development files"
DESCRIPTION = "Development files for the Qt6 connectivity libraries."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-connectivity-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "9a7469c8e4485fc3044301540989e8c03ee8575000ce716c4b968e37a3224937d79cc9d6798c0e34cf187d3b615df4c44b2ee9c9f071850d2c2a9a4b4af7e222"

RPROVIDES:${PN} += "cmake(Qt6Bluetooth) cmake(Qt6Nfc) pkgconfig(Qt6Bluetooth) pkgconfig(Qt6Nfc) qt6-connectivity-devel qt6-connectivity-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6DBus) cmake(Qt6Network) libQt6Bluetooth6 libQt6Nfc6 pkgconfig(Qt6Core) pkgconfig(Qt6DBus) pkgconfig(Qt6Network) qt6-connectivity"

inherit rpm
