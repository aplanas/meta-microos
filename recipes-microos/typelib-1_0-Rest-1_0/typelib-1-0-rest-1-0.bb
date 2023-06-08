SUMMARY = "Library to access RESTful web services -- Introspection bindings"
DESCRIPTION = "This library was designed to make it easier to access web services that \
claim to be 'RESTful'. A reasonable description is that a RESTful \
service should have urls that represent remote objects, which methods \
can then be called on. \
 \
This package provides the GObject Introspection bindings for librest."
LICENSE = "LGPL-2.1-only"

PV = "0.9.1"

RPM_NAME = "typelib-1_0-Rest-1_0-0.9.1-3.1.aarch64.rpm"
RPM_HASH = "c862b4eb987293aa0cb3ea37c4821a75b90a48ea640ed503842aeb638d8b2eb2213eeb20762917f2dbc0d87c230819ff6f5a2ec68b50db111374b76022f310d6"

RPROVIDES:${PN} += "typelib(Rest) typelib(RestExtras) typelib-1_0-Rest-1_0 typelib-1_0-Rest-1_0(aarch-64)"
RDEPENDS:${PN} += "librest-1.0.so.0()(64bit) librest-extras-1.0.so.0()(64bit) typelib(GLib) typelib(GObject) typelib(Gio) typelib(Soup)"

inherit rpm
