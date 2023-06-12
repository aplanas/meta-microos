SUMMARY = "Qt 6 HttpServer library - Development files"
DESCRIPTION = "Development files for the Qt 6 HttpServer library."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-httpserver-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "d571afc5e4dce092f1674f942e49bb958b00761ba3b01cda6092f97ea1b64813adfe16ff9ad361fdc376bef1924d9d29ce6a171b4cb2cf7db7a02a65725c42cf"

RPROVIDES:${PN} += "cmake(Qt6HttpServer) \
pkgconfig(Qt6HttpServer) \
qt6-httpserver-devel \
qt6-httpserver-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Concurrent) \
cmake(Qt6Network) \
cmake(Qt6WebSockets) \
libQt6HttpServer6 \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Network) \
pkgconfig(Qt6WebSockets)"

inherit rpm
