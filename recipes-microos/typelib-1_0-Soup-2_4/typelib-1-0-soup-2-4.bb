SUMMARY = "HTTP client/server library for GNOME -- Introspection bindings"
DESCRIPTION = "Libsoup is an HTTP client/server library for GNOME. It uses GObjects \
and the glib main loop, to integrate well with GNOME applications. \
 \
This package provides the GObject Introspection bindings for libsoup."
LICENSE = "LGPL-2.1-or-later"

PV = "2.74.3"

RPM_NAME = "typelib-1_0-Soup-2_4-2.74.3-1.3.aarch64.rpm"
RPM_HASH = "878cde90426872acf2a14d8f1b979f28a9d2d7e51bf37a89398220d689c9adae0217489ba2ee58a799f9b8b7a8b721eba146573145f746cc6dcf2a2c04f1a5db"

RPROVIDES:${PN} += "typelib(Soup) \
typelib(SoupGNOME) \
typelib-1_0-Soup-2_4 \
typelib-1_0-Soup-2_4(aarch-64)"
RDEPENDS:${PN} += "libsoup-2.4.so.1()(64bit) \
libsoup-gnome-2.4.so.1()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio)"

inherit rpm
