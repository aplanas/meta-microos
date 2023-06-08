SUMMARY = "Introspection bindings for Evolution Data Server's Address Book Backend Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package provides the GObject Introspection bindings for the library \
for address book backends."
LICENSE = "LGPL-2.0-only"

PV = "3.48.1"

RPM_NAME = "typelib-1_0-EBook-1_2-3.48.1-1.1.aarch64.rpm"
RPM_HASH = "3efc837d04f179df2799e5a7836509118e548dd2dba1bd9bec275ca2d7916c9dd919e018f87998214ebdc3f9406cecd0850bab39661c310b24dfdbfd8dc69871"

RPROVIDES:${PN} += "typelib(EBook) typelib-1_0-EBook-1_2 typelib-1_0-EBook-1_2(aarch-64)"
RDEPENDS:${PN} += "libcamel-1.2.so.64()(64bit) libebook-1.2.so.21()(64bit) libebook-contacts-1.2.so.4()(64bit) libedata-book-1.2.so.27()(64bit) libedataserver-1.2.so.27()(64bit) typelib(Camel) typelib(EBookContacts) typelib(EDataServer) typelib(GLib) typelib(GObject) typelib(Gio) typelib(Json) typelib(Soup) typelib(libxml2)"

inherit rpm
