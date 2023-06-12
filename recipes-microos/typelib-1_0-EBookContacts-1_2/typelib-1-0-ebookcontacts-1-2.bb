SUMMARY = "Introspection bindings for Evolution Data Server's Address Book Backend Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package provides the GObject Introspection bindings for the library \
for address book backends."
LICENSE = "LGPL-2.0-only"

PV = "3.48.2"

RPM_NAME = "typelib-1_0-EBookContacts-1_2-3.48.2-1.1.aarch64.rpm"
RPM_HASH = "5d4140d919a88e13224c068d54792ee3ccf56bee8995e54a126c2c49ead95f5dcd905b7fd05dfe396e842605f681698eb0012dfdf697769b491198c9835d1b53"

RPROVIDES:${PN} += "typelib(EBookContacts) \
typelib-1_0-EBookContacts-1_2 \
typelib-1_0-EBookContacts-1_2(aarch-64)"
RDEPENDS:${PN} += "libebook-contacts-1.2.so.4()(64bit) \
libedataserver-1.2.so.27()(64bit) \
typelib(Camel) \
typelib(EDataServer) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio) \
typelib(Json) \
typelib(Soup) \
typelib(libxml2)"

inherit rpm
