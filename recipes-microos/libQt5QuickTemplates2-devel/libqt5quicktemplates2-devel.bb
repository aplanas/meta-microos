SUMMARY = "Qt Development Kit"
DESCRIPTION = "You need this package if you want to compile programs with qtquickcontrols2."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde5"

RPM_NAME = "libQt5QuickTemplates2-devel-5.15.9+kde5-1.1.aarch64.rpm"
RPM_HASH = "9f3f75340342f9f1cb89f8bc22d3c35e559e742f6c9ec6723c56eeb9025ee8b827e6497dd125e911e9125dc712d44fb46db85db5a416b0ef8d2b8d4de5c5012f"

RPROVIDES:${PN} += "cmake(Qt5QuickTemplates2) libQt5QuickTemplates2-devel libQt5QuickTemplates2-devel(aarch-64) pkgconfig(Qt5QuickTemplates2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libQt5QuickTemplates2-5 pkgconfig(Qt5Core) pkgconfig(Qt5Gui) pkgconfig(Qt5QmlModels) pkgconfig(Qt5Quick)"

inherit rpm
