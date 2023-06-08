SUMMARY = "Introspection bindings for Evolution Data Server's Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package provides the GObject Introspection bindings for the \
libedataserver library."
LICENSE = "LGPL-2.0-only"

PV = "3.48.1"

RPM_NAME = "typelib-1_0-EDataServer-1_2-3.48.1-1.1.aarch64.rpm"
RPM_HASH = "e20c774a7dae9a584e2c8a449123f2b161ee7be8265d86f97f1956f69c8255cf20dd3df1e3377225bc744693e32c41933de4c5833d694689cf2d92ccbe0bf99b"

RPROVIDES:${PN} += "typelib(EDataServer) typelib-1_0-EDataServer-1_2 typelib-1_0-EDataServer-1_2(aarch-64)"
RDEPENDS:${PN} += "libcamel-1.2.so.64()(64bit) libedataserver-1.2.so.27()(64bit) typelib(Camel) typelib(GLib) typelib(GObject) typelib(Gio) typelib(Json) typelib(Soup) typelib(libxml2)"

inherit rpm
