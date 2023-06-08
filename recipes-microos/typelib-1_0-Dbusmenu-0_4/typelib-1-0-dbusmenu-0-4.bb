SUMMARY = "Introspection bindings for libdbusmenu-glib4"
DESCRIPTION = "This package contains the GObject Introspection bindings for the dbusmenu \
library."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "typelib-1_0-Dbusmenu-0_4-16.04.0-9.3.aarch64.rpm"
RPM_HASH = "3aff629f34fae93eed505de79369f2e198e2a220eb048daa7268a9d19e68599a8427ab7f459c77347a78d00d419fa9e654fa2ac64dc0150245eb892cf5afba7b"

RPROVIDES:${PN} += "typelib(Dbusmenu) typelib-1_0-Dbusmenu-0_4 typelib-1_0-Dbusmenu-0_4(aarch-64)"
RDEPENDS:${PN} += "libdbusmenu-glib.so.4()(64bit) typelib(GLib) typelib(GObject)"

inherit rpm
