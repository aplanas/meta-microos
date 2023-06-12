SUMMARY = "Qt 6 SerialPort library - Development files"
DESCRIPTION = "Development files for the Qt 6 SerialPort library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-serialport-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "4d9859f5c7bf9a56e7d7f01e7061a69e6c8deab885e30e243d59b6163115db0c854a06ce8b385a8005b7cd2bef0a9670fccfea0d88f6bc2f99c5b51e5227c697"

RPROVIDES:${PN} += "cmake(Qt6SerialPort) pkgconfig(Qt6SerialPort) qt6-serialport-devel qt6-serialport-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Core) libQt6SerialPort6 pkgconfig(Qt6Core)"

inherit rpm
