SUMMARY = "File Manager for the GNOME Desktop -- Introspection bindings"
DESCRIPTION = "Nautilus is the file manager for the GNOME desktop. \
 \
This package provides the GObject Introspection bindings for the library \
used by nautilus extensions."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "44.1"

RPM_NAME = "typelib-1_0-Nautilus-4_0-44.1-1.1.aarch64.rpm"
RPM_HASH = "0bb20b7a965ad825b25991873e931f7e042e7cc00cdc904afbd2ba2cbd18c1a86f72a962a4c6a72ce460e6756d3e958e72dc8699bf5cbe931d7cf74fb0283580"

RPROVIDES:${PN} += "typelib(Nautilus) typelib-1_0-Nautilus-4_0 typelib-1_0-Nautilus-4_0(aarch-64)"
RDEPENDS:${PN} += "libnautilus-extension.so.4()(64bit) typelib(GLib) typelib(GObject) typelib(Gio)"

inherit rpm
