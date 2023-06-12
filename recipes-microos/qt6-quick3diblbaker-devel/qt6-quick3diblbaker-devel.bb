SUMMARY = "Qt6 Quick3DIblBaker library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DIblBaker library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3diblbaker-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "196bb2c56a20bce249aa762a94ddf6b4d53d82641a6cebe1dfc0c93ea1249009b7e4b5106aa6a35325d2763572a5e7f2617c1d183f939b9ff781325a589dcb7d"

RPROVIDES:${PN} += "cmake(Qt6Quick3DIblBaker) \
pkgconfig(Qt6Quick3DIblBaker) \
qt6-quick3diblbaker-devel \
qt6-quick3diblbaker-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Quick3DRuntimeRender) \
libQt6Quick3DIblBaker6 \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Gui) \
pkgconfig(Qt6Quick) \
pkgconfig(Qt6Quick3DRuntimeRender)"

inherit rpm
