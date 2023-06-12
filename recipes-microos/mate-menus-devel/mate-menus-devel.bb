SUMMARY = "Header files for the MATE Desktop Menu"
DESCRIPTION = "mate-menus contains the libmate-menu library, the layout configuration \
files for the MATE menu, as well as a simple menu editor. \
 \
The libmate-menu library implements the 'Desktop Menu Specification' \
from freedesktop.org."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.26.1"

RPM_NAME = "mate-menus-devel-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "4e6c4f92d2438662258f9621ead83b4ff34fa812ff5483d552a5740ae869e97acc4772d59f6099bc1c5afb99e0f514a00decf1f1842ce400945fe5ea879a3963"

RPROVIDES:${PN} += "mate-menus-devel \
mate-menus-devel(aarch-64) \
pkgconfig(libmate-menu)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmate-menu2 \
pkgconfig(gio-unix-2.0) \
pkgconfig(glib-2.0) \
typelib(MateMenu) \
typelib-1_0-MateMenu-2_0"

inherit rpm
