SUMMARY = "Introspection bindings for Evolution Data Server's Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package provides the GObject Introspection bindings for the \
libedataserver library."
LICENSE = "LGPL-2.0-only"

PV = "3.48.1"

RPM_NAME = "typelib-1_0-EDataServerUI-1_2-3.48.1-1.1.aarch64.rpm"
RPM_HASH = "a2c75b51ff557e31c68bc1849f10ec305dda8fa6a8b71eaaee56becd2003ea6516a859608055a9220b3eceb9bebc9b00436b5f2fbd932042d2766e04e5a63fc6"

RPROVIDES:${PN} += "typelib(EDataServerUI) typelib-1_0-EDataServerUI-1_2 typelib-1_0-EDataServerUI-1_2(aarch-64)"
RDEPENDS:${PN} += "libcamel-1.2.so.64()(64bit) libecal-2.0.so.2()(64bit) libedataserver-1.2.so.27()(64bit) libedataserverui-1.2.so.4()(64bit) typelib(Atk) typelib(Camel) typelib(ECal) typelib(EDataServer) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(HarfBuzz) typelib(ICalGLib) typelib(Json) typelib(Pango) typelib(Soup) typelib(cairo) typelib(freetype2) typelib(libxml2) typelib(xlib)"

inherit rpm
