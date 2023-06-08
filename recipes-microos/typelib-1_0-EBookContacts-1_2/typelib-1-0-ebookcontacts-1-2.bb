SUMMARY = "Introspection bindings for Evolution Data Server's Address Book Backend Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package provides the GObject Introspection bindings for the library \
for address book backends."
LICENSE = "LGPL-2.0-only"

PV = "3.48.1"

RPM_NAME = "typelib-1_0-EBookContacts-1_2-3.48.1-1.1.aarch64.rpm"
RPM_HASH = "120563e780be6e5815fb15d89c968ef0bce6caf3223fdf6a53db473fb8d37e32fe3987a70fef718adeec01d29fcea68d58100b00f443d3fce6552153078dc100"

RPROVIDES:${PN} += "typelib(EBookContacts) typelib-1_0-EBookContacts-1_2 typelib-1_0-EBookContacts-1_2(aarch-64)"
RDEPENDS:${PN} += "libebook-contacts-1.2.so.4()(64bit) libedataserver-1.2.so.27()(64bit) typelib(Camel) typelib(EDataServer) typelib(GLib) typelib(GObject) typelib(Gio) typelib(Json) typelib(Soup) typelib(libxml2)"

inherit rpm
