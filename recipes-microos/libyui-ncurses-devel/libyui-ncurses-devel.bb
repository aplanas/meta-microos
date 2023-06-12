SUMMARY = "Libyui - Header fles for the NCurses (text based) user interface"
DESCRIPTION = "This package contains the header files for the NCurses \
(text based) user interface component for libyui. \
 \
This package is not needed to develop libyui-based applications, \
only to develop extensions for libyui-ncurses."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.6.0"

RPM_NAME = "libyui-ncurses-devel-4.6.0-1.1.aarch64.rpm"
RPM_HASH = "dd8ebd0f679b6cfa2df21c31d04c3d3fa11393db6f4187f07532000da5bb4b6942a9bdc6ce65b7a4272ae07565d481f4f16b1e9262df52819fc705993f51ad3d"

RPROVIDES:${PN} += "libyui-ncurses-devel libyui-ncurses-devel(aarch-64) pkgconfig(libyui-ncurses)"
RDEPENDS:${PN} += "/usr/bin/pkg-config boost-devel glibc-devel libstdc++-devel libyui-devel libyui-ncurses16 ncurses-devel"

inherit rpm
