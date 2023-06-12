SUMMARY = "Introspection bindings for Evolution Data Server's Messaging Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package provides the GObject Introspection bindings for library for messaging."
LICENSE = "LGPL-2.0-only"

PV = "3.48.2"

RPM_NAME = "typelib-1_0-Camel-1_2-3.48.2-1.1.aarch64.rpm"
RPM_HASH = "ccead835a4a96a90c6f00c969f521dc0624fccdf5997eea1e5b583bafc4a977556a562d73dfaa643c1bc6bac951108d7fa89cf6aeac2221a0120613496202f3e"

RPROVIDES:${PN} += "typelib(Camel) \
typelib-1_0-Camel-1_2 \
typelib-1_0-Camel-1_2(aarch-64)"
RDEPENDS:${PN} += "libcamel-1.2.so.64()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio) \
typelib(libxml2)"

inherit rpm
