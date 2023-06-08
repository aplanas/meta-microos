SUMMARY = "Introspection bindings for the MATE Desktop Menu"
DESCRIPTION = "The libmate-menu library implements the 'Desktop Menu Specification' \
from freedesktop.org."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.26.0"

RPM_NAME = "typelib-1_0-MateMenu-2_0-1.26.0-1.8.aarch64.rpm"
RPM_HASH = "3337e22fb7818b0b46b709087e3a3c35698378b34e5019c290df9a00a6821b7edca22e8c49161301a9717633f75434512e729acd2e5ec3009a3c5603eb14675f"

RPROVIDES:${PN} += "typelib(MateMenu) typelib-1_0-MateMenu-2_0 typelib-1_0-MateMenu-2_0(aarch-64)"
RDEPENDS:${PN} += "libmate-menu.so.2()(64bit) typelib(GLib) typelib(GObject) typelib(Gio)"

inherit rpm
