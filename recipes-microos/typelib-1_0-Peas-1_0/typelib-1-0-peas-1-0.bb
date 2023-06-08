SUMMARY = "Introspection bindings for libpeas, a GObject-based plugin engine"
DESCRIPTION = "libpeas is a gobject-based plugin engine, and is targetted at giving \
every application the chance to assume its own extensibility. \
 \
This package provides the GObject Introspection bindings for the libpeas \
library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.36.0"

RPM_NAME = "typelib-1_0-Peas-1_0-1.36.0-1.1.aarch64.rpm"
RPM_HASH = "9179f09af90f8450002575f130261d89f9f478d22a6ddd5c9e7287a65ec59adbf263d5d3ad5dd3ae8d787693d6683cf5391d00aece7c773bae33547b3092b5b0"

RPROVIDES:${PN} += "typelib(Peas) typelib-1_0-Peas-1_0 typelib-1_0-Peas-1_0(aarch-64)"
RDEPENDS:${PN} += "libpeas-1.0.so.0()(64bit) typelib(GIRepository) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gio)"

inherit rpm
