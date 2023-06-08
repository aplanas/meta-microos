SUMMARY = "GObject-based library for the Telepathy D-Bus API -- Introspection bindings"
DESCRIPTION = "The telepathy-glib library is a GObject-based C binding for the \
Telepathy D-Bus API. \
 \
This package provides the GObject Introspection bindings for the \
telepathy-glib library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.24.2"

RPM_NAME = "typelib-1_0-TelepathyGlib-0_12-0.24.2-1.10.aarch64.rpm"
RPM_HASH = "088dd1fa3e316ffb40d74094bdf4ffc13dbef5ab243644601453135a0758a03edd2e687117b9e478586d50691600ef1376c3969d6af20a18d8b31a783db12254"

RPROVIDES:${PN} += "typelib(TelepathyGLib) typelib-1_0-TelepathyGlib-0_12 typelib-1_0-TelepathyGlib-0_12(aarch-64)"
RDEPENDS:${PN} += "libtelepathy-glib.so.0()(64bit) typelib(GLib) typelib(GObject) typelib(Gio)"

inherit rpm
