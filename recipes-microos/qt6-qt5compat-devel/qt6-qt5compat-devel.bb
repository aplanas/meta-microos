SUMMARY = "Qt 6 Core 5 Compat library - Development files"
DESCRIPTION = "Development files for the Qt 6 Core 5 Compat library"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-qt5compat-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "3a28168d1f3c0697f05c02cf8ad65d793daaea2aed7865fb361c198b4b2d4c4a57d44f7a6fe04c2385fc73e1b290bf43e2e26313502861347c891a1c856db6a4"

RPROVIDES:${PN} += "cmake(Qt6Core5Compat) pkgconfig(Qt6Core5Compat) qt6-qt5compat-devel qt6-qt5compat-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libQt6Core5Compat6 pkgconfig(Qt6Core) qt6-core-private-devel"

inherit rpm
