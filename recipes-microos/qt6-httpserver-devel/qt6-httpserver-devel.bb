SUMMARY = "Qt 6 HttpServer library - Development files"
DESCRIPTION = "Development files for the Qt 6 HttpServer library."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-httpserver-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "81453213efbe9906b220ced9bca350c6a8e969fbf7199115ca19007517cfc8c92e0217f2962622c4b022754f4e997413dc3222f1986cd982d7d26122d9b2d34b"

RPROVIDES:${PN} += "cmake(Qt6HttpServer) pkgconfig(Qt6HttpServer) qt6-httpserver-devel qt6-httpserver-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Concurrent) cmake(Qt6Network) cmake(Qt6WebSockets) libQt6HttpServer6 pkgconfig(Qt6Core) pkgconfig(Qt6Network) pkgconfig(Qt6WebSockets)"

inherit rpm
