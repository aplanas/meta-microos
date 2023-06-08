SUMMARY = "Introspection bindings for grilo"
DESCRIPTION = "Grilo is a framework for browsing and searching media content from \
various sources using a single API. \
 \
This package provides the GObject Introspection bindings for the \
libgrlnet library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.15"

RPM_NAME = "typelib-1_0-GrlNet-0_3-0.3.15-2.1.aarch64.rpm"
RPM_HASH = "10534b9da81f12c0d52b6ff6bd6e01fbfb9da4c72a135538c33212c26545873cd88e0e528c855115114a4910d97b1b1eb9e68e40ae8fa5c84072e1c17ce8e545"

RPROVIDES:${PN} += "typelib(GrlNet) typelib-1_0-GrlNet-0_3 typelib-1_0-GrlNet-0_3(aarch-64)"
RDEPENDS:${PN} += "libgrlnet-0.3.so.0()(64bit) typelib(GLib) typelib(GObject) typelib(Gio) typelib(Soup)"

inherit rpm
