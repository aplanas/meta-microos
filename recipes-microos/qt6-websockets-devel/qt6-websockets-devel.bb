SUMMARY = "Qt 6 WebSockets library - Development files"
DESCRIPTION = "Development files for the Qt 6 WebSockets library"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-websockets-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "267ec281f4a170a420bd828655ab31662fb0782224ec98880882aacb2e471c6022b5238c3393387e6e4f3f37ae9feb92d39f6963517d652b306da98525a8cb4c"

RPROVIDES:${PN} += "cmake(Qt6WebSockets) pkgconfig(Qt6WebSockets) qt6-websockets-devel qt6-websockets-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Network) libQt6WebSockets6 pkgconfig(Qt6Core) pkgconfig(Qt6Network)"

inherit rpm
