SUMMARY = "Introspection bindings for Evolution Data Server's Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop."
LICENSE = "LGPL-2.0-only"

PV = "3.48.1"

RPM_NAME = "typelib-1_0-EDataBook-1_2-3.48.1-1.1.aarch64.rpm"
RPM_HASH = "8efbb542e444412b8cffe77c9740b0d66441811dc768a86368bf55d7e964f8d6c5ed3b1d51dd5b75a24ccbd4427dc729aa2c7ba1751f80cf45526ae59a924b9b"

RPROVIDES:${PN} += "typelib(EDataBook) typelib-1_0-EDataBook-1_2 typelib-1_0-EDataBook-1_2(aarch-64)"
RDEPENDS:${PN} += "libcamel-1.2.so.64()(64bit) libebook-contacts-1.2.so.4()(64bit) libedata-book-1.2.so.27()(64bit) libedataserver-1.2.so.27()(64bit) typelib(Camel) typelib(EBackend) typelib(EBookContacts) typelib(EDataServer) typelib(GLib) typelib(GObject) typelib(Gio) typelib(Json) typelib(Soup) typelib(libxml2)"

inherit rpm
