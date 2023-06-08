SUMMARY = "Header files for the MATE Desktop Menu"
DESCRIPTION = "mate-menus contains the libmate-menu library, the layout configuration \
files for the MATE menu, as well as a simple menu editor. \
 \
The libmate-menu library implements the 'Desktop Menu Specification' \
from freedesktop.org."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.26.0"

RPM_NAME = "mate-menus-devel-1.26.0-1.8.aarch64.rpm"
RPM_HASH = "4aa2bcbd090cb7468fce6c33c8ed8355e138613ad70768c6364cd51cd1525d792497bf573ee7c2200ede83d0397a90adb74d40fe416c66e5d02a539bfd1ef889"

RPROVIDES:${PN} += "mate-menus-devel mate-menus-devel(aarch-64) pkgconfig(libmate-menu)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libmate-menu2 pkgconfig(gio-unix-2.0) pkgconfig(glib-2.0) typelib(MateMenu) typelib-1_0-MateMenu-2_0"

inherit rpm
