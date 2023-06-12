SUMMARY = "Development files for the Qt5 widgets library"
DESCRIPTION = "Development files for the Qt5 widgets library."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5Widgets-devel-5.15.9+kde154-1.2.aarch64.rpm"
RPM_HASH = "b7d8186a8e3edc991fee21e09ec74b0f9a8b49242bda2297202fbde54980ccc03932bfb69880fcb3791909d2650cde51a6700dd632e3fb5256819d1d972d7e32"

RPROVIDES:${PN} += "cmake(Qt5Widgets) libQt5Widgets-devel libQt5Widgets-devel(aarch-64) pkgconfig(Qt5Widgets)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libQt5Core-devel libQt5Gui-devel libQt5Widgets5 pkgconfig(Qt5Core) pkgconfig(Qt5Gui)"

inherit rpm
