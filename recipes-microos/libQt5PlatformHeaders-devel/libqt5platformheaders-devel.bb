SUMMARY = "Qt 5 PlatformHeaders"
DESCRIPTION = "Qt 5 PlatformHeaders."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5PlatformHeaders-devel-5.15.9+kde154-1.2.aarch64.rpm"
RPM_HASH = "045937914da39a636f5f6754133e6289e901a612dd4fe665912273c658177836d6aee836ad9c591d2bfdf3cc69fb596c301ef9222c284d19133df56330fdcacb"

RPROVIDES:${PN} += "libQt5PlatformHeaders-devel libQt5PlatformHeaders-devel(aarch-64)"
RDEPENDS:${PN} += "Mesa-libGLESv3-devel libQt5Core-devel libQt5Gui-devel pkgconfig(egl) pkgconfig(glesv2) pkgconfig(x11)"

inherit rpm
