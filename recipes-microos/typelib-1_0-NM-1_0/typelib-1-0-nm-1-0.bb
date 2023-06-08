SUMMARY = "Introspection bindings for the NetworkManager client convenience library"
DESCRIPTION = "This package contains the gi-bindings that make it easier to use some \
Network Manager functionality from applications that use glib. \
 \
This package provides the GObject Introspection bindings for the \
NetworkManager library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.42.6"

RPM_NAME = "typelib-1_0-NM-1_0-1.42.6-1.1.aarch64.rpm"
RPM_HASH = "d32b4bb60d1d0130dcae2d1def38594cd99031f194c8e2623e273448d2ac636e44911de0a71d6c1cf58120da6607f6337ebd62359ba7773024a017ea5638ca08"

RPROVIDES:${PN} += "typelib(NM) typelib-1_0-NM-1_0 typelib-1_0-NM-1_0(aarch-64)"
RDEPENDS:${PN} += "libnm.so.0()(64bit) typelib(GLib) typelib(GObject) typelib(Gio)"

inherit rpm
