SUMMARY = "Introspection bindings for the libical glib bindings."
DESCRIPTION = "This package provides the gobject-introspection bindings for libical-glib."
LICENSE = "LGPL-2.1-only | MPL-2.0"

PV = "3.0.16"

RPM_NAME = "typelib-1_0-ICalGLib-3_0-3.0.16-1.3.aarch64.rpm"
RPM_HASH = "7fbd56c12414fe8a2dc3dd267539c3040693d576b2daed020418611ffad6ae6c11d5710e725c67c478102a2a62663468e20aaf4e5c17333b2d904d78ada22ae5"

RPROVIDES:${PN} += "typelib(ICalGLib) typelib-1_0-ICalGLib-3_0 typelib-1_0-ICalGLib-3_0(aarch-64)"
RDEPENDS:${PN} += "libical-glib.so.3()(64bit) typelib(GLib) typelib(GObject)"

inherit rpm
