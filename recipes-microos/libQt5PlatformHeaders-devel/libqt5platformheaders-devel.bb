SUMMARY = "Qt 5 PlatformHeaders"
DESCRIPTION = "Qt 5 PlatformHeaders."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde151"

RPM_NAME = "libQt5PlatformHeaders-devel-5.15.9+kde151-1.1.aarch64.rpm"
RPM_HASH = "777c79c1e9a78371455c1dc6f5cb7bae568f4aa36d1878ac819055558e126a8ca7abbd65b4ebf5a53f5d6a812c389249626867284e95120a4023bb8a1ef4a150"

RPROVIDES:${PN} += "libQt5PlatformHeaders-devel libQt5PlatformHeaders-devel(aarch-64)"
RDEPENDS:${PN} += "Mesa-libGLESv3-devel libQt5Core-devel libQt5Gui-devel pkgconfig(egl) pkgconfig(glesv2) pkgconfig(x11)"

inherit rpm
