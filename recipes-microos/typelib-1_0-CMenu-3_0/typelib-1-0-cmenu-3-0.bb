SUMMARY = "Libcinnamon-menu API -- Introspection bindings"
DESCRIPTION = "cinnamon-menus is an implementation of the draft 'Desktop Menu \
Specification' from freedesktop.org. This package also contains \
the Cinnamon menu layout configuration files, .directory files and \
assorted menu related utility programs, Python bindings, and a \
simple menu editor. \
 \
This package provides the GObject Introspection bindings for \
cinnamon-menus."
LICENSE = "LGPL-2.1-or-later"

PV = "5.6.0"

RPM_NAME = "typelib-1_0-CMenu-3_0-5.6.0-1.3.aarch64.rpm"
RPM_HASH = "68b344a46d8efb0405a2763d9cf5ec109ec74668b2548b87cc2825596b1433f7a3460102b45eb9887bc46740d81c4f0266eb1e95ea77d173a6c6a55923359347"

RPROVIDES:${PN} += "typelib(CMenu) typelib-1_0-CMenu-3_0 typelib-1_0-CMenu-3_0(aarch-64) typelib-1_0-CinnamonMenu-3_0"
RDEPENDS:${PN} += "libcinnamon-menu-3.so.0()(64bit) typelib(GLib) typelib(GObject) typelib(Gio)"

inherit rpm
