SUMMARY = "MATE Desktop Menu"
DESCRIPTION = "mate-menus contains the libmate-menu library, the layout \
configuration files for the MATE menu, as well as a simple menu \
editor. \
 \
The libmate-menu library implements the 'Desktop Menu Specification' \
from freedesktop.org."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.26.0"

RPM_NAME = "mate-menus-1.26.0-1.8.aarch64.rpm"
RPM_HASH = "53e6fc7fc5112acc49475e385da185fa346e7e9a21bc297e86455e9f59a9ae76c71bbbbd71b9b9d46aca1dbacc175c323c5b70e1f974f958b73a1971bd841b8b"

RPROVIDES:${PN} += "config(mate-menus) mate-menus mate-menus(aarch-64)"
RDEPENDS:${PN} += "mate-menus-branding"

inherit rpm
