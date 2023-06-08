SUMMARY = "Qt6 Quick3DIblBaker library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DIblBaker library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-quick3diblbaker-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "4af4ee7d884f3c49a4951d51c9d355e6c6b1a03f92862a9e24f0c29628d8fc31d090206ec39bc95ab912ce65227fdcc503a80464e94063d8a61c4d65b9e327b1"

RPROVIDES:${PN} += "cmake(Qt6Quick3DIblBaker) pkgconfig(Qt6Quick3DIblBaker) qt6-quick3diblbaker-devel qt6-quick3diblbaker-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Quick3DRuntimeRender) libQt6Quick3DIblBaker6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Quick) pkgconfig(Qt6Quick3DRuntimeRender)"

inherit rpm
