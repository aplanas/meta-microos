SUMMARY = "Libyui - Header fles for the NCurses (text based) user interface"
DESCRIPTION = "This package contains the header files for the NCurses \
(text based) user interface component for libyui. \
 \
This package is not needed to develop libyui-based applications, \
only to develop extensions for libyui-ncurses."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.5.2"

RPM_NAME = "libyui-ncurses-devel-4.5.2-1.1.aarch64.rpm"
RPM_HASH = "61c5b1ca74e57d0d5975341fa5555f650ed33d145782dcbaa052408a62650ba1f759390e7dd29946be16d2196e3338df675cf25d9a6b96ac876dd4368ea8a756"

RPROVIDES:${PN} += "libyui-ncurses-devel libyui-ncurses-devel(aarch-64) pkgconfig(libyui-ncurses)"
RDEPENDS:${PN} += "/usr/bin/pkg-config boost-devel glibc-devel libstdc++-devel libyui-devel libyui-ncurses16 ncurses-devel"

inherit rpm
