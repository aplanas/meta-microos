SUMMARY = "Introspection bindings for Evolution Data Server's Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop."
LICENSE = "LGPL-2.0-only"

PV = "3.48.1"

RPM_NAME = "typelib-1_0-EBackend-1_2-3.48.1-1.1.aarch64.rpm"
RPM_HASH = "56a4cb21d2ac7cc6babd4869a4941f7cd057baba56a977c1f83606285a789c59d86abbafd44ec2eb28f9b3975f976690226a2041e0c555577c72312763d33c94"

RPROVIDES:${PN} += "typelib(EBackend) typelib-1_0-EBackend-1_2 typelib-1_0-EBackend-1_2(aarch-64)"
RDEPENDS:${PN} += "libcamel-1.2.so.64()(64bit) libebackend-1.2.so.11()(64bit) libedataserver-1.2.so.27()(64bit) typelib(Camel) typelib(EDataServer) typelib(GLib) typelib(GObject) typelib(Gio) typelib(Json) typelib(Soup) typelib(libxml2)"

inherit rpm
