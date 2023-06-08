SUMMARY = "Introspection bindings for Evolution Data Server's Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop."
LICENSE = "LGPL-2.0-only"

PV = "3.48.1"

RPM_NAME = "typelib-1_0-ECal-2_0-3.48.1-1.1.aarch64.rpm"
RPM_HASH = "77fe6bb9fb1aae8d10386b44cab9bf4b2c8804bb71594296f6aff653d6e0fc7da2ce96ebf1ce1c8cd91456fb5455bddf76e9396d5e6f814b375810adb5cfd449"

RPROVIDES:${PN} += "typelib(ECal) typelib-1_0-ECal-2_0 typelib-1_0-ECal-2_0(aarch-64)"
RDEPENDS:${PN} += "libecal-2.0.so.2()(64bit) typelib(Camel) typelib(EDataServer) typelib(GLib) typelib(GObject) typelib(Gio) typelib(ICalGLib) typelib(Json) typelib(Soup) typelib(libxml2)"

inherit rpm
