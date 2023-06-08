SUMMARY = "Introspection bindings for Evolution Data Server's Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop."
LICENSE = "LGPL-2.0-only"

PV = "3.48.1"

RPM_NAME = "typelib-1_0-EDataCal-2_0-3.48.1-1.1.aarch64.rpm"
RPM_HASH = "f3bfbb126e7b6dcdd1c09e80320c46cd7b25cef6756439dce91b3514c0b68b9e2be2ff394e8cf8a895c7e7b5aedd1e863f8b008ad8a0ccd97470574f1e646d42"

RPROVIDES:${PN} += "typelib(EDataCal) typelib-1_0-EDataCal-2_0 typelib-1_0-EDataCal-2_0(aarch-64)"
RDEPENDS:${PN} += "libebackend-1.2.so.11()(64bit) libecal-2.0.so.2()(64bit) libedata-cal-2.0.so.2()(64bit) libedataserver-1.2.so.27()(64bit) typelib(Camel) typelib(EBackend) typelib(ECal) typelib(EDataServer) typelib(GLib) typelib(GObject) typelib(Gio) typelib(ICalGLib) typelib(Json) typelib(Soup) typelib(libxml2)"

inherit rpm
