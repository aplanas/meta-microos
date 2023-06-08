SUMMARY = "Qt 6 SerialBus library - Development files"
DESCRIPTION = "Development files for the Qt 6 SerialBus library."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-serialbus-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "a51d9dcb936ef19123e18190be8df985a66a8ed352ca548fa254558e04453c68a04916e4df312ebdd18fd1bd03de18cab58108a6847dbe4b3c7a51ac3dcda337"

RPROVIDES:${PN} += "cmake(Qt6SerialBus) pkgconfig(Qt6SerialBus) qt6-serialbus-devel qt6-serialbus-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Network) cmake(Qt6SerialPort) libQt6SerialBus6 pkgconfig(Qt6Core) pkgconfig(Qt6Network) pkgconfig(Qt6SerialPort) qt6-serialbus"

inherit rpm
